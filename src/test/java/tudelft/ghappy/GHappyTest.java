package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void test1(){
        GHappy happy = new GHappy();
        Assertions.assertTrue(happy.gHappy("xxggxx"));
    }

    @Test
    public void test2(){
        GHappy happy = new GHappy();
        Assertions.assertFalse(happy.gHappy("xxgxx"));
    }

    @Test
    public void test3(){
        GHappy happy = new GHappy();
        Assertions.assertFalse(happy.gHappy("xxggyygxx"));
    }
}
