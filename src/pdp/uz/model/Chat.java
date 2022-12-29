package pdp.uz.model;

import java.util.Objects;

public class Chat {
    //Chat(id, post, fromUser, toUser)
    private int id;
    private Post post;
    private User fromUser;
    private User toUser;
    public static int currentId=0;
    {
        currentId++;
    }

    public Chat(int id, Post post, User fromUser, User toUser) {
        this.id = id;
        this.post = post;
        this.fromUser = fromUser;
        this.toUser = toUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public User getToUser() {
        return toUser;
    }

    public void setToUser(User toUser) {
        this.toUser = toUser;
    }

    public static int getCurrentId() {
        return currentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return id == chat.id && Objects.equals(post, chat.post) && Objects.equals(fromUser, chat.fromUser) && Objects.equals(toUser, chat.toUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, post, fromUser, toUser);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", post=" + post +
                ", fromUser=" + fromUser +
                ", toUser=" + toUser +
                '}';
    }
}
