package codeCracker;

class AlphabetValidator {

    void validates(String alphabet) {
        if(alphabet.length() == 26)
            return;
        throw new IllegalArgumentException();
    }
}
