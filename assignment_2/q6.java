public class q6 {
    public static void main(String[] args) {
        System.out.println("..Basic type to object type conversion..");
        int value = 10;
        Integer intValue = Integer.valueOf(value);
        System.out.println("Converted int to Integer type");
        System.out.println("..Object type to basic type..");
        int data = intValue.intValue();
        System.out.println("Value of Integer object: " + data);
        System.out.println("..basic type to string..");
        value = 100;
        String value_in_str = String.valueOf(value);
        System.out.println("Value of " + value + " in string: " + value_in_str);
        System.out.println("..string to numeric object..");
        Integer num = Integer.decode(value_in_str);
        System.out.println("..Numeric object to string..");
        System.out.println("Converting Integer object to String: " + num.toString());

    }
}
