
package pkgfinal.java.project;

import java.sql.*;
import java.util.*;
import static pkgfinal.java.project.FinalJavaProject.*;
import static pkgfinal.java.project.customer.*;


public class oldCustomer extends customer {
    
        private double x, y, value;

    public void complain(String comp,int index) {
        
        try {
            query = "insert into complains (meterCode,complain) "
                    + "values('" + arr.get(index).meterCode + "', '" + comp + "')";
            ss.execute(query);
            System.out.println("your complain has been sent sucsesfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void insertReading(int read,int index,int mMonth,int mYear) {
        int count = 0; int isPaid = 0 ;
        String mail = "you haven't pay for 3 months" , name="";

        
                name =arr.get(index).userName;
                arr.get(index).reading.add(new readings()) ;
                arr.get(index).reading.get(arr.get(index).numberOfReadings).monthlyReading = read ;
                if (arr.get(index).numberOfReadings==0){
                    arr.get(index).reading.get(arr.get(index).numberOfReadings).isPaid = true ;
                    isPaid = 1 ;
                }
                    
                else
                    arr.get(index).reading.get(arr.get(index).numberOfReadings).isPaid = false ;
                arr.get(index).reading.get(arr.get(index).numberOfReadings).month = mMonth ;
                arr.get(index).reading.get(arr.get(index).numberOfReadings).year = mYear;

                arr.get(index).numberOfReadings++;
                for (int j = 0; j < arr.get(index).numberOfReadings; j++) {
                    if (!arr.get(index).reading.get(j).isPaid) {
                        count++;
                    }
             
        }
        if (count >= 3) {
            sendEmail("You Do not pay the Bill for Three Monthes , "+name, index);
        }
        try {
            query = "insert into reading (meterCode,monthlyReading,day,month,year,isPaid) "
                    + "values('" +arr.get(index).meterCode+ "','" + read + "' , '1','"+mMonth+"','"+mYear+"'"
                    + ", '"+isPaid+"')";
            ss.execute(query);
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
        
    }
    
}
