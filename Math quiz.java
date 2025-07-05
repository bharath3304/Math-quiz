import java.util.Scanner;
import java.util.Random;

class Quiz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        int queo = 5;
        for(int i=1;i<=queo;i++){
            int a = rand.nextInt(10)+1;
            int b = rand.nextInt(10)+1;
            int ans = a+b;
            System.out.println("Q"+"i: "+a+" + "+b+" "+"=");
            int user = sc.nextInt();

            if(user==ans){
                System.out.println("Correct 🎉");
                score++;
            }else{
                System.out.println("❌ wrong");
            }
        }
        System.out.println("You got "+score+" out of "+queo);
    }
}