import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ipAddress {
	public static void main(String[] args) throws IOException {
		try {
		InetAddress ip =InetAddress.getLocalHost();
		InetAddress ipAdd =InetAddress.getByName("www.google.com");
		System.out.println("The Host Address is " + ip.getHostAddress());
		System.out.println("The Host Name is " + ip.getHostName());
		System.out.println("The Host Address is " + ipAdd.getHostAddress());
		System.out.println("The Host Name is " + ipAdd.getHostName());
	} catch(UnknownHostException ue) {
		System.out.println("Website Not Found");
	}

  }
}
