/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package toolkit;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author ICE
 */
public class ImageFilter extends FileFilter{

    @Override
    public boolean accept(File file) {
        if(file.isDirectory()){
            return true;
        }
        String extention=Utils.getExtention(file);
        if(extention!=null){
            return extention.equals(Utils.gif)||
                    extention.equals(Utils.jpeg)||
                    extention.equals(Utils.jpg)||
                    extention.equals(Utils.png)||
                    extention.equals(Utils.tif)||
                    extention.equals(Utils.tiff);
        }        
        return false;
    }

    @Override
    public String getDescription() {
        return "file gambar";
    }
    
}
