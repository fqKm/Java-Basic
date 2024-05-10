public class Recursive {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
        // Expected result : 34
        System.out.println(power(2,3));
        // Expected result : 8
    }

    // Power/Exponent Recursive Methode
    public static int power(int number, int exponent){
        if (exponent == 0){
            return 1;
        } else {
            return number * power(number, exponent - 1);
        }
    }

    // Fibonacci Recursive Methode
    public static int fibonacci(int number){
        if (number == 0){
            return 0;
        } else if (number == 1){
            return 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
