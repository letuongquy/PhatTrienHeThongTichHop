package baitap;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class Bai7 {
public static void main(String[] args) {
	//lay tat ca cac header
	for(int i=0;i<args.length;i++) {
		try {
			URL u = new URL(args[i]);
			URLConnection uc = u.openConnection();
			System.out.println("Content-type: "+uc.getContentType());
			System.out.println("Content-encoding: "+uc.getContentEncoding());
			System.out.println("Date: "+new Date(uc.getLastModified()));
			System.out.println("Expiration date: "+ new Date(uc.getExpiration()));
			System.out.println("Content-length: "+uc.getContentLength());
		}
		catch(MalformedURLException ex) {
			System.err.print(args[i]+"is not a URL i understand");
		}
		catch (IOException ex) {
			System.err.print(ex);
		}
		System.err.println();
	}
}
}
