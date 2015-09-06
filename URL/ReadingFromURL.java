import java.net.*;
import java.io.*;

public class ReadingFromURL{
	public static void main(String[] args) throws Exception{
		URL oracle = new URL("http://www.oracle.com");
			
		BufferedReader br = new BufferedReader(new InputStreamReader(oracle.openStream()));
		String inputLine;
		while( (inputLine = br.readLine()) != null ){
			System.out.println(inputLine);
		}
		br.close();

	}
}