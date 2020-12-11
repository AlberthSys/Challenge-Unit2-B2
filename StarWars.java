import java.util.*;
//ALBERTO J BAENA
//we seek relationship and hide the key of revelation
public class StarWars {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        //numbers of try
        int numberTry = sc.nextInt();

        for (int i = 0; i<numberTry;i++){

            String names = sc.next();
            String relationship = sc.next();
            //Looking the same
            if(names.equals("Luke") && relationship.equals("padre")){
                System.out.println("TOP SECRET");
            }
            else{
                System.out.println(names + ", yo soy tu " + relationship);
            }
        }
    }
}
