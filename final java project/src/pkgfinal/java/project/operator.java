
package pkgfinal.java.project;

import java.sql.*;
import java.util.*;
import static pkgfinal.java.project.FinalJavaProject.*;

public class operator extends customer {
    
    customer p = new customer();
    private double x, y, value;
 
    void tariff() {
        System.out.println("please enter your meter code");
        int code = input.nextInt();
        value =  p.payGui(code);
        System.out.println("your tariff is " +value);
        System.out.println(value - 9 + "for your consumption\nand 9 pounds for cleaning");
 
    }
 
    public void subscribtion(int metercode) {
 
        query = "update customer set subscription = 0 where meterCode =" + metercode;
        int index = indexOfMeterCode(metercode) ;
        arr.get(index).subscription = false ;
        try {
            ss.execute(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
 
    void validateReading() {
        int count = 0, j , code;
        System.out.print("enter the meter code : ");
        code = input.nextInt();
        System.out.print("enter the real consumption : ");
        x = input.nextInt();
        int index = indexOfMeterCode(code);
        
        for (j = 0; j < arr.get(index).numberOfReadings; j++) {
                }
        y =arr.get(index).reading.get(j-1).monthlyReading;
        System.out.print(y);

        if (x==y) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    
}
