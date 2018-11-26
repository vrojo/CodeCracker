package codeCracker;

import java.util.*;

class Encrypter {
    Map<Character, Character> transformer;

    Encrypter(String alphabet) {
        new AlphabetValidator().validates(alphabet);
        this.transformer = new AlphabetMapGenerator().generate(alphabet);
    }

    String crypt(String stringToCrypt) {
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

    String decrypt(String cryptedString) {
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

    private Character getKey(Character value) {
        for (Character key : transformer.keySet()) {
            if (value.equals(transformer.get(key))) {
                return key;
            }
        }
        return null;
    }
}
