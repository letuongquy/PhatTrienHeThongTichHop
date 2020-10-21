package baitap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class ChatClientSK {
	public static void main(String[] args) {
		System.out.println("Day la Client");
		try {
//			Socket socket=new Socket("localhost",9999);
//			
//			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
//			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
//			System.out.println("Chat Client");
//			dataOutputStream.writeUTF(new Scanner(System.in).nextLine());
//			dataOutputStream.flush();
//			
//			String c2=dataInputStream.readUTF();
//			
//			System.out.println(c2);
			
			Socket socket= new Socket("localhost",9998);
			
			Scanner input= new Scanner(socket.getInputStream());
			PrintStream output=new PrintStream(socket.getOutputStream());
			
			System.out.println("Chat Client");
//			Scanner scn=new Scanner(System.in);
//			String chat1=scn.nextLine();
//			
//			output.println(chat1);
//			
//			String chat2=input.nextLine();
//			System.out.println(chat2);
			
			Scanner scn=new Scanner(System.in);
			while(true) {
				String chat1=scn.nextLine();
				output.println(chat1);
				if(chat1.equals(".")) {
					break;
				}
				String chat2=input.nextLine();
				System.out.println("Sever: "+chat2);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
