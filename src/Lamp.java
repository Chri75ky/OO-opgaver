public class Lamp {

    private boolean isLampOn;


    public Lamp(boolean isLampOn){
        this.isLampOn = isLampOn;
    }
    public Lamp(){
        this.isLampOn = false;
    }

    public void switchLightSwitch(){
        if(isLampOn == true){
            this.isLampOn = false;
        }else{
            this.isLampOn = true;
        }
    }

    public boolean getIsLampOn() {
        if(isLampOn == true){
            System.out.println("The lamp is on.");
            return isLampOn;
        }else{
            System.out.println("The lamp is off.");
            return isLampOn;
        }
    }
}

