import java.util.Scanner;


public class Console {
    public void out(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to PC Part Picker Generator");
        System.out.print("How much money are you willing to spend? (dollars)");
        int budget = scanner.nextInt();
        System.out.println("You have a budget of $" + budget);
        scanner.close();
    }
}
