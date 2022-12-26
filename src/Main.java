import java.util.Scanner;   //importing Scanner class for take input by user
import java.util.Random ;   // importing Random class for take a random number by computer

public class Main {
    public static void main(String[] args) {
        int user = 0, computer = 0, equal = 0;
        int n =4;
        for(int i=0; i<n; i++) {
            System.out.println("Enter your number : \n1.Rock \n2.Paper \n3.Scissor");
            Scanner sc = new Scanner(System.in);
            int C = sc.nextInt();
//            System.out.println("Please choose your number");
            if (C == 1) {
                System.out.println("user choose : Rock");
            } else if (C == 2) {
                System.out.println("user choose : Paper");
            } else if (C == 3) {
                System.out.println("user choose : Scissor");
            } else {
                System.out.println("Please choose valid input");
            }


            Random ran = new Random();
            int r = ran.nextInt(3);

            if (r == 0) {
                System.out.println("Computer choose : Rock");
            } else if (r == 1) {
                System.out.println("Computer choose : Paper");
            } else {
                System.out.println("Computer choose : Scissor");
            }


             if( C == 1 && r == 2 || C == 2 && r == 0 || C == 3 && r == 1 ){
                 System.out.println("You win the match");
                 user++;
             }else if(C == 1 && r == 0 || C == 2 && r == 1 || C == 3 && r == 2 ){
                 System.out.println("You both choose same ");
                 equal++;
             }else{
                 System.out.println("Computer win the match");
                 computer++;
             }
        }
        System.out.println("You win" + user + "times");
        System.out.println("Computer win" + computer + "times");
        System.out.println("Both equal" + equal + "times");
    }
}