package model;

import Utils.NotEnoughStockException;

public class Purchase {
    private Customer customer;
    private Game game;
    private int quantity;

    public Purchase() {
    }

    public Purchase(Customer customer, Game game, int quantity) {
        this.customer = customer;
        this.game = game;
        this.quantity = quantity;
    }

    public double calculatePurchasePrice() throws NotEnoughStockException {
        if (quantity <= game.getStock()) {
            double price = game.getPrice();
            if (customer.vipCustomer()) {
                price *= 0.9;
            }
            if (game instanceof ArcadeGame && quantity > 2) {
                price *= 0.75;
            }
            if (game instanceof VideoGame && quantity > 5) {
                price *= 0.8;
            }
            game.setStock(game.getStock() - quantity);
            customer.setTotalPurchase(customer.getTotalPurchase() + price * quantity);
            return price * quantity;
        }else {
            throw new NotEnoughStockException("Pas assez d'exemplaire en stock pour : " + game.getTitle());
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}