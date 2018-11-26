package codeCracker;

import java.util.HashMap;
import java.util.Map;

class AlphabetMapGenerator {

    Map<Character, Character> generate(String encryptedAlphabet) {
        Map<Character, Character> map = new HashMap<>();
        char[] charArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char letter = charArray[i];
            if (map.containsValue(encryptedAlphabet.charAt(i)))
                throw new IllegalArgumentException();
            map.put(letter, encryptedAlphabet.charAt(i));
        }
        return map;
    }
}
