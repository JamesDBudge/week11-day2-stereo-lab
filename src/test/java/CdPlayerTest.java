import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CdPlayerTest {

    CdPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CdPlayer("Denon", "200", 1);
    }

    @Test
    public void canGetNextTrack(){
        cdPlayer.getNextTrack();
        assertEquals(2, cdPlayer.getTrack());
    }

    @Test
    public void canPlayCd(){
        assertEquals("I am playing a cd", cdPlayer.play());
    }

    @Test
    public void cdPlayerStartsOff(){
        assertEquals(false, cdPlayer.state());
    }

    @Test
    public void cdPlayerTurnsOn(){
        cdPlayer.changeState();
        assertEquals(true, cdPlayer.state());
    }
}
