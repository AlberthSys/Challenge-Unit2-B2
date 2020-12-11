import java.util.*;

public class Reto1 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int numberTry = sc.nextInt();

        for (int i = 0; i<numberTry;i++){

            String names = sc.next();
            String relationship = sc.next();

            if(names.equals("Luke") && relationship.equals("padre")){
                System.out.println("TOP SECRET");
            }
            else{
                System.out.println(names + ", yo soy tu " + relationship);
            }
        }
    }
}
