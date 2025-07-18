import java.util.Scanner;
public class MenuProgram {
    public static void main(String[] args) {
    int choice;
    Scanner scanner=new Scanner(System.in);
    
    do {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Say Hello");
        System.out.println("2. Say Goodbye");
        System.out.println("3. Exit");
        System.out.print("Enter choice: ");
        choice=scanner.nextInt();
        
        switch(choice){
            case 1 -> System.out.println("Hello!");
            case 2 -> System.out.println("Goodbye!");
            case 3 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid option.");
        }
    } while (choice!=3);
    scanner.close();
}
}
