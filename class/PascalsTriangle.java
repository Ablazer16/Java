public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 4;
        PascalsTriangle g = new PascalsTriangle();
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" "+ g.factorial(i)/ (g.factorial(i - k)* g.factorial(k)));
            }
            System.out.println();
        }
    }
    public int factorial(int l){
        if (l == 0)
            return 1;
        return l * factorial(l - 1);
    }
}
