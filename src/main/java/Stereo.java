public class Stereo {

    CdPlayer cdPlayer;
    Radio radio;
    TapeDeck tapeDeck;
    String name;

    public Stereo(String name){
        this.cdPlayer = new CdPlayer("JVC", "I don't care", 1);
        this.tapeDeck = new TapeDeck("Sony", "Not Walkman", 1);
        this.radio = new Radio("Radio2");
        this.name = name;
    }

}
