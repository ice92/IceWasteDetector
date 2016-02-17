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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ICE
 */
public class Kategori {
    int id[];
    String kategori[];
    public Kategori(){        
        try {            
            DBConnection x=new DBConnection("root","password","imagedb");
            Connection con=x.getConnection();
            Statement stmt=con.createStatement();
            
            String query="Select * from cat a;";
            ResultSet rs=stmt.executeQuery(query);
            //variabel untuk penyimpanan data
            int baris=3;                            
            id = new int[baris];
            kategori=new String[baris];

            //pengambilan data
            int i=0;        
            while(rs.next()){            
                id[i]=rs.getInt(1);
                kategori[i]=rs.getString(2);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Kategori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int[] getId(){
        return id;
    }
    public String[] getCat(){
        return kategori;
    }
}
