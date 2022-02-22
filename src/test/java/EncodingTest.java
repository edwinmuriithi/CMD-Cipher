import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EncodingTest {
    Encoding testEncoding = new Encoding ("EDWIN MURIITHI", 2);
    @Test
    public void checkIfItCreatesInstance()
    {
        assertEquals(true, testEncoding instanceof Encoding);
    }
    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("EDWIN MURIITHI", testEncoding.getInputText());
    }
}