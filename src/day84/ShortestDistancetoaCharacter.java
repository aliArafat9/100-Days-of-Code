package day84;

public class ShortestDistancetoaCharacter {
    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] output = new int[n];
        int cPosition = -n;

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == c) {
                cPosition = i;
            }
            output[i] = i - cPosition;
        }

        // Reset cPosition to a large value to avoid interference with the second loop
        cPosition = 2 * n;

        for(int i = n - 1; i >= 0; i--) {
            if(s.charAt(i) == c) {
                cPosition = i;
            }
            output[i] = Math.min(output[i], Math.abs(i - cPosition));
        }
        return output;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        int[] result = shortestToChar(s, c);

        // Print the result
        for (int distance : result) {
            System.out.print(distance + " ");
        }
    }
}
