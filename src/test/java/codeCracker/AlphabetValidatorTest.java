package codeCracker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlphabetValidatorTest {

    @Test
    void should_reject_alphabet_greater_than_26_characters() {
        assertThrows(IllegalArgumentException.class, () -> new AlphabetValidator().validates("abcdefghijklmnopqrstuvwxyz1"));
    }

    @Test
    void should_reject_alphabet_shorter_than_26_characters() {
        assertThrows(IllegalArgumentException.class, () -> new AlphabetValidator().validates("abcd"));
    }

    @Test
    void should_accept_alphabet_of_26_unique_characters() {
        new AlphabetValidator().validates("abcdefghijklmnopqrstuvwxyz");
    }
}