public class Array {
    public static void main(String[] args) {
        int[] number= new int[10];

        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        number[5] = 6;
        number[6] = 7;
        number[7] = 8;
        number[8] = 9;
        number[9] = 10;

        String[] name = {
                "Jhoni", "Aldi", "Tom", "Scott", "Mao", "Lenin"
        };

        // Invoke array value
        System.out.println(number[0]);
        System.out.println(name[3]);

        // Invoke array values with looping
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }

        for (int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }

        // Or use this
        for (String i : name) {
            System.out.println(i);
        }

        for (int i : number){
            System.out.println(i);
        }
    }
}
