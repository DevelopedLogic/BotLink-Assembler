package main;

import javax.security.auth.login.LoginException;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Main extends ListenerAdapter{
    public static void main(String[] args) throws LoginException, RateLimitedException, InterruptedException{
        JDA bot = new JDABuilder(vars.BotConfig.accType).setToken(vars.BotConfig.token).buildBlocking();
        vars.BotConfig.jdaHandler = bot;
        bot.getPresence().setGame(Game.of(vars.BotConfig.prefix+"gl"));
        
        Reg.register(new LinkGenerator());
        Reg.register(new Shutdown());
    }
}