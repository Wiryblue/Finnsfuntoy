import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

public class Main {

    public static void main(String[]args) throws Exception{

    JDA jda = new JDABuilder("Njc1MTcyNzY2ODEwMzc0MTU0.XjzUQw.swCpcgJ8CU7lx5itzfjSFqnmaeU").build();

    jda.addEventListener(new Event_handler());
    }
}
