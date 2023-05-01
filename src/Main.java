import Utils.NotEnoughStockException;
import model.*;
import model.enums.GameGenre;
import model.enums.Platform;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        // Initialization of Game
        VideoGame game1 = new VideoGame(GameGenre.ACTION, Platform.XBOX, true);
        game1.setStock(10);
        game1.setTitle("TitanFall");
        game1.setPrice(59.90);
        game1.setReleaseYear(2016);
        game1.setDescription("Un FPS dynamique où vous pouvez appellé un robot géant pour tout dégommer");

        ArcadeGame game2 = new ArcadeGame(90, 4, false);
        game2.setStock(2);
        game2.setTitle("Massive Darkness 2");
        game2.setPrice(85);
        game2.setReleaseYear(2021);

        // Initialization of Customer
        Customer toto = new Customer("Gégot", "Lucas", 34, "123 rue du dev", "0601352850", 1300);
        Customer tata = new Customer("Quinn", "Harley", 39, "123 rue de JavaScript", "0636206664", 125);

        // Adding games to Customers
        toto.getGame().add(game2);


        // Initialization of Purchase
        Purchase purchase1 = new Purchase(toto, game2, 3);
        Purchase purchase2 = new Purchase(tata, game1, 3);

        // Print Total Purchase
        System.out.println("totalPurchase début toto : " + toto.getTotalPurchase());
        System.out.println("totalPurchase début tata : " + tata.getTotalPurchase());

        // Print price of each
        try {
            double purchasePrice = purchase1.calculatePurchasePrice();
            System.out.println(purchase1.getCustomer().getFirstName() + " doit payer pour " + purchase1.getQuantity() + " " + purchase1.getGame().getTitle() + " la somme de " + purchasePrice);
        } catch (NotEnoughStockException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        try {
            double purchasePrice = purchase2.calculatePurchasePrice();
            System.out.println(purchase2.getCustomer().getFirstName() + " doit payer pour " + purchase2.getQuantity() + " " + purchase2.getGame().getTitle() + " la somme de " + purchase2.calculatePurchasePrice());
        }catch (NotEnoughStockException e){
            System.out.println("Erreur : " + e.getMessage());
        }

        // print details of each Customer
        System.out.println(toto.toString());
        System.out.println(tata.toString());

        // Print details of a game
        System.out.println(game1.toString());
        System.out.println(game2.toString());

        // Try the game
        game1.trying();
        game2.trying();

        // Nouveau solde
        System.out.println("totalPurchase fin toto : " + toto.getTotalPurchase());
        System.out.println("totalPurchase fin tata : " + tata.getTotalPurchase());

        System.out.println("Achat de deux exemplaire et calcul du prix pour Lucas et le jeux Massive Darkness 2");
        purchase1.setQuantity(2);
        try {
            double purchasePrice = purchase1.calculatePurchasePrice();
            System.out.println(purchase1.getCustomer().getFirstName() + " doit payer pour " + purchase1.getQuantity() + " " + purchase1.getGame().getTitle() + " la somme de " + purchasePrice);
        } catch (NotEnoughStockException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("Nouveau solde Lucas : " + toto.getTotalPurchase());
    }
    }