public class Methode {
    public static void main(String[] args) {
        String name = "Paijo";
        greetings(name);


        // Invoke Sum Methode
        var total = sum(100, 10);
        System.out.println(total);

        // Or
        System.out.println(sum(80, 20));

        // Invoke Operation Methode
        System.out.println(operation(24,'/', 2.4));

        // Invoke congrats methode
        congrats("Paijo", 80,90,32,18,90,100,100,90);

        // Invoke Second congrats methode
        congrats(80,70,95,65,90,85,80);
    }

    static void greetings(String name){
        System.out.println("Hello! My name is " + name);
    }

    // Method With Return
    static int sum(int a, int b){
        var total = a + b;
        return total;
    }

    static double operation (double a, char operand, double b ){
        switch (operand){
            case '+' : return a + b;
            case '-' : return a - b;
            case '*' : return a * b;
            case '/' : return a / b;
        };
        return 0;
    }

    // Methode Variable Arguments
    static void congrats(String name, int... score){
        var total = 0;
        for(var scores : score){
            total += scores;
        }
        var mean = total / score.length;

        if(mean >= 75){
            System.out.println("Congratulation, " + name + "! You are passing the test");
        } else {
            System.out.println("Sorry " + name + ", you must study more");
        }
    }

    // Methode Overloading
    static void congrats(int ...score){
        var total = 0;
        for(var scores : score){
            total += scores;
        }
        var mean = total / score.length;

        if(mean >= 75){
            System.out.println("Congratulation, You are passing the test");
        } else {
            System.out.println("Sorry, you must study more");
        }

    }
}
