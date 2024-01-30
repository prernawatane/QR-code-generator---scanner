package Prerna;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.naming.spi.DirStateFactory.Result;
import com.google.zxing.*;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
public class QRread {

	public static void main(String[] args) {
		try {
			File file =new File("C:\\Users\\USER\\Desktop\\abc.jpg");
			com.google.zxing.Result r =new MultiFormatReader().decode(new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(file)))));
			
//			System.out.println(r.getText());
//			JOptionPane.showMessageDialog(null, r.getText());
			JOptionPane.showMessageDialog(null, r.getText(),"QR CONTENT",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(file.getAbsolutePath()));
			
			
		}catch(Exception e) {
			System.out.println(e);
//			e.printStackTrace();
		}

	}

}
