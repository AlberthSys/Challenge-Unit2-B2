
import java.util.Scanner;
public class CircularPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        String numberInput = sc.nextLine();
        int longNumber = numberInput.length();
        int counterDock = 0, trainningReverse = 0;
        do {
            int newNumber = Integer.parseInt(numberInput);
            if (ItsPrime(newNumber,longNumber)){
                numberInput = String.valueOf(newNumber);
                numberInput=ReverseNumber(numberInput);
                trainningReverse ++;
            }
            else{
                counterDock = longNumber;
            }
            counterDock++;
        }while(counterDock < longNumber);

        if (trainningReverse==longNumber)
            System.out.print("It's circular prime");
        else
            System.out.print("It's not circular prime");
    }

    public static String ReverseNumber(String number){
        //BASE CASE
        if(number.length()<=1){
            return number;
        }
        //GENERAL CASE
        else{
            return  ReverseNumber(number.substring(1))+number.charAt(0);
        }
    }
    public static boolean ItsPrime(int numero, int longnumber) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
