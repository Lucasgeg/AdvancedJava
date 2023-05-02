package exercice;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        String[] names = { "Alexis", "BREwen", "Théo", "Theo", "Lucas", "Yann", "yaNn", "Osman", "osmaN"};
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        String lastFirstName = lastFirstNameWithLenght(names, lenght);
        if (lastFirstName != null) {
            System.out.println("Le dernier prénom de longueur " + lenght + " est : " + lastFirstName);
        } else {
            System.out.println("Aucun prénom de longueur " + lenght + " n'a été trouvé !");
        }
    }

    public static String lastFirstNameWithLenght(String[] firstNames, int lenght) {
        String dernierPrenom = null;
        for (int i = firstNames.length - 1; i >= 0; i--) {
            if (firstNames[i].length() == lenght) {
                dernierPrenom = firstNames[i];
                break;
            }
        }
        return dernierPrenom;
    }
}
