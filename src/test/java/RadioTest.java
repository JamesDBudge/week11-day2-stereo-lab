import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Cambridge Audio");
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Radio1", radio.tune());
    }

    @Test
    public void radioHasName(){
        assertEquals("Cambridge Audio", radio.getName());
    }

    @Test
    public void radioStartsOff(){
        assertEquals(false, radio.state());
    }

}
