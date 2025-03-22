import java.util.Scanner;

public class S3 {
    public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value for a: ");
        int a = s.nextInt();
        
        System.out.print("Enter the value for b: ");
        int b = s.nextInt();

    
        if (a > b) {
            System.out.println("The number is greater than b");
        } else {
            System.out.println("The number is greater than a");
        }
        s.close();
    }
}
