package codeCracker;

import java.util.HashMap;
import java.util.Map;

public class AlphabetMapGenerator {
    public static Map<Character, Character> generate(String encryptedAlphabet) {
        HashMap<Character, Character> map = new HashMap<>();
        int indexOfLetter = 0;
        for (char letter : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            if (map.containsValue(encryptedAlphabet.charAt(indexOfLetter)))
                throw new IllegalArgumentException();
            map.put(letter, encryptedAlphabet.charAt(indexOfLetter));
            indexOfLetter++;
        }
        return map;
    }
}
