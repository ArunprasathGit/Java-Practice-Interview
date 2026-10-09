import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> occurrences = new LinkedHashMap<>();
        for (char character : input.toCharArray()) {
            occurrences.put(character, occurrences.getOrDefault(character, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            char character = entry.getKey();
            String label = character == ' ' ? "space" : String.valueOf(character);
            System.out.println("'" + label + "' occurs " + entry.getValue()
                    + (entry.getValue() == 1 ? " time" : " times"));
        }
    }
}
