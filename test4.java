public class Main {
    public static void main(String[] args) {
        int n = 4;
        int s = 2 * n - 1;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                int t = i;
                int l = j;
                int r = s - 1 - j;
                int b = s - 1 - i;
                int m = Math.min(Math.min(t, b), Math.min(l, r));

                System.out.print((n - m) + " ");
            }
            System.out.println();
        }
    }
}
