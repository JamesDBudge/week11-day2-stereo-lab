public abstract class Component {

    protected Boolean isOn;

    public Component(){
        this.isOn = false;
    }

    public Boolean getComponentState(){
        return isOn;
    }

}
