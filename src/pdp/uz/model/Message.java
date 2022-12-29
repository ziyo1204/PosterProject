package pdp.uz.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Message {
    //Message(id, chat, text, time, user)
    private int id;
    private Chat chat;
    private String text;
    private LocalDateTime time;
    private User user;
    public static int currentId=0;
    {
        currentId++;
    }

    public Message(int id, Chat chat, String text, LocalDateTime time, User user) {
        this.id = id;
        this.chat = chat;
        this.text = text;
        this.time = time;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static int getCurrentId() {
        return currentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return id == message.id && Objects.equals(chat, message.chat) && Objects.equals(text, message.text) && Objects.equals(time, message.time) && Objects.equals(user, message.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chat, text, time, user);
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", chat=" + chat +
                ", text='" + text + '\'' +
                ", time=" + time +
                ", user=" + user +
                '}';
    }
}
