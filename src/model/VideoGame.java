package model;

import model.enums.GameGenre;
import model.enums.Platform;

public class VideoGame extends Game {
    private GameGenre genre;
    private Platform platform;
    private Boolean online;

    public VideoGame() {
    }

    public VideoGame(GameGenre genre, Platform platform, Boolean online) {
        this.genre = genre;
        this.platform = platform;
        this.online = online;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public GameGenre getGenre() {
        return genre;
    }

    public void setGenre(GameGenre genre) {
        this.genre = genre;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public void trying(){
        System.out.println("Trying " + getTitle() + " on : " + platform);
    }
}
