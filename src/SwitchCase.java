import java.util.Arrays;

public class SwitchCase {
    public static void main(String[] args) {
        //Switch Case
        char nilai = 'B';
        switch (nilai){
            case 'A':
                System.out.println("Wow anda lulus dengan baik");
                break;
            case 'B':
            case 'C':
                System.out.println("Anda Lulus dengan cukup");
                break;
            default:
                System.out.println("Anda Tidak lulus");
        }
        //Switch Lambda
        switch (nilai){
            case 'A' -> System.out.println("Wow anda lulus dengan baik");
            case 'B', 'C' -> System.out.println("Anda Lulus dengan cukup");
            default -> System.out.println("Anda Tidak lulus");
        }
        String Ucapan;
        Ucapan = switch (nilai){
            case 'A' : yield "Wow anda lulus dengan baik";
            case 'B', 'C' : yield "Anda Lulus dengan cukup";
            default : yield "Anda Tidak lulus";
        };

        System.out.println(Ucapan);
    }
}
