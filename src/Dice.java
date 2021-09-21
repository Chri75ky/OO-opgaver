
public class Dice {
    private int faceValue;


    public Dice(){
        this.faceValue = faceValue;
    }

    public void roll(){
        int randomNumber = 1 + ((int) (Math.random() * 6));
        this.faceValue = randomNumber;
    }

    public int getFaceValue() {
        return faceValue;
    }

}
