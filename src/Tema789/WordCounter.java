package Tema789;

import java.io.*;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        HashMap<String, Integer> wordCount = new HashMap<>();

        ArrayList<String> lines = new ArrayList<>();

        try (InputStream in = new FileInputStream("input.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {

            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : lines) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
        }

        Map<String, Integer> sortedWordCount = new LinkedHashMap<>();
        wordCount.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedWordCount.put(x.getKey(), x.getValue()));

        try (PrintStream out = new PrintStream("output.txt")) {
            for (Map.Entry<String, Integer> entry : sortedWordCount.entrySet()) {
                out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
