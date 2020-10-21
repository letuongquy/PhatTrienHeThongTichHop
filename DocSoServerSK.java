package baitap;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import com.sun.corba.se.spi.activation.Server;

public class DocSoServerSK {
public static void main(String[] args) {
	System.out.println("Server....");
	
	try {
		ServerSocket server=new ServerSocket(7788);
		Socket socket=server.accept();
		
		Scanner input= new Scanner(socket.getInputStream());
		PrintStream output= new PrintStream(socket.getOutputStream());
		
        while(true) {
    		String s=input.nextLine();
//    		System.out.println("So can doc la: "+s);
    		String c = null;
    		
    		if(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")||
    				s.equals("8")||s.equals("9")) {
    			switch(s) {
    			case "0":
    				c="Khong";
    				break;
    			case "1":
    				c="Mot";
    				break;
    			case "2":
    				c="Hai";
    				break;
    			case "3":
    				c="Ba";
    				break;
    			case "4":
    				c="Bon";
    				break;
    			case "5":
    				c="Nam";
    				break;
    			case "6":
    				c="Sau";
    				break;
    			case "7":
    				c="Bay";
    				break;
    			case "8":
    				c="Tam";
    				break;
    			case "9":
    				c="Chin";
    				break;
    			}
    			output.println(c);
    		}
    		else if(s.equals(".")) {
    			break;
    		}
    		else {
    			c="Khong phai so nguyen";
    			output.println(c);
    		}
        }
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
