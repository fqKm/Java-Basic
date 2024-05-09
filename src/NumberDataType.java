public class NumberDataType {
    public static void main(String[] args) {
        byte Byte = 127; // 1 byte
        short Short = 32767; // 2 bytes
        int Int = 2147483647; // 4 bytes
        long Long = 9223372036854775807L; // 8 bytes

        float Float = 3.4E38F; // 4 bytes
        double Double = 1.7E308; // 8 bytes

        int decimal = 2147483647;
        int hexDecimal = 0xEF2; // 0x
        int binaryDecimal = 0b1010; // 0b

        int Literals = 1000000000;
        int UnderScores = 1_000_000_000;

        // Data Type Conversion
        // Widening Casting : byte -> short -> int -> long -> float -> double

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniLong;

        //Narrowing Casting : (can't)

        double initDouble = 10.0;
        float initFloat = (float)  initDouble;
        long initLong = (long)  initFloat;
        int initInt = (int)  initLong;
        int initShort = (short) initInt;

        System.out.println(iniDouble);
        System.out.println(initFloat);
    }
}
