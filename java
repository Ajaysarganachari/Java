DAY 01
//java is a programing language and platform 
// platform means any hardware or software environment which a program runs is known as a platform...
// java has its own run time environment (jre) and application program interface(api)it is called platform...

// public class Num{
//     public static void main(String[] args){
//     System.out.println("HELLO WORLD");
//     }
// }

// public class Num{
//     public static void main(String[] args){
//         String Num1=args[0];
//         String Num2=args[1];

//         int a=Integer.parseInt(Num1);
//         int b=Integer.parseInt(Num2);

//         System.out.println("addtion="+(a+b));
//     }
// }

DAY 02
//there are two coments 1.single line comment 2. multiple line comment
//1.single line comment=single line comment start with two forward slashes(//) and takes between and end of the line is ignored by java will not be excuted (eg.//this is a single line comment).
//2.multiple line=multi line comment start with (/*)and end with (*/)
// java variables=variables is a name of memory location that stores data.it act as a container for values that can be used and manupulated within a program. there are three types of memory location 1.local variable 2.static variable 3.instance variable. and there are two types of data type 1.premitive data type 2.non-premative data type.
//1.local variables= A variable that is declared inside the method is called local variable.it is not accessable outside of it.
// e.g=
// public class Num1{
//     public static void main(String[] args) {
//         int number =20; local varible declared inside the method
//         System.out.println("the number is="+number);
//     }
// }
//2.instance varibles=A variable that is declared inside the class but outside the method is called instance variable.it is not declared as static.
// e.g.
// public class Instance{
//     int i=10;//declare inside the class and outside the method
//     void show(){//normal method/static method
//         System.out.println("instance method");
//         System.out.println("i="+i);
//     }
//     public static void main(String[] args) { //main method
//         System.out.println("main method");
//         Instance s=new Instance();
//         System.out.println("i="+s.i);
//         s.show();
//     }
    
// }
// static varible= A varible that is declared as static is called a static varible.it can not be local and create memory at classloading time.
// e.g.

// public class Static{
//     static int i=10;//declare as a static is called static variable
//     public void show(){
//         System.out.println("static method:"+i);
//     }
//     public static void main(String[] args) {
//         System.out.println("main method");
//         Static s=new Static();
//         s.i=50;
//         s.show();
//     }
// }
