package codeCracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class EncrypterTest {

    @Test
    void should_replace_the_given_letter_by_the_letter_from_the_original_alphabet() {
        String charBeforeCrypt = "a";
        String alphabet = "qsdfghjklmpoiuytrezawxcvbn";
        Encrypter encrypterCode = new Encrypter(alphabet);
        String expectedCharAfterEncryption = "q";

        String encryptedChar = encrypterCode.crypt(charBeforeCrypt);

        assertThat(encryptedChar).isEqualTo(expectedCharAfterEncryption);
    }

    @Test
    void should_create_a_modified_string_using_the_encrypter() {
        String stringToCrypt = "salut les gens";
        String alphabet = "qsdfghjklmpoiuytrezawxcvbn";
        Encrypter encrypterCode = new Encrypter(alphabet);
        String expectedEncryptedString = "zqowa ogz jguz";

        String stringCrypted = encrypterCode.crypt(stringToCrypt);

        assertThat(stringCrypted).isEqualTo(expectedEncryptedString);
    }

    @Test
    void should_return_the_original_character_using_the_correct_encrypter() {
        String encryptedChar = "n";
        String alphabet = "qsdfghjklmpoiuytrezawxcvbn";
        Encrypter encrypterCode = new Encrypter(alphabet);
        String expectedDecryptedChar = "z";

        String decryptedChar = encrypterCode.decrypt(encryptedChar);

        assertThat(decryptedChar).isEqualTo(expectedDecryptedChar);
    }

    @Test
    void should_create_the_original_string_using_the_correct_encrypter() {
        String encryptedString = "zqowa ogz jguz";
        String alphabet = "qsdfghjklmpoiuytrezawxcvbn";
        Encrypter encrypterCode = new Encrypter(alphabet);
        String expectedDecryptedString = "salut les gens";

        String stringCrypted = encrypterCode.decrypt(encryptedString);

        assertThat(stringCrypted).isEqualTo(expectedDecryptedString);
    }
}
