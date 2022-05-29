import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("What is 1+1?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer == 2){
            System.out.println("You are correct");
        }
        else System.out.println("You are incorrect");
        if (answer <2){
            System.out.println("You are close");
        }
    }
}
