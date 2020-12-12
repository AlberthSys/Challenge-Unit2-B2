import java.util.Scanner;

public class CaminandoVoy {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long maxHigher = 0, numbersTry = 0, level = 0,
                startLevel = 0, numberStretch = 0,
                addHigher = 0, higherTotal = 0, addMaxIncrement = 0;

        while (sc.hasNext()){
            maxHigher = sc.nextInt();
            numbersTry = sc.nextInt();

            while(numberStretch < numbersTry) {
                level = sc.nextInt();

                if (numberStretch == 0) {
                    startLevel = level;
                } else {
                    addHigher = level - startLevel;

                    if (level > startLevel) {
                        higherTotal += addHigher;
                        if (higherTotal > maxHigher) {
                            addMaxIncrement++;
                        }
                    } else {
                        higherTotal = 0;
                    }
                }
                startLevel = level;
                numberStretch++;
            }
            if (addMaxIncrement > 0){
                System.out.println("NO APTA");
            }
            else{
                System.out.println("APTA");
            }
            maxHigher = 0;
            numbersTry = 0;
            level = 0;
            startLevel = 0;
            numberStretch = 0;
            addHigher = 0;
            higherTotal = 0;
            addMaxIncrement = 0;
        }
    }
}
