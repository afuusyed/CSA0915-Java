public class conversiondatatypes {
    public static void main(String[] args) {

        byte byteValue = 50;
        short shortValue = byteValue;
        System.out.println("Implicit conversion from byte to short: " + shortValue);


        int intValue = 1000;
        long longValue = intValue;
        System.out.println("Implicit conversion from int to long: " + longValue);

        float floatValue = 3.14f;
        double doubleValue = floatValue;
        System.out.println("Implicit conversion from float to double: " + doubleValue);

        int intValue2 = 2000;
        short shortValue2 = (short) intValue2;
        System.out.println("Explicit conversion from int to short: " + shortValue2);

        double doubleValue2 = 123.456;
        int intValue3 = (int) doubleValue2;
        System.out.println("Explicit conversion from double to int: " + intValue3);


        int maxIntValue = Integer.MAX_VALUE;
        int overflowedInt = maxIntValue + 1;
        System.out.println("Overflow scenario for int: " + overflowedInt);

        byte minByteValue = Byte.MIN_VALUE;
        byte underflowedByte = (byte) (minByteValue - 1);
        System.out.println("Underflow scenario for byte: " + underflowedByte);
}
}
