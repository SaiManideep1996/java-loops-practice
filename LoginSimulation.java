import java.util.Scanner;

public class LoginSimulation {
    public static void main(String[] args){
        String correctPassword= "admin2025";
        Scanner scanner=new Scanner(System.in);
        int attempts=0;
        
        while(attempts<3){
            System.out.print("Enter Password: ");
            String input=scanner.nextLine();
            
            if (input.equals(correctPassword)) {
                System.out.println("Access granted.");
                return;
            } else {
                System.out.println("Incorrect Password");
                attempts++;
            }
        }
        System.out.println("Too many attempts.AccountLocked");
        scanner.close();
    }
}
