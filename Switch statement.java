import java.util.Scanner;
public class Simple{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("enter any number:");
    int colour=s.nextInt();
        switch (colour){
            case 1:
                System.out.println("White");
                break;
        
        case 2:
            System.out.println("pink");
            break;
        
        case 3:
            System.out.println("yellow");
            break;
            case 4:
                System.out.println("blue");
                break;
            case 5:
                System.out.println("Black");
                break;
                case 6:
                    System.out.println("Purple");
                    break;
                    case 7:
                        System.out.println("Orange");
                        break;
                        case 8:
                            System.out.println("Green");
                            break;
                            case 9:
                                System.out.println("Blue");
                                break;
                                default:
                                    System.out.println("Envalid number");
            
        }
        s.close();
    }
}
