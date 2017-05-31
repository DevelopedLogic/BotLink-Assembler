package main;

public class Reg{
	public static void register(Object eventhandler){
		vars.BotConfig.jdaHandler.addEventListener(eventhandler);
		System.out.println("[Registry]: Registered Event Handler: "+eventhandler.getClass().getName());
	}
}
