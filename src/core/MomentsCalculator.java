/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

import java.awt.Image;

/**
 *
 * @author ICE
 * Class untuk menghitung nilai moment
 */
public class MomentsCalculator {
    int p,q,n,m;//p+q=moment's order n.m=size of matrix(picture's size)
    int moment;
    protected int getmoment(Image img, int p,int q){
      n=img.getWidth(null);
      m=img.getHeight(null);
      
      for(int i=1;i<=m;i++){
          for (int j = 1; j <= m; j++) {
              moment+=Math.pow(i, p)*Math.pow(j, q);//*img.getpx();
          }
      }
      return moment;
    }
}
