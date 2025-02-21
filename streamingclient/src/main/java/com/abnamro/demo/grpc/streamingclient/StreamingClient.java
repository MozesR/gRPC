package com.abnamro.demo.grpc.streamingclient;

import com.abn_amro.grpc.stream.StreamPersonRequest;
import com.abn_amro.grpc.stream.StreamPersonResponse;
import com.abn_amro.grpc.stream.StreamPersonServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

/**
 * Hello world!
 *
 */
public class StreamingClient 
{
    public static void main( String[] args )
    {
    	
     
    
    	
    	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
				.usePlaintext(true)
				.build();
    	
    	StreamPersonServiceGrpc.StreamPersonServiceStub streamingpersonservice = StreamPersonServiceGrpc.newStub(channel);
    	
    	streamingpersonservice.getPerson(new StreamObserver<StreamPersonResponse>() {
			
			public void onNext(StreamPersonResponse value) {
				StreamPersonRequest.newBuilder().setName("test").build();
				System.out.println(value.getPersonInfo());
				
			}
			
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}
			
			public void onCompleted() {
				// TODO Auto-generated method stub
				
			}
		});
   
    
    	
    	
    	
    }
    
    
    	
    	
    
}
