package codeCracker;

import java.util.*;

public class Encrypter {
    Map<Character, Character> transformer;

    public Encrypter(String alphabet) {
        AlphabetValidator.validates(alphabet);
        this.transformer = AlphabetMapGenerator.generate(alphabet);
    }

    public String crypt(String stringToCrypt) {
        StringBuilder cryptedString = new StringBuilder();
        for (char letter : stringToCrypt.toCharArray()) {
            if (transformer.containsKey(letter)) {
                cryptedString.append(transformer.get(letter));
            } else {
                cryptedString.append(letter);
            }
        }
        return cryptedString.toString();
    }

    public String decrypt(String cryptedString) {
        StringBuilder decryptedString = new StringBuilder();
        for (char letter : cryptedString.toCharArray()) {
            Character key = getKey(letter);
            if (key != null) {
                decryptedString.append(key);
            } else {
                decryptedString.append(letter);
            }
        }
        return decryptedString.toString();
    }

    public Character getKey(Character value) {
        for (Character key : transformer.keySet()) {
            if (value.equals(transformer.get(key))) {
                return key;
            }
        }
        return null;
    }
}
