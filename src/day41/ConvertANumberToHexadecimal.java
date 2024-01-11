package day41;

public class ConvertANumberToHexadecimal {

    //??
    public static String toHex(int num) {

        return Integer.toHexString(num);
    }

    public static void main(String[] args) {
        System.out.println(toHex(26));
    }
}