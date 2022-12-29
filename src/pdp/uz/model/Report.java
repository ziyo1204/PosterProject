package pdp.uz.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Report {
    //Report(id, post, user, description, time)
    private int id;
    private Post post;
    private User user;
    private String description;
    private LocalDateTime time;
    private boolean isChecked;
    public static int currentId=0;
    {
        currentId++;
    }

    public Report(int id, Post post, User user, String description, LocalDateTime time, boolean isChecked) {
        this.id = id;
        this.post = post;
        this.user = user;
        this.description = description;
        this.time = time;
        this.isChecked = isChecked;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public static int getCurrentId() {
        return currentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return id == report.id && isChecked == report.isChecked && Objects.equals(post, report.post) && Objects.equals(user, report.user) && Objects.equals(description, report.description) && Objects.equals(time, report.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, post, user, description, time, isChecked);
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", post=" + post +
                ", user=" + user +
                ", description='" + description + '\'' +
                ", time=" + time +
                ", isChecked=" + isChecked +
                '}';
    }
}
