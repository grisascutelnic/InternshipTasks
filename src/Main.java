import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, List<String>> map = new HashMap<>();
        int cntWords = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader("src/sample.txt"))) {

            long startTime = System.nanoTime();
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                char[] chars = line.toCharArray();
                Arrays.sort(chars);
                String sortedWord = new String(chars);
                if (!map.containsKey(sortedWord)) {
                    map.put(sortedWord, new ArrayList<>());
                }
                map.get(sortedWord).add(line);

                cntWords++;
            }

            long endTime = System.nanoTime();
            long durationMs = (endTime - startTime) / 1_000_000;
            System.out.println("Algorithm duration: " + durationMs + " ms");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"))) {
            for (String key : map.keySet()) {
                List<String> values = map.get(key);
                for (String value : values) {
                    writer.write(value + " ");
                }
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Number of words: " + cntWords);
        System.out.println("Datele de iesire au fost introduse in src/output.txt");
    }
}