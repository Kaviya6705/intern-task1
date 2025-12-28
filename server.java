
import java.io.*;
import java.net.*;
import java.util.*;


public class server {

	
		    static Vector<ClientHandler> clients = new Vector<>();

		    public static void main(String[] args) throws IOException {
		        ServerSocket server = new ServerSocket(5000);
		        System.out.println("Chat Server started...");

		        while (true) {
		            Socket socket = server.accept();
		            System.out.println("New client connected");

		            ClientHandler ch = new ClientHandler(socket);
		            clients.add(ch);
		            ch.start();
		        }
		    }

		    static class ClientHandler extends Thread {
		        Socket socket;
		        BufferedReader in;
		        PrintWriter out;

		        ClientHandler(Socket socket) throws IOException {
		            this.socket = socket;
		            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		            out = new PrintWriter(socket.getOutputStream(), true);
		        }

		        public void run() {
		            String msg;
		            try {
		                while ((msg = in.readLine()) != null) {
		                    for (ClientHandler c : clients) {
		                        c.out.println(msg);
		                    }
		                }
		            } catch (Exception e) {
		                System.out.println("Client disconnected");
		            }
		        }
		    }
		}


	


