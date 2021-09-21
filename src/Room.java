public class Room {

    public static void main(String[] args) {
        Lamp deskLamp = new Lamp(true);
        Lamp bedLamp = new Lamp();
        Lamp roomLamp = new Lamp(true);


        if(deskLamp.getIsLampOn() == true){

        }
        deskLamp.getIsLampOn();
        bedLamp.getIsLampOn();
        roomLamp.getIsLampOn();

        deskLamp.switchLightSwitch();
        bedLamp.switchLightSwitch();
        roomLamp.switchLightSwitch();

        System.out.println();
        System.out.println();

        deskLamp.getIsLampOn();
        bedLamp.getIsLampOn();
        roomLamp.getIsLampOn();

    }
}
