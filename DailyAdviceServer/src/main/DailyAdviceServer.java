package main;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.util.Random;

public class DailyAdviceServer {

	final private String[] adviceList = {
		"Take smaller bites",
		"Get some time for yourself",
		"Look for a peacefull place",
		"Get a new book"
	};
	
	private final Random random = new Random();
	
	public void go() {
		try (ServerSocketChannel serverChannel = ServerSocketChannel.open();){
			serverChannel.bind(new InetSocketAddress(5000));
			while (serverChannel.isOpen()) {
				SocketChannel clientChannel = serverChannel.accept();
				PrintWriter writer = new PrintWriter(Channels.newOutputStream(clientChannel));
				
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String getAdvice() {
		int nextAdvice = random.nextInt(adviceList.length);
		return adviceList[nextAdvice];
	}
	
	public static void main(String[] args) {
		new DailyAdviceServer().go();
	}
}
