import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecodingTest {
    Decoding testDecoding = new Decoding(2, "GFYKP OWTKKVJK");
    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("GFYKP OWTKKVJK", testDecoding.getInputText());
    }
}