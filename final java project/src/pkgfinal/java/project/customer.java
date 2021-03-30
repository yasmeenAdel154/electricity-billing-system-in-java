package pkgfinal.java.project;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import static pkgfinal.java.project.FinalJavaProject.*;

public class customer {

    public String userName, region, contract;
    public ArrayList<String> mails = new ArrayList<>();
    public int day, year, month, meterCode, password, bill, numberOfMails, numberOfReadings;public float tariff;
    public ArrayList< readings> reading = new ArrayList<>();
    public boolean subscription;
    Scanner input = new Scanner(System.in);
    public int code;

    public customer() {

    }

    public static class readings {

        public int monthlyReading;
        public int day;
        public int month;
        public int year;
        boolean isPaid;

        readings() {

        }

        readings(int monthlyReading, int day, int month,
                int year, boolean isPaid) {
            this.monthlyReading = monthlyReading;
            this.day = day;
            this.month = month;
            this.year = year;
            this.isPaid = isPaid;

        }

    }

    public void sendEmail(String mail, int meterCode) {
        try {
            query = "insert into mails values('" + meterCode + "','" + mail + "' )";
            ss.execute(query);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public double payGui(int index) {
        
        double x = 0, y = 0, value = 0;
        int mMonth = 0, mYear = 0, mDay = 0;
        for (int j = 1; j < arr.get(index).numberOfReadings; j++) {
            //System.out.println("index is " + j + "n = "+arr.get(index).numberOfReadings);
            if (!arr.get(index).reading.get(j).isPaid) {
                y = arr.get(index).reading.get(j).monthlyReading;
                x = arr.get(index).reading.get(j - 1).monthlyReading;
                mMonth = arr.get(index).reading.get(j).month;
                mYear = arr.get(index).reading.get(j).year;
                mDay = arr.get(index).reading.get(j).day;
                //arr.get(index).reading.get(j).isPaid = true;
                break;
            }
        }
        value = (y - x)*arr.get(index).tariff;

        try {
            query = "update customer set bill = " + value + " , month = " + mMonth + "where meterCode =" + arr.get(index).meterCode;
            ss.execute(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return value;
    }

    public int getindex(int code) {
        int index = 0;

        for (index = 0; index < numberOfCustomers; index++) {
            if (code == arr.get(index).meterCode) {
                return index;

            }
        }
        return -1;
    }

    public int getj(int code) {
        int i, j ;

        for ( i = 0; i < numberOfCustomers; i++) {
            if (code == arr.get(i).meterCode) {
                for ( j = 1; j < arr.get(i).numberOfReadings; j++) {
                    if (!arr.get(i).reading.get(j).isPaid) {
                        System.out.println(arr.get(i).reading.get(j).month);
                        return j-1;
                    }

                }
                break;
            }

        }
        j = (arr.get(i).numberOfReadings)-1 ;
        return j;
    }

    public double payGui2(int code) {
        int i, j;
        double x = 0, y = 0, value = 0;
        int mMonth = 0, mYear = 0, mDay = 0;
        for (i = 0; i < numberOfCustomers; i++) {
            if (code == arr.get(i).meterCode) {
                for (j = 1; j < arr.get(i).numberOfReadings; j++) {
                    if (!arr.get(i).reading.get(j).isPaid) {
                        y = arr.get(i).reading.get(j).monthlyReading;
                        System.out.println(y);
                        x = arr.get(i).reading.get(j - 1).monthlyReading;
                        System.out.println(x);

                        mMonth = arr.get(i).reading.get(j).month;
                        mYear = arr.get(i).reading.get(j).year;
                        mDay = arr.get(i).reading.get(j).day;
                        //arr.get(i).reading.get(j).isPaid = true;
                        break;
                    }
                }
                break;
            }
        }
        value = (y - x)*arr.get(i).tariff;

        try {
            query = "update customer set bill = " + value + " , month = " + mMonth + "where meterCode =" + arr.get(i).meterCode;
            ss.execute(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return value;
    }

    public void update(int code) {
        int i, m = 0;
        double x = 0, y = 0, value = 0;
        int mMonth = 0, mYear = 0, mDay = 0;
        for (i = 0; i < numberOfCustomers; i++) {
            if (code == arr.get(i).meterCode) {
//                if (arr.get(i).numberOfReadings == 2)
//                    j=1 ;
                for (int j = 1; j < arr.get(i).numberOfReadings; j++) {
                    if (!arr.get(i).reading.get(j).isPaid) {
                        y = arr.get(i).reading.get(j).monthlyReading;
                        x = arr.get(i).reading.get(j - 1).monthlyReading;
//                        m = arr.get(i).reading.get(j - 1).monthlyReading;
                        arr.get(i).bill = (int) (y-x) ;
                        arr.get(i).reading.get(j).isPaid = true ;
                        arr.get(i).month =mMonth = arr.get(i).reading.get(j).month ;
                        arr.get(i).year = mYear =arr.get(i).reading.get(j).year ;
                        arr.get(i).day = mDay=arr.get(i).reading.get(j).day ;
                        break;
                    }
                }
                break;
            }
        }
        value = (y - x)*arr.get(i).tariff;
        query = "update reading set isPaid = 1  where (monthlyReading = " + y + "and meterCode = " + code + ")";
        try {
            ss.execute(query);
            query = "update customer set bill = " + value + " , month = " + mMonth + " , year "
                    + "= "+mYear +"where meterCode =" + code;
            ss.execute(query);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

//    public double payOrCollectFromGui(int index) {
//        
//        double x=0, y=0, value=0 ;int mMonth=0 , mYear=0 , mDay=0;
//        for (int j = 1; j < arr.get(index).numberOfReadings; j++) {
//            if (!arr.get(index).reading.get(j).isPaid) {
//                y = arr.get(index).reading.get(j).monthlyReading;
//                x = arr.get(index).reading.get(j-1).monthlyReading;
//                mMonth = arr.get(index).reading.get(j).month ;
//                mYear = arr.get(index).reading.get(j).year ;
//                mDay = arr.get(index).reading.get(j).day;
//                arr.get(index).reading.get(j).isPaid=true;
//                break;
//            }
//        }
//        value = (y - x);
//        System.out.println(x);
//                System.out.println(y);
//
//        query = "update reading set isPaid = 1  where (month = "+
//                     mMonth+"and meterCode = "+arr.get(index).meterCode+")" ;
//        try {
//                ss.execute(query);         
//                query = "update customer set bill = "+value+" , month = "+mMonth+"where meterCode ="+arr.get(index).meterCode;
//                ss.execute(query);
//        } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//        }
//        return value ;
//    }
//    
    public static int indexOfMeterCode(int meterCode) {

        for (int i = 0; i < numberOfCustomers; i++) {
            if (meterCode == arr.get(i).meterCode) {
                return i;
            }

        }
        return -1;
    }

    public customer informationOfMeterCode(int meterCode) {

        for (int i = 0; i < numberOfCustomers; i++) {
            if (meterCode == arr.get(i).meterCode) {
                return arr.get(i);
            }

        }
        return arr.get(0);
    }

    int login(String userName, String pass) {
        int pas = Integer.parseInt(pass);
        for (int i = 0; i < numberOfCustomers; i++) {
            if (userName.equals(arr.get(i).userName) && pas == arr.get(i).password) {
                return i;
            }
        }
        return -1;
    }

    public void addFromGui(String userName, int pas, String region, String contract) {

        try {
            query = "insert into customer (userName,region,day,month,year,contract,bill,password) "
                    + "values('" + userName + "', '" + region + "' , '1','1','2020','"
                    + contract + "','0','" + pas + "')";

            ss.execute(query);

            query = "select * from  customer where userName = '" + userName + "'";
            r = ss.executeQuery(query);
            r.next();
            meterCode = r.getInt("meterCode");

            sendEmail("your meter code is ready now ," + userName, meterCode);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        fillArrayFtomDataBase("select * from  customer where meterCode = " + meterCode);

    }
    public  void tariffGUI(int metercode,float traiff){
        try {
            String query;
            query = "update customer set traiff='"+traiff+"'where meterCode ='"+metercode+"'";
            ss.execute(query);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
}

}


