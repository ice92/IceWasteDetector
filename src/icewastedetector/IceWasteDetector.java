/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icewastedetector;

import toolkit.RGB2GS;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ID
 */
public class IceWasteDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            RGB2GS.convert("T_Neg_92.jpg");
        } catch (IOException ex) {
            Logger.getLogger(IceWasteDetector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
