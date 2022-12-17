package ua.delsix.app.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class User {

    int id;
    @NotEmpty(message = "Name can't be empty")
    @Size(min=2, max=25, message="Name must be longer than 2 symbols and shorter than 25")
    String name;
    @NotEmpty(message = "Password can't be empty")
    @Size(min=8, max=40, message="Password must be longer than 8 symbols and shorter than 40")
    String password;
    @NotEmpty(message = "Email can't be empty")
    @Email(message = "Email must be valid")
    String email;

    LocalDate date_of_registration;
    @Size(max=64, message="Song name is too long")
    String favoriteSong;
    @Size(max=32, message="Artist name is too long")
    String favoriteArtist;

    public User() {
    }

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.date_of_registration = LocalDate.now();
        this.email = email;
    }

    public User(int id, String name, String email, LocalDate date_of_registration, String favoriteSong, String favoriteArtist) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.date_of_registration = date_of_registration;
        this.favoriteSong = favoriteSong;
        this.favoriteArtist = favoriteArtist;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
