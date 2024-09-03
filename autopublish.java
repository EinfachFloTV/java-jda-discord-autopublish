package main.java.FloUnityMainBot.sonstiges;

import net.dv8tion.jda.api.entities.channel.ChannelType;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.MessageUpdateEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class autopublish extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event) {

        if(event.getChannelType().equals(ChannelType.NEWS)) {

            event.getMessage().crosspost().queue();

        }

    }

    public void onMessageUpdate(MessageUpdateEvent event) {

        if(event.getChannelType().equals(ChannelType.NEWS)) {

            event.getMessage().crosspost().queue();

        }
    }
}
