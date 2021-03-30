package pkgfinal.java.project;

import java.sql.*;
import java.util.*;
import static pkgfinal.java.project.FinalJavaProject.*;
import static pkgfinal.java.project.customer.*;

public class NewCustomer extends customer {

    public void addFromConsole() {

        customer e = new customer();
        System.out.println("please enter user name ");
        e.userName = input.nextLine();

        System.out.println("please enter password  ");
        e.password = input.nextInt();
        input.nextLine();
        System.out.println("please enter contract  ");
        e.contract = input.nextLine();

        System.out.println("please enter your region ");
        e.region = input.nextLine();

        try {
            query = "insert into customer (userName,region,day,month,year,contract,bill,password) "
                    + "values('" + e.userName + "', '" + e.region + "' , '1','1','2020','"
                    + e.contract + "','0','" + e.password + "')";

            ss.execute(query);

            query = "select * from  customer where userName = '" + e.userName + "'";
            r = ss.executeQuery(query);
            r.next();
            e.meterCode = r.getInt("meterCode");

            sendEmail("your meter code is ready now ," + e.userName, e.meterCode);

            System.out.println("your meter code is ready now ," + e.userName
                    + "\nyour meter code is " + e.meterCode);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        fillArrayFtomDataBase("select * from  customer where meterCode = " + e.meterCode);

    }

}
