public class ExampleOperator22 { 
    public static void main(String[] args) {
        int x = 10;
        System.out.println("initial value of x = " + x);
        System.out.println("X++ = " + x++);
        System.out.println("After evaluation, x =" +x);
        x = 10;
System.out.println("Initial value of x = " +x);
System.out.println("++x + " + ++x);
System.out.println("After evaluation, x = " + x);
int y = 12;
System.out.println(x > y || y == x && y <= x);
int z = x^y;
System.out.println("The final result is " +z);

    }
}
