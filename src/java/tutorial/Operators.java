package java.tutorial;

public class Operators {

    public static void letfShiftOperatorExample() {
        System.out.println(10 << 2);//10*2^2=10*4=40
        System.out.println(10 << 3);//10*2^3=10*8=80
        System.out.println(20 << 2);//20*2^2=20*4=80
        System.out.println(15 << 4);//15*2^4=15*16=240
    }

    public static void rightShiftOperatorExample() {
        System.out.println(10 >> 2);//10/2^2=10/4=2
        System.out.println(20 >> 2);//20/2^2=20/4=5
        System.out.println(20 >> 3);//20/2^3=20/8=2

    }

    public static void logicalAndBitwiseDifference() {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a++ < c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a < b & a++ < c);//false && true = false
        System.out.println(a);//11 because second condition is checked
    }

    public static void ternaryOperatorExample() {
        int a = 2;
        int b = 5;
        int min = (a < b) ? a : b;
        System.out.println(min);
    }

    public static void assignmentOperatorExample() {
        int a = 10;
        a += 3;//10+3
        System.out.println(a);
        a -= 4;//13-4
        System.out.println(a);
        a *= 2;//9*2
        System.out.println(a);
        a /= 2;//18/2
        System.out.println(a);
    }

    public static void addingShortCurio() {
        short a = 10;
        short b = 10;
        a += b;// ok
        a = (short) (a + b);// w/o downcasting we'll get compile time error because (a = a + b) 10+10=20 now int
        System.out.println(a);
    }
}

