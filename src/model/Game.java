package model;

import Utils.NotEnoughStockException;

import java.util.Optional;

public class Game {
    private String title;
    private int releaseYear;
    private double price;
    private int stock;
    private Optional<String> description;

    public Game() {
        this.description = Optional.empty();
    }

    public Game(String title, int releaseYear, double price, int stock, String description) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.price = price;
        this.stock = stock;
        this.description = Optional.ofNullable(description);
    }

    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = Optional.ofNullable(description);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void trying(){
        System.out.println("Trying the game " + title);
    }

    public void reduceStock(int quantity) throws NotEnoughStockException {
        if (this.stock >= quantity) {
            this.stock -= quantity;
        } else {
            throw new NotEnoughStockException("Il n'y a pas assez en stock pour cette commande.");
        }
    }
    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", price=" + price +
                ", description=" + description +
                '}';
    }
}
