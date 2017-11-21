package com.abnamro.demo.grpc.streaming;


import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * Hello world!
 *
 */
public class StreamPersonService 
{
    public static void main( String[] args ) throws IOException, InterruptedException
    {
    	Server server = ServerBuilder.forPort(50052)
				.addService(new StreamPersonServiceImpl())
				.build();
		
		server.start();
		System.out.println("StreamPersonServer started");
		server.awaitTermination();
    }
}
