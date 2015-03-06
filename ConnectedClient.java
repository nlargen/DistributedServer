import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;


public class ConnectedClient {
	
	ConnectedClient theClient; 
	LinkedList allTheClients; 
	
	
	public ConnectedClient(ConnectedClient theClient)
	{
		this.theClient = theClient; 
		this.allTheClients = Driver.theClients; 
	}

}
