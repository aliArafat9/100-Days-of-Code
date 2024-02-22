package day83;

public class FindtheTownJudge {
    public static int findJudge(int N, int[][] trust) {
        int[] in = new int[N + 1];
        int[] out = new int[N + 1];
        for (int[] a : trust) {
            out[a[0]]++;
            in[a[1]]++;
        }
        for (int i = 1; i <= N; ++i) {
            if (in[i] == N - 1 && out[i] == 0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 4;
        int[][] trust = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};

        int townJudge = findJudge(N, trust);
        System.out.println("The town judge is: " + townJudge);
    }
}
