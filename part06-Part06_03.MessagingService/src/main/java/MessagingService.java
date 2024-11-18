import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messages;

    /**
     * The class has a parameterless constructor 
     * and contain a list of Message objects. 
     */
    public MessagingService(){
        this.messages = new ArrayList<>();
    }

    /**
     *  adds a message passed as a parameter to the messaging service 
     *  as long as the message content is at most 280 characters long.
     * @param message
     */
    public void add(Message message) {
        if (message.getContent().length() <= 280){
            messages.add(message);
        }
    }

    /**
     * returns the messages added to the messaging service.
     * @return messages
     */
    public ArrayList<Message> getMessages() {
        return messages;
    }
}
