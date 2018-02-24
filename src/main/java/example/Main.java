package example;

import jota.IotaAPI;
import jota.dto.response.GetNodeInfoResponse;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("please enter a node address");
		String protocol = System.console().readLine("\nprotocol ('http' or 'https'):\n  > ");
		String host = System.console().readLine("\nhost (e.g. 'node.example.org'):\n  > ");
		String port = System.console().readLine("\napi port (usually '14265'):\n  > ");
		System.out.println("\nopening connection to '"+protocol + "://" + host + ":" + port +"' ...");
		
		
		try {
			final IotaAPI api = new IotaAPI.Builder()
					.protocol(protocol)
					.host(host)
					.port(port).build();
			
			GetNodeInfoResponse getNodeInfoResponse = api.getNodeInfo();
			int latestMilestoneIndex = getNodeInfoResponse.getLatestMilestoneIndex();
			System.out.println("\nSUCCESS: Latest Milestone Index: " + latestMilestoneIndex);
		} catch(Throwable e) {
			System.err.println("\nERROR: Something went wrong: " + e.getMessage());
			e.printStackTrace();
		}
	}
}