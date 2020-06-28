package server;

import server.handler.Handler;
import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.io.IOException;

public class Server{
	
	public Server()throws IOException{
		
		HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), 0);	
		httpServer.createContext("/somethingelse", new Handler());
		httpServer.setExecutor(null);
		httpServer.start();
	}
}