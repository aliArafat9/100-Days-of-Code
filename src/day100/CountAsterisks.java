package day100;

public class CountAsterisks {
    public int countAsterisks(String s) {
        int j = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*')
                count++;

            if (s.charAt(i) == '|') {
                j = i + 1;
                while (s.charAt(j) != '|') {
                    j++;
                }
                i = j;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        CountAsterisks countAsterisks = new CountAsterisks();
        String inputString = "This is a sample string with *** some asterisks | and more asterisks | in between.";

        int result = countAsterisks.countAsterisks(inputString);

        System.out.println("Number of asterisks in the string: " + result);
    }
}
