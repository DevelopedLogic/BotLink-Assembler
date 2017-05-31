package vars;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;

public class BotConfig{
	//Settings
	public static final AccountType accType = AccountType.BOT;
	public static final String token = "token";
	public static String prefix = "\\";
	
	//Handlers
	public static JDA jdaHandler = null;
}
