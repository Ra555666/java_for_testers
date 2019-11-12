public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello, world");

        double l = 5;
        System.out.println("Area square with side " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Area square with sides " + a + " and " + b + " = " + area(a, b));
    }

    public static double area(double len) {
        return len * len;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}