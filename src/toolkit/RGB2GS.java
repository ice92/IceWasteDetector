/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolkit;

/**
 *
 * @author ID
 */
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.apache.commons.io.FilenameUtils;
 
public class RGB2GS{
  public static File convert(String filename) throws IOException{
    File file= new File(filename);
    int c, r, g, b;
    BufferedImage x = ImageIO.read(file);
    int width = x.getWidth();
    int height = x.getHeight();
    String fileNameWithOutExt = FilenameUtils.removeExtension(filename);
 
    //Membuat Buffered image untuk image grayscale
    BufferedImage im = new BufferedImage(width,height,BufferedImage.TYPE_BYTE_GRAY);
 
    //Kita membutuhkan rasternya untuk memberikan nilai pixel
    WritableRaster raster = im.getRaster();
 
    for(int i=0; i<x.getWidth(); i++){
        for(int j=0; j<x.getHeight(); j++){
            c =  x.getRGB(i,j);
            r = (c & 0x00ff0000) >> 16;
            g = (c & 0x0000ff00) >> 8;
            b = c & 0x000000ff;
            float gray = (float) (0.3 * r + 0.59 * g + 0.11 * b);
            raster.setSample(i, j, 0, gray);
        }
    }
    // Simpan citra dengan menggunakan format PNG
    File out=new File(fileNameWithOutExt+"_G.png");
    ImageIO.write(im,"PNG",out);
    return out;
    }
}
