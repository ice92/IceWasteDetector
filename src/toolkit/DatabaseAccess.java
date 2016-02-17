/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package toolkit;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ICE
 */
public class DatabaseAccess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // objek koneksi
        DBConnection x=new DBConnection("root","password","imagedb");
        Connection con=x.getConnection();
        Statement stmt=con.createStatement();
        String query="Select * from cat;";
        ResultSet rs=stmt.executeQuery(query);
        
        
        
        
        //variabel untuk penyimpanan data
        int baris=3;        
        System.out.println(baris);        
        int id[] = new int[baris];
        String kategori[]=new String[baris];
        
        //pengambilan data
        int i=0;        
        while(rs.next()){            
            id[i]=rs.getInt(1);
            kategori[i]=rs.getString(2);
            i++;
        }
        //pencetakan data
        for (int j = 0; j < baris; j++) {
            System.out.println("id\t: "+id[j]);
            System.out.println("Kategori\t: "+kategori[j]);    
        }
    }
    
}
