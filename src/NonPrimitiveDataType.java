public class NonPrimitiveDataType {
    public static void main(String[] args) {
        Integer initInteger = 10;
        Long initLong = 10000L;
        Boolean initBoolean = true;
        Byte initByte = null;

        System.out.println(initByte); // Error. default value = null
        initByte = 100;
        System.out.println(initByte);


        // Primitive -> NonPrimitive Conversion
        byte inibyte = 12;
        Byte iniByte = inibyte;
        System.out.println(iniByte);
        byte inibyte2 = iniByte;
        System.out.println(inibyte2);

        // Conversion different datatype
        int age = 98;
        Integer ageInt = age;

        short shortAge = ageInt.shortValue();
        System.out.println(shortAge);
        byte byteAge = ageInt.byteValue();
        System.out.println(byteAge);
    }


}
