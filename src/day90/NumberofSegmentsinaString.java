package day90;

public class NumberofSegmentsinaString {
    public static int countSegments(String s) {
        int segments = 0;
        for(int i=0; i<s.length(); i++){
            if((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' '){
                segments++;
            }
        }
        return segments;
    }

    public static void main(String[] args) {
        String inputString = "This is a sample string";
        int numberOfSegments = countSegments(inputString);

        System.out.println("Number of segments in the string: " + numberOfSegments);
    }
}
