
import java.io.*;
import java.net.*;


public class client {
	
	    public static void main(String[] args) throws Exception {
	        Socket socket = new Socket("localhost", 5000);

	        BufferedReader in = new BufferedReader(
	                new InputStreamReader(socket.getInputStream()));
	        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

	        BufferedReader keyboard =
	                new BufferedReader(new InputStreamReader(System.in));
	        new Thread(() -> {
	            try {
	                String msg;
	                while ((msg = in.readLine()) != null) {
	                    System.out.println("Received: " + msg);
	                }
	            } catch (Exception e) {}
	        }).start();
	        String text;
	        while ((text = keyboard.readLine()) != null) {
	            out.println(text);
	        }
	    }
	}



