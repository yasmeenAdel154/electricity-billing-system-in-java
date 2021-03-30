/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.java.project;

import java.sql.*;
import java.util.* ;
import pkgfinal.java.project.PanelPackege.reading;

import pkgfinal.java.project.customer.readings;

public class FinalJavaProject {

    static String user = "admin";
    static String password = "0000";
    static String addres = "jdbc:sqlserver://localhost:1433;databaseName= JavaProject";
    static Connection c ;
    public static Statement ss , s;
    public static String query;
    public static ResultSet r  , r2;
    public static int numberOfCustomers;
    public static ArrayList < customer > arr = new ArrayList<customer>() ;
//        public static ArrayList < reading > readings = new ArrayList<reading>() ;

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in) ;
        
        admin a = new admin() ; oldCustomer o = new oldCustomer() ;
        operator op = new operator();
        customer cs = new customer() ;
        
        
        try 
        {
            c = DriverManager.getConnection(addres,user,password) ;
            ss = c.createStatement() ; 
            s = c.createStatement() ;
            query = "" ;
            fillArrayFtomDataBase("") ;
            new Login().setVisible(true);
           // a.totalCollected();
            //a.update();
            //o.pay();
            //o.insertReading();
           // a.viewStatistics();
           // op.validateReading();
            
            // System.out.println(arr.get(0).mails.get(6));
         
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
       
        
    }
    
    public static void fillArrayFtomDataBase (String query2){
        
    
    if (query2.equals(""))
        query ="select * from customer" ;
    else
        query = query2;
        
        try {
            r = ss.executeQuery(query) ;
            
            while (r.next()){
                
                
                arr.add( new customer() )  ; 
                
                arr.get(numberOfCustomers).userName = r.getString("userName") ;
                arr.get(numberOfCustomers).contract = r.getString("contract") ;
                arr.get(numberOfCustomers).day  = r.getInt("day") ;
                arr.get(numberOfCustomers).month = r.getInt("month") ;
                arr.get(numberOfCustomers).year = r.getInt("year") ;
                arr.get(numberOfCustomers).meterCode = r.getInt("meterCode") ;
                arr.get(numberOfCustomers).subscription = r.getBoolean("subscription") ;
                arr.get(numberOfCustomers).region = r.getString("region") ;
                arr.get(numberOfCustomers).password = r.getInt("password") ;
                arr.get(numberOfCustomers).bill= r.getInt("bill") ;
                arr.get(numberOfCustomers).tariff= r.getFloat("traiff") ;

              
                query = "select*from reading where meterCode = " + arr.get(numberOfCustomers).meterCode +
                        "order by  monthlyReading";
                
                r2 = s.executeQuery(query) ;
                int numberOfReadings=0 ;
                while (r2.next()){
                    
                    arr.get(numberOfCustomers).reading.add(new readings());
                    arr.get(numberOfCustomers).reading.get(numberOfReadings).monthlyReading = r2.getInt("monthlyReading") ;
                    arr.get(numberOfCustomers).reading.get(numberOfReadings).day = r2.getInt("day") ;
                    arr.get(numberOfCustomers).reading.get(numberOfReadings).month = r2.getInt("month") ;
                    arr.get(numberOfCustomers).reading.get(numberOfReadings).year = r2.getInt("year") ;
                    arr.get(numberOfCustomers).reading.get(numberOfReadings).isPaid = r2.getBoolean("isPaid");
                    numberOfReadings++;
                    
                }
                arr.get(numberOfCustomers).numberOfReadings = numberOfReadings ;
                query = "select*from mails where meterCode = "+arr.get(numberOfCustomers).meterCode;
                r2 = s.executeQuery(query) ;
                int numberOfMails=0 ;
                
                while (r2.next()){
                    arr.get(numberOfCustomers).mails.add(r2.getString("mail")) ;
                    numberOfMails++;
                }
                arr.get(numberOfCustomers).numberOfMails = numberOfMails ;
                numberOfCustomers++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }        
    }
    
    
    
    public static void connection (){
        try 
        {
            c = DriverManager.getConnection(addres,user,password) ;
            ss = c.createStatement() ;
            /*query = "create table customer (userName nvarchar(50) , meterCode int primary key identity (1,1),"
                    + "region nvarchar(50) , day int not null , month int not null"
                    + ", year int not null, contract nvarchar(100) ,bill int not null ,"
                    + " subscription bit default 1 , password int not null default 0,traiff float not null)" ;
                        ss.execute(query);

            query = "create table reading ( meterCode int not null foreign key references customer (meterCode) "
                    + "on delete cascade on update cascade ,monthlyReading int not null ,"
                    + " day int not null , month int not null, year int not null"
                    + ",isPaid bit default 0 )" ;
                        ss.execute(query);

            */
             /*query = "create table mails  ( meterCode int not null foreign key references customer (meterCode) "
                    + "on delete cascade on update cascade , mail nvarchar(200) )";
                        ss.execute(query);*/
            query = "ALTER TABLE mails " +
                   "ADD CONSTRAINT MyPrimaryKey1 PRIMARY KEY (meterCode , day , month , year)" ;
                        ss.execute(query);

            query = "create table complains  ( meterCode int not null foreign key references customer (meterCode) "
                    + "on delete cascade on update cascade , complain nvarchar(200) )";
                        ss.execute(query);
            query = "insert into customer (userName,region,day,month,year,contract,bill) "
                    + "values('yasmeenAdel', 'helmya' , 15,15,2001,'url','0')";
            ss.execute(query);
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }    
}
    

