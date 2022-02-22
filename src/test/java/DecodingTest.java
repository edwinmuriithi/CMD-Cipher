import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecodingTest {
    Decoding testDecoding = new Decoding(2, "GFYKP OWTKKVJK");
    @Test
    @DisplayName("Decode Instantiates Correctly")
    public void checkIfItCreatesInstance()
    {
        assertEquals(true, testDecoding instanceof Decoding);
    }
    @Test
    @DisplayName("Check if Decode stores input")
    public void checkIfSavesInputText()
    {
        assertEquals("GFYKP OWTKKVJK", testDecoding.getInputText());
    }
    @Test
    @DisplayName("Check if key is captured correctly")
    public void checkIfKeyIsCaptured ()
    {
        assertEquals(2, testDecoding.getKey());
    }

    @Test
    public void isValidInputText()
    {
        assertEquals(true, testDecoding.isValidInputText());
    }

}