import java.util.Scanner;


public class Console {
    public void out(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to PC Part Picker Generator");
        System.out.print("How much money are you willing to spend? (dollars)");
        int budget = scanner.nextInt();
        System.out.println("You have a budget of $" + budget);
        char cpu = ' ';
        while (true) {
            System.out.print("Do you want amd(1) or intel(2) ?");
            int choice = scanner.nextInt();
            if (choice == 1){
                cpu = 'a';
                break;
            }
            else if (choice == 2){
                cpu = 'i';
                break;
            }
            System.out.println("Invalid choice");
        }
        char gpu = ' ';
        while (true) {
            System.out.print("Do you want nvidia(1) or amd(2) ?");
            int choice = scanner.nextInt();
            if (choice == 1){
                gpu = 'n';
                break;
            }
            else if (choice == 2){
                gpu = 'a';
                break;
            }
            System.out.println("Invalid choice");
        }
        Pick part =  new Pick();
        String mycpu = part.cpu(cpu, budget);
        String mygpu = part.gpu(gpu, budget);
        System.out.println("Your CPU is: " + mycpu);
        System.out.println("Your GPU is: " + mygpu);
        
    }
}
