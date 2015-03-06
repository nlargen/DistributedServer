import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;


public class Driver {
	
static LinkedList<ConnectedClient> theClients = new LinkedList<ConnectedClient>();
	public static void main(String[] goat) throws Exception
	{
		 
		ServerSocket ss = new ServerSocket(1234);
		int count = 0;
		ResponseThread rt = null; 
		for(int i = 0; i < 2; i++)
		{
			System.out.println("Waiting...");
			Socket connection = ss.accept();
			ConnectedClient cc = new ConnectedClient(connection); 
			Driver.theClients.add(cc); 
			ResponseThread rt = new ResponseThread(cc); 
			System.out.println("connected!");
		
			
		}

	}

}
