package ua.delsix.app.models;

import java.util.Date;
import java.util.Locale;

public class User {
    int id;
    String name;
    Date date_of_registration;
    String favoriteSong;
    String favoriteArtist;

    public User(int id, String name, Date date_of_registration, String favoriteSong, String favoriteArtist) {
        this.id = id;
        this.name = name;
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

    public Date getDate_of_registration() {
        return date_of_registration;
    }

    public void setDate_of_registration(Date date_of_registration) {
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
