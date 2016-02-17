/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package toolkit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author ICE
 */
public class DBConnection {

    private final String username;
    private final String password;     
    private final String dbname;     
    public DBConnection(String username,String password,String dbname) {
        this.username=username;
        this.password=password;
        this.dbname=dbname;
    }
    
    public Connection getConnection()throws SQLException{
        Connection conn;
        Properties connProp=new Properties();
        connProp.put("user", this.username);
        connProp.put("password", this.password);        
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname, connProp);   
//        System.out.println("Connect to db "+dbname+" success !");
        return conn;
    }
    
}
