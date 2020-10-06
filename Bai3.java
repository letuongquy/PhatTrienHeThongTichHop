package lap3;

import java.net.MalformedURLException;
import java.net.URL;

public class Bai3 {
   public static void main(String[] args) {
	try {
		URL u =new URL(args[0]);
		System.out.println("URL is"+u);
		System.out.println("The protocol part is"+u.getProtocol());
		System.out.println("The host part is"+u.getHost());
		System.out.println("The File part is"+u.getFile());
		System.out.println("The reference part is"+u.getRef());
	}
	catch(MalformedURLException e) {
		System.out.println("e");
	}
}
}
