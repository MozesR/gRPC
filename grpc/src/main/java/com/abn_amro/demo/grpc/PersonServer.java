package com.abn_amro.demo.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.logging.Logger;
public class PersonServer {
	private static final Logger logger = Logger.getLogger(PersonServer.class.getName());

	
	public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(50051)
				.addService(new PersonServerImpl())
				.build();
		
		server.start();
		System.out.println("PersonServer started");
		server.awaitTermination();
		
	}
	  
}
