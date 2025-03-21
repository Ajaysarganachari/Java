import java.util.Scanner;
public class Yes{
    public static void main(String[] args) {
        String choice;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Number:");
            int num=sc.nextInt();
            System.out.println("Square of" +num+ "is=" +num*num);

            System.out.println("Do you want another number[Yes/No]:");
            choice=sc.next();
        }while(choice.equalsIgnoreCase("Yes"));
    }
}
