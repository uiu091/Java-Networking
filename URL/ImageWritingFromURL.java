// http://www.tutorialspoint.com/java/io/fileoutputstream_write_byte_len.htm

import java.net.*;
import java.io.*;

public class ImageWritingFromURL {
    public static void main(String[] args) throws Exception {
        
		// File tempfile = new File("user.dir/tmp", "tempfile.txt");
		// File dir = new File("tmp/test");
		File dir = new File("tmp");
		dir.mkdirs();
		
	
		for(int i = 0; i < 5; i++){
				
			URL google = new URL("http://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
			InputStream is = google.openStream();
		
			File tmp = new File(dir, "google"+Integer.toString(i)+".png");
			
			// tmp.createNewFile();
			
			OutputStream os = new FileOutputStream(tmp);
			
			byte[] b = new byte[20];
			int length;
			
			while ((length = is.read(b)) != -1) {
				
				os.write(b, 0, length);
				// os.write(b, 500, length); => java.lang.IndexOutOfBoundsException
				// b = the source buffer
				// 0 = the start offset in the data
				// length = the number of bytes to write
				
			}
			is.close();
			os.close();
		
		}
		
    }
}