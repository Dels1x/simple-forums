package ua.delsix.app.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class Post {
    int id;
    @NotNull(message="Subject needs to have actual content")
    @Size(min=1, max=45, message="Title can't be longer than 45 symbols")
    String title;

    @NotNull(message="Topic needs to have actual content")
    String content;
    Date date;
    User user;

    public Post(int id, String title, String content, Date date, User user) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
