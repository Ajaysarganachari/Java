public class Fact {

    public static void main(String[] args) {
        String a=args[0];

        int num=Integer.parseInt(a);
        int fact=1;
        for(int i=1;i<=num;i++)
           fact= fact*i;
            System.out.println(fact);
        
    }
    
}
