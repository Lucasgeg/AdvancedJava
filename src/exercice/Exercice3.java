package exercice;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercice3 {
    public static void main(String[] args) {
        List<Integer> names = new ArrayList<>();
        String[] unParsedNames = {"Alexis", "BREwen", "Théo", "Theo", "Lucas", "Yann", "yaNn", "Osman", "osmaN"};
        List<String> parsedNames = new ArrayList<>();
        for (String element : unParsedNames) {
            String parsedName = parsedString(element);
            parsedNames.add(parsedName);
        }
        names.add(frequencyNames(parsedNames, "alexis"));
        names.add(frequencyNames(parsedNames, "brewen"));
        names.add(frequencyNames(parsedNames, "theo"));
        names.add(frequencyNames(parsedNames, "lucas"));
        names.add(frequencyNames(parsedNames, "yann"));
        names.add(frequencyNames(parsedNames, "osman"));

        System.out.println(names);
    }
    private static String parsedString(String input) {
        String element = input;
        element = Normalizer.normalize(input, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        element = element.toLowerCase();
        return element;
    }
    private static Integer frequencyNames(List<String> liste, String research){
        return Collections.frequency(liste, parsedString(research));
    }
}
