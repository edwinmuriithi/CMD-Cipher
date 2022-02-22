import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EncodingTest {
    Encoding testEncoding = new Encoding ("EDWIN MURIITHI", 2);
    @Test
    @DisplayName("Encode Instantiates Correctly")
    public void checkIfItCreatesInstance()
    {
        assertEquals(true, testEncoding instanceof Encoding);
    }
    @Test
    @DisplayName("Check if Encode stores input")
    public void checkIfSavesInputText()
    {
        assertEquals("EDWIN MURIITHI", testEncoding.getInputText());
    }

    @Test
    @DisplayName("Check if key is captured correctly")
    public void checkIfKeyIsCaptured ()
    {
        assertEquals(2, testEncoding.getKey());
    }

    @Test
    @DisplayName("Field is not empty")
    public void checkIfFieldIsEmpty ()
    {
        assertEquals(true, testEncoding.isNotEmpty());
    }
}