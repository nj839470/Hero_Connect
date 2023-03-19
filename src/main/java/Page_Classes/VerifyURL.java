package Page_Classes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class VerifyURL {
	  		  
	public static boolean isUrlValid(String url) {
	      try {
	         URL obj = new URL(url);
	         obj.toURI();
	         return true;
	      } catch (MalformedURLException e) {
	         return false;
	      } catch (URISyntaxException e) {
	         return false;
	      }
	   }
	   public static void main(String[] args) throws IOException {
	      String url = "http://192.168.1.104:4444";
	      if(isUrlValid(url)) {
	         URL obj = new URL(url);
	         //Opening a connection
	         HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
	         //Sending the request
	         conn.setRequestMethod("GET");
	         int response = conn.getResponseCode();
	         if (response == 200) {
	            //Reading the response to a StringBuffer
	            Scanner responseReader = new Scanner(conn.getInputStream());
	            StringBuffer buffer = new StringBuffer();
	            while (responseReader.hasNextLine()) {
	               buffer.append(responseReader.nextLine()+"");
	            }
	            responseReader.close();
	            //Printing the Response
	            System.out.println(buffer.toString());
	         }
	      }else {
	         System.out.println("Enter valid URL");
	      }
	   }
}



