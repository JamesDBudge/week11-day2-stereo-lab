public class Radio extends Component{

    private String name;

    public Radio(String name){
        this.name = name;
    }

    public String tune() {
        return "Radio1";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean state(){
        return isOn;
    }
}
