package main;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class LinkGenerator extends ListenerAdapter{
	@Override
    public void onMessageReceived(MessageReceivedEvent event){
		String prefix = vars.BotConfig.prefix;
		String[] message = event.getMessage().getContent().split(" ");
		if(message[0].equals(prefix+"gl")){
			if(message.length < 2){
				event.getChannel().sendMessage("Usage: `"+prefix+"gl <client ID> (permission number)`").queue();
			}else if(message[2] != null){
				event.getChannel().sendMessage("https://discordapp.com/oauth2/authorize?client_id="+message[1]+"&scope=bot&permissions=0").queue();
			}else{
				event.getChannel().sendMessage("https://discordapp.com/oauth2/authorize?client_id="+message[1]+"&scope=bot&permissions="+message[2]).queue();
			}
		}
    }
}
