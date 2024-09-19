import com.sun.source.tree.Tree;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class AbstractClass {


    private final static int MAX_NUMBER =  40;
    private final static int NUMBER = 6;


    public static TreeSet<Integer> createWinningTickets() {
        TreeSet<Integer> winningTickets = new TreeSet<>();

        Random randomNumber = new Random();
        while (winningTickets.size()<NUMBER) {
            int number = randomNumber.nextInt(MAX_NUMBER) +1;
            winningTickets.add(number);
        }

        return winningTickets;
    }

    public static TreeSet<Integer> getWiningTickets() {
        TreeSet<Integer> winingTickets =  new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your tickets");

        while (winingTickets.size() < NUMBER) {
            int userInput = scanner.nextInt();
            winingTickets.add(userInput);
        }
        return winingTickets;
    }

    public static void main(String[] args) {
        TreeSet<Integer> userWiningTickets = getWiningTickets();
        TreeSet<Integer> winningTickets = createWinningTickets();
        userWiningTickets.retainAll(winningTickets);


        System.out.print("Your winning tickets was" +userWiningTickets);
        System.out.print("Your  tickets was" +winningTickets);
    }

}
