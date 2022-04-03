/**
 * 
 */
package com.introspect1.grpc.insurance.policy.server;

import com.proto.policy.Policy;
import com.proto.policy.PolicyServiceGrpc.PolicyServiceImplBase;

import io.grpc.stub.StreamObserver;

/**
 * @author Swapnil_Gujrathi
 *
 */
public class PolicyServiceImpl extends PolicyServiceImplBase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	@Override
	public void updatePolicy(Policy request, StreamObserver<Policy> responseObserver) {
		System.out.println("In Update Policy ...");
		System.out.println("Updating policy for ID : " + request.getId());
		
		// Create the Update Response
		Policy updatePolicyResponse = Policy.newBuilder()
			.setId(request.getId())
			.setType(request.getType())
			.setStatus(request.getStatus())
			.setCustName(request.getCustName())
			.setCustId(request.getCustId())
			.build();
	
		
        responseObserver.onNext(updatePolicyResponse);
        responseObserver.onCompleted();
        
        System.out.println("Completed Update Policy for ID : " + request.getId());
	}
	
}
