import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class autopublish extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event) {

        String id = event.getChannel().getId();
        Message m = event.getMessage();

        if (id.equals("ChannelID")) {
            publish(m);
        }

//Falls ein zweiter channel existiert hier unten einfügen.
        if (id.equals("ChannelID2")) {
            publish(m);
        }
        // Ende zweiter channel
        
    }

    public void publish(Message m) {

        m.crosspost().queue();

    }

}
