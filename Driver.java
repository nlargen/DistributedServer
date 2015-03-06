import java.net.ServerSocket;
import java.net.Socket;


public class Driver {

	public static void main(String[] goat) throws Exception
	{
		//Just added this line
		ServerSocket ss = new ServerSocket(1234);
		int count = 0;
		
		while(true)
		{
			System.out.println("Waiting...");
			Socket connection = ss.accept();
			ResponseThread rt = new ResponseThread(connection);
			System.out.println("Connected!");
			rt.start();
		}

	}

}
