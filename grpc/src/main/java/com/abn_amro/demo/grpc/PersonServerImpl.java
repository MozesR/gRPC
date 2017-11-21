package com.abn_amro.demo.grpc;



import com.abn_amro.grpc.PersonRequest;
import com.abn_amro.grpc.PersonResponse;
import com.abn_amro.grpc.PersonServiceGrpc.PersonServiceImplBase;

import io.grpc.stub.StreamObserver;

public class PersonServerImpl extends PersonServiceImplBase{
	
	
	
	@Override
	public void getPerson(PersonRequest request, StreamObserver<PersonResponse> responseObserver) {
	
		System.out.println("Request: - name: " + request.getName() + " \n age: " + request.getAge() + " \n Role: " + request.getRole() );
		
		
			responseObserver.onNext(PersonResponse.newBuilder()
					.setPersonInfo(" name: " + request.getName()
					+ " age :" + request.getAge()
					+ " role: " + request.getRole()).build());
		
			responseObserver.onCompleted();
	}
}
