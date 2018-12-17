package com.sun;

public class ShutDownHook {

	public ShutDownHook() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new Thread()
		{
			public void run()
			{
				System.out.println("Shutdown hook terminating");
			}

		});

		System.out.println("Application terminating");
	}

}
