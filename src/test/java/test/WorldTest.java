package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class WorldTest {

    @Test
    public void greetResultsInHello() {
        World world = new World();
        assertEquals("Hello world", world.greet());
    }

}
