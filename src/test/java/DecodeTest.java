import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTest{
    @Test
    public void runDecrypt_decryptedText() {
        Decode decrypt = new Decode(2,"wamlambez");
        assertTrue(decrypt instanceof Decode);
    }

    @Test
    public void rundecrypt_checkforKey() {
        Decode decrypt = new Decode(2,"wamlambez");
        assertEquals(2,decrypt.getKey());
    }

    
}