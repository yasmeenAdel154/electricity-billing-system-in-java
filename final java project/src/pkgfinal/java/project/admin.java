package pkgfinal.java.project;

import java.sql.*;
import java.util.*;
import static pkgfinal.java.project.FinalJavaProject.*;

public class admin extends customer {

    ArrayList<String> complains = new ArrayList<>();

    public void add() {

        NewCustomer n = new NewCustomer();
        n.addFromConsole();
    }

    public void diaplayAllBillsOfSpecificRegion() {

        System.out.print("Please Enter The Region You Want : ");
        String region = input.nextLine();
        System.out.println("\t---------------------------------");
        System.out.println("\t\tAll Bills Of " + region + "");
        System.out.println("\t----------------------------------");
        System.out.printf("%-20s%-20s%-20s%-20s\n\n", "User Name", "Meter Code", "Bill", "Date Of Last Payment");
        for (int i = 0; i < numberOfCustomers; i++) {
            if (region.equals(arr.get(i).region)) {
                System.out.printf("%-20s%-20s%-20s%-20s\n", arr.get(i).userName,
                        arr.get(i).meterCode, arr.get(i).bill, "" + arr.get(i).day + " / "
                        + arr.get(i).month + " / " + arr.get(i).year);
            }
        }

    }

    public void updateGui(int meterCode, String userName, int pas, String region, String contract, int bill) {

        int index = indexOfMeterCode(meterCode);
        arr.get(index).userName = userName;
        arr.get(index).bill = bill;
        arr.get(index).contract = contract;
        arr.get(index).password = pas;
        arr.get(index).region = region;

        try {
            query = "update customer set userName = '" + userName + "', password = '"
                    + pas + "' ,region = '" + region + "' ,contract = '" + contract
                    + "' ,bill ='" + bill + "' where meterCode =" + meterCode;
            ss.execute(query);
            System.out.println("updated values");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void deleteGui(int meterCode) {

        int index = indexOfMeterCode(meterCode);
        try {
            query = "delete from customer where metercode ='" + meterCode + "'  ";
            ss.execute(query);
            System.out.println("deleted done");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        arr.remove(index);
        numberOfCustomers--;

    }

    public void delete() {
        //ibrahem mky

        int metercodeD;
        System.out.println("please enter the metercode that you want to delete : ");
        metercodeD = input.nextInt();
        int index = indexOfMeterCode(metercodeD);
        try {
            query = "delete from customer where metercode ='" + metercodeD + "'  ";
            ss.execute(query);
            System.out.println("deleted done");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        arr.remove(index);
        numberOfCustomers--;
    }

    public void update() {
        //ibrahem mky
        int metercodeR, billR = 0, passwordR = 0;
        String usernameR = "", contractR = "", regionR = "", queryR = "";
        System.out.println("please enter the metercode that you want to update his values");
        metercodeR = input.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (metercodeR == arr.get(i).meterCode) {
                System.out.println("please enter the username :");
                input.nextLine();
                usernameR = input.nextLine();
                arr.get(i).userName = usernameR;

                System.out.println("please enter the password :");
                passwordR = input.nextInt();
                arr.get(i).password = passwordR;

                System.out.println("please enter the region :");
                input.nextLine();
                regionR = input.nextLine();
                arr.get(i).region = regionR;

                System.out.println("please enter the contract :");
                contractR = input.nextLine();
                arr.get(i).contract = contractR;

                System.out.println("please enter the bill :");
                billR = input.nextInt();
                arr.get(i).bill = billR;

                input.nextLine();
                break;
            }
        }
        try {
            query = "update customer set userName = '" + usernameR + "', password = '"
                    + passwordR + "' ,region = '" + regionR + "' ,contract = '" + contractR
                    + "' ,bill ='" + billR + "' where meterCode =" + metercodeR;
            ss.execute(query);
            System.out.println("updated values");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    double totalCollected() {
        double sum = 0;
        for (int i = 0; i < numberOfCustomers; i++) {
            sum = sum + (arr.get(i).bill) * 1.45;
        }
        System.out.println("\t--------------------------------------------------");
        System.out.println("\t\tthe total collect is : " + sum);
        System.out.println("\t--------------------------------------------------");
        return sum;
    }

    public void viewStatistics() {
        double sum = 0;
        double sumAllRegions = 0, result;
        String regionV;
        System.out.print("please enter the region : ");
        regionV = input.nextLine();

        result = viewStatisticsOfSpecifecRegionGui(regionV) ;
        System.out.println("the total consumption for the " + regionV + " is " + result + "%");

    }
    public double viewStatisticsOfSpecifecRegionGui( String regionV){
        double sum = 0;
        double sumAllRegions = 0, result;
      
        for (int i = 0; i < arr.size(); i++) {
            sumAllRegions += arr.get(i).bill;
            if (regionV.equals(arr.get(i).region)) {
                sum = sum + arr.get(i).bill;
            }
        }
        result = sum / sumAllRegions;
        return result*100 ;
        
    }

}
