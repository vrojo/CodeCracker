package codeCracker;

class AlphabetValidator {
    public static void validates(String alphabet) {
        if(alphabet.length() == 26)
            return;
        throw new IllegalArgumentException();
    }
}
