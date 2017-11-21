package com.abnamro.demo.grpc.streaming;

import java.util.LinkedHashSet;

import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

import com.abn_amro.grpc.stream.StreamPersonRequest;
import com.abn_amro.grpc.stream.StreamPersonResponse;
import com.abn_amro.grpc.stream.StreamPersonServiceGrpc;
import com.abn_amro.grpc.stream.StreamPersonServiceGrpc.StreamPersonServiceImplBase;

import io.grpc.stub.StreamObserver;
import io.grpc.stub.StreamObservers;

public class StreamPersonServiceImpl extends StreamPersonServiceGrpc.StreamPersonServiceImplBase{

	private static LinkedHashSet<StreamObserver<StreamPersonResponse>> observer = new LinkedHashSet<>();
	@Override
	public StreamObserver<StreamPersonRequest> getPerson(StreamObserver<StreamPersonResponse> responseObserver) {
		observer.add(responseObserver);
		
		return new StreamObserver<StreamPersonRequest>() {
			
			@Override
			public void onNext(StreamPersonRequest value) {
				StreamPersonResponse response =	StreamPersonResponse.newBuilder()
				.setPersonInfo("Server response: " +value.getName()).build();
				
				observer.stream().forEach(o -> o.onNext(response));
				
			}
			
			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
				observer.remove(responseObserver);
				
			}
			
			@Override
			public void onCompleted() {
				observer.remove(responseObserver);
				
			}
		};
	

	}

}
