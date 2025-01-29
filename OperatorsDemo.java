
public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("\nRelational Operators:");
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("\nLogical Operators:");
        System.out.println("a > b && a == 10 = " + ((a > b) && (a == 10)));
        System.out.println("a > b || a == 5 = " + ((a > b) || (a == 5)));
        System.out.println("!(a > b) = " + !(a > b));
    }
}

