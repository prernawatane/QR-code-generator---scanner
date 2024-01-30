package Prerna;
import java.io.*;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
public class GeneratingQR {

	public static void main(String[] args) {
		   try {
			   File file=new File("C:\\Users\\USER\\Desktop\\abc.jpg");
			   String content="Hello All, This is Prerna Here";
			  ByteArrayOutputStream out = QRCode.from(content).to(ImageType.JPG).stream();
			  FileOutputStream fos=new FileOutputStream(file);
			  fos.write(out.toByteArray());
			  fos.close();
			  System.out.println("Success");
			   
			   
		   }catch(Exception e) {
			   System.out.println(e);
		   }

	}

}
