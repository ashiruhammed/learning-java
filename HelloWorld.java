import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your input number");

        int userInput = scanner.nextInt();
        int sum = 0;
        while(userInput>0){
           int perPart = userInput % 10;
           if(perPart%2==0) {
           sum+=perPart;
           }
           userInput = userInput/10;
        }

        System.out.print(sum);


    }
}
