package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void testmessage(){
        CaesarShiftCipher shift = new CaesarShiftCipher();
        String result = shift.CaesarShiftCipher("abc",3);
        Assertions.assertEquals("def", result);
    }
    @Test
    public void testmessage2(){
        CaesarShiftCipher shift = new CaesarShiftCipher();
        String result = shift.CaesarShiftCipher("xyz", 3);
        Assertions.assertEquals("abc", result);
    }

    @Test
    public void testmessage3(){
        String result = new CaesarShiftCipher().CaesarShiftCipher("a",2);
        Assertions.assertEquals("c", result);
    }
}
