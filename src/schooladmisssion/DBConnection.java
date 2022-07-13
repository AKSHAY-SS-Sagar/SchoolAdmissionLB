/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schooladmisssion;

import java.sql.*;

/**
 *
 * @author Administrator
 */
public class DBConnection {

   public Connection cn;
   public DBConnection()
   {
       try
       {
            Class.forName("oracle.jdbc.OracleDriver");  // [system on SYSTEM]
            cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            }
            catch(SQLException cle)
            {
                System.out.println("cle"+cle);
            }
            catch(ClassNotFoundException cl)
            {

            }
   }
}
