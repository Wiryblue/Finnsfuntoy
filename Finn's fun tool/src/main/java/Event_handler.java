import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Event_handler extends ListenerAdapter {
Thread thread = new Thread();

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        String[] messageSent = event.getMessage().getContentRaw().split(" ");
        if (messageSent[0].equalsIgnoreCase("/spam")) {
            int spam = Integer.parseInt(messageSent[1]);
            String what_to_say = messageSent[2];
            for (int i = 0; i < spam; i++) {

                event.getChannel().sendMessage(what_to_say).queue();

            }
        }
    }
}