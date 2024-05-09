public class Looping {
    public static void main(String[] args) {
        for (var i = 0; i < 10; i++){
            System.out.println("for " + i);
        }

        // While Loop
        var j = 0;
        while (j <= 10){
            System.out.println("while " + j);
            j++;
        }

        // Do-While Loop

        var k = 0;
        do{
            System.out.println("do " + k);
            k++;
        } while(k <= 10);

        // break & continue
        var l = 0;
        while(l <= 10){
            if (l == 5) {
                break;
            }
            l++;
        }
        System.out.println(l + " stopped with break condition");


        for(var m = 0; m <= 100; m++){
            if(m % 2 == 1){
                continue;
            }
            System.out.println("even number : " + m);
        }
        // For each
        int[] array = {
               1,2,3,4,5,6,7,8,9,10
        };

        for(var number : array){
            System.out.println(number);
        }
    }
}
