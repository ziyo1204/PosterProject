package pdp.uz.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Post {
    //Post(id, name, price, description, category, user, isActive)
    int id;
    String name;
    BigDecimal price;
    String description;
    Category category;
    User user;
    boolean isActive;
    LocalDateTime time;
    public static int currentId=0;
    {
        currentId++;
    }

    public Post(int id, String name, BigDecimal price, String description, Category category, User user, boolean isActive, LocalDateTime time) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.user = user;
        this.isActive = isActive;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public static int getCurrentId() {
        return currentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id == post.id && isActive == post.isActive && Objects.equals(name, post.name) && Objects.equals(price, post.price) && Objects.equals(description, post.description) && Objects.equals(category, post.category) && Objects.equals(user, post.user) && Objects.equals(time, post.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, description, category, user, isActive, time);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", user=" + user +
                ", isActive=" + isActive +
                ", time=" + time +
                '}';
    }
}
