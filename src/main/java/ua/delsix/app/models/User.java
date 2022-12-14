package ua.delsix.app.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class User {

    int id;
    @NotEmpty(message = "Name can't be empty")
    @Size(min=2, max=25, message="Name should not be shorter than 2 symbols and not longer than 25")
    String name;
    @NotEmpty(message = "Email can't be empty")
    @Email(message = "Email must be valid")
    String email;
    @NotEmpty
    LocalDate date_of_registration;
    String favoriteSong;
    String favoriteArtist;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.date_of_registration = LocalDate.now();
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate_of_registration() {
        return date_of_registration;
    }

    public void setDate_of_registration(LocalDate date_of_registration) {
        this.date_of_registration = date_of_registration;
    }

    public String getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
    }

    public String getFavoriteArtist() {
        return favoriteArtist;
    }

    public void setFavoriteArtist(String favoriteArtist) {
        this.favoriteArtist = favoriteArtist;
    }
}
