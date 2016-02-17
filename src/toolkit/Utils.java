/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package toolkit;

import java.io.File;

/**
 *
 * @author ICE
 */
public class Utils {
    public final static String jpeg="jpeg";
    public final static String jpg="jpg";
    public final static String gif="gif";
    public final static String tiff="tiff";
    public final static String tif="tif";
    public final static String png="png";
    
    //fungsi pengambilan extensi file
    public static String getExtention(File f){
        String ext=null;
        String s=f.getName();
        int i=s.lastIndexOf('.');
        if(i>0&&i<s.length()-1){
            ext=s.substring(i+1).toLowerCase();
        }
        return ext;
    }
}
