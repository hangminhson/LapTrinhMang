package s61134291;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) throws IOException {
		ServerSocket socketServer = new ServerSocket(2022);
		System.out.println("I'm listening on port 2022");
		int id=0;
		while(true) {
			Socket s = socketServer.accept();
			id++;
			LuongLamViec luongTask = new LuongLamViec(s, id);
			luongTask.start();
		}
	}

}