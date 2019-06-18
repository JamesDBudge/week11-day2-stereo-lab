public class TapeDeck extends Component implements IPlay{

    private String make, model;
    private int track;

    public TapeDeck(String make, String model, int track){
        this.make = make;
        this.model = model;
        this.track = track;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNextTrack(){
        return track++;
    }

    public int getPreviousTrack(){
        return track --;
    }

    public int getTrack() {
        return track;
    }

    public void setTrack(int track) {
        this.track = track;
    }

    public String play(){
        return "I am playing a tape";
    }

    public Boolean state() {
        return isOn;
    }


}
