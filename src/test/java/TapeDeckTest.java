import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapeDeckTest {

    TapeDeck tapeDeck;

    @Before
    public void before(){
        tapeDeck = new TapeDeck("Teac", "2000", 1);
    }

    @Test
    public void canGetNextTrack(){
        tapeDeck.getNextTrack();
        assertEquals(2, tapeDeck.getTrack());
    }

    @Test
    public void canPlayTape(){
        assertEquals("I am playing a tape", tapeDeck.play());
    }

    @Test
    public void tapeDeckStartsOff(){
        assertEquals(false, tapeDeck.state());
    }

}
