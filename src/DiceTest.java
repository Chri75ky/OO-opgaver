
import java.util.Arrays;

public class DiceTest {
    public static void main(String[] args) {
        // Test to check if Dice class works
        Dice dice = new Dice();
        dice.roll();
        int faceValue = dice.getFaceValue();
        System.out.println(faceValue);

        System.out.println();
        System.out.println();

        // Test of the array
        int[] fiveDice = new int[5];
        int sumOfRolls = 0;

        for (int i = 0; i < 5; i++) {
            dice.roll();
            fiveDice[i] = dice.getFaceValue();
            sumOfRolls += dice.getFaceValue();
        }

        System.out.println(Arrays.toString(fiveDice));
        System.out.println(sumOfRolls);


    }
}
