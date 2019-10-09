import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeTest {
    @Test
    public void runencrypt_instantiate(){
        Encode encrypt = new Encode(2,"wamlmbez");
        assertTrue(encrypt instanceof Encode);

    }
   @Test
    public void runencrypt_checkforKey() {
       Encode encrypt = new Encode(2,"wamlmbez");
        assertEquals(2,encrypt.getKey());
    }

    @Test
    public void runEncrypt_checkForExpectedOutput (){
        Encode encrypt = new Encode(2,"wamlmbez");
        assertEquals(2,encrypt.getKey());
    }
}