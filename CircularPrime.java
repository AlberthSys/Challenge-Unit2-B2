
/*Create a function that returns if a number is Circular prime or not. A
Circular prime number is the number that is prime in every rotation of their
digits. For example: 1193 is circular prime because 1931,9311,3119 and 1193 are
prime numbers. https://en.wikipedia.org/wiki/Circular_prime Hint: You can use
the number as a String to make the rotations and transform it later to integer
to make the divisions. Remember to catch all the possible exceptions.*/
//ALBERTO JAVIER BAENA
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
                System.out.println(numberInput);
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
