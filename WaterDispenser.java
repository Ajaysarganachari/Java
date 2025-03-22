import java.util.Scanner;

public class WaterDispenser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("RO Water");
        System.out.println("enter 5 rupee for 10ltr");
        System.out.println("enter 10 rupee for 20ltr");
        System.out.println("enter 15 rupee for 30ltr");
        System.out.println("enter 20 rupee for 400ltr");
        System.out.print("enter the amount: ");
        
        int expr = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after integer input
        
        switch (expr) {
            case 5:
                System.out.println("10ltr.");
                System.out.println("enter a hot");
                System.out.println("enter b cold");
                System.out.println("enter c normal");
                System.out.print("enter the option: ");
                char option = scanner.nextLine().charAt(0);
                
                switch (option) {
                    case 'a':
                        System.out.println("drop filtered water");
                        break;
                    case 'b':
                        System.out.println("drop unfiltered water");
                        break;
                    case 'c':
                        System.out.println("drop corporation water");
                        break;
                    default:
                        System.out.println("invalid input");
                }
                break;
                
            case 10:
                System.out.println("10ltr.");
                System.out.println("enter a hot");
                System.out.println("enter b cold");
                System.out.println("enter c normal");
                System.out.print("enter the option: ");
                option = scanner.nextLine().charAt(0);
                
                switch (option) {
                    case 'a':
                        System.out.println("drop filtered water");
                        break;
                    case 'b':
                        System.out.println("drop unfiltered water");
                        break;
                    case 'c':
                        System.out.println("drop corporation water");
                        break;
                    default:
                        System.out.println("invalid input");
                }
                break;
                
            case 15:
                System.out.println("10ltr.");
                System.out.println("enter a hot");
                System.out.println("enter b cold");
                System.out.println("enter c normal");
                System.out.print("enter the option: ");
                option = scanner.nextLine().charAt(0);
                
                switch (option) {
                    case 'a':
                        System.out.println("drop filtered water");
                        break;
                    case 'b':
                        System.out.println("drop unfiltered water");
                        break;
                    case 'c':
                        System.out.println("drop corporation water");
                        break;
                    default:
                        System.out.println("invalid input");
                }
                break;
                
            case 20:
                System.out.println("10ltr.");
                System.out.println("enter a hot");
                System.out.println("enter b cold");
                System.out.println("enter c normal");
                System.out.print("enter the option: ");
                option = scanner.nextLine().charAt(0);
                
                switch (option) {
                    case 'a':
                        System.out.println("drop filtered water");
                        break;
                    case 'b':
                        System.out.println("drop unfiltered water");
                        break;
                    case 'c':
                        System.out.println("drop corporation water");
                        break;
                    default:
                        System.out.println("invalid input");
                }
                break;
                
            default:
                System.out.println("Invalid amount entered");
        }

        scanner.close();
    }
}
