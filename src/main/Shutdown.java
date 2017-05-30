package main;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Shutdown extends ListenerAdapter{
	@Override
    public void onMessageReceived(MessageReceivedEvent event){
		String prefix = vars.BotConfig.prefix;
		String message = event.getMessage().getContent();
		if(message.equals(prefix+"quit")){
			State.shutdown();
		}
    }
}
