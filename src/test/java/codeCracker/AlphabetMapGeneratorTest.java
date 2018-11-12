package codeCracker;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AlphabetMapGeneratorTest {

    @Test
    public void should_generate_conversion_map_of_26_letters_for_alphabet() {
        Map<Character,Character> conversionMap = new AlphabetMapGenerator().generate("qsdfghjklmpoiuytrezawxcvbn");
        assertThat(conversionMap).hasSize(26);
    }

    @Test
    public void should_not_generate_conversion_map_of_26_letters_for_alphabet_when_there_are_duplicate_characters() {
        assertThrows(IllegalArgumentException.class, () -> new AlphabetMapGenerator().generate("qddfghjklmpoiuytrezawxcvbn"));
    }
}