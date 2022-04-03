/**
 * 
 */
package com.introspect1.grpc.insurance.policy.client;

import com.proto.policy.Policy;
import com.proto.policy.PolicyServiceGrpc;
import com.proto.policy.PolicyServiceGrpc.PolicyServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @author swapnil_gujrathi
 *
 */
public class PolicyClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("############# Running Insurance-Policy CLIENT ... ");

		PolicyClient policyClient = new PolicyClient();

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090)
				.usePlaintext()
				.build();

		policyClient.doUpdateCall(channel);

		channel.shutdown();
	}

	private void doUpdateCall(ManagedChannel channel) {
		// created a claim service client (blocking - synchronous)
		PolicyServiceBlockingStub stub = PolicyServiceGrpc.newBlockingStub(channel);
		
		// Create Policy Request
		Policy requestPolicy = Policy.newBuilder()
			.setId(1)
			.setType("New")
			.setStatus("Updated")
			.setCustName("Swap G")
			.setCustId(002102)
			.build();

		System.out.println("Sending updatePolicy request for Id : " + requestPolicy.getId());
		// Call update policy
		Policy updatePolicyResp = stub.updatePolicy(requestPolicy);

		System.out.println("Update Policy Response : " + updatePolicyResp);
	}

}
