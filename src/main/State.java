package main;

import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;

public class State{
	public static void setOnline(){
		vars.BotConfig.jdaHandler.getPresence().setStatus(OnlineStatus.ONLINE);
		System.out.println("[State] State was set to ONLINE");
	}
	public static void setOffline(){
		vars.BotConfig.jdaHandler.getPresence().setStatus(OnlineStatus.OFFLINE);
		System.out.println("[State] State was set to OFFLINE");
	}
	public static void setIdle(){
		vars.BotConfig.jdaHandler.getPresence().setStatus(OnlineStatus.IDLE);
		System.out.println("[State] State was set to IDLE");
	}
	public static void setDnd(){
		vars.BotConfig.jdaHandler.getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
		System.out.println("[State] State was set to DO NOT DISTURB");
	}
	public static void shutdown(){
		vars.BotConfig.jdaHandler.shutdown();
		System.out.println("[State] Bot will now terminate");
	}
	public static void setGame(String game){
		vars.BotConfig.jdaHandler.getPresence().setGame(Game.of(game));
		System.out.println("[State] Bot is now playing: "+game);
	}
}
