/**
 * 
 */
package com.introspect1.grpc.insurance.policy.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * @author ubuntu
 *
 */
public class PolicyServer {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Running Insurance-Policy-Server ...");

        // plaintext server
        Server server = ServerBuilder.forPort(8090)
                .addService(new PolicyServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));

        server.awaitTermination();

	}
	

}
