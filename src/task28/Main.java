package task28;

public class Main {
    public static int sum(int n, int sum) {
        if(n < 10)
            return sum + n;
        return sum(n / 10, sum + n % 10);
    }

    public static void main(String[] args) {
        System.out.println(sum(123456789, 0));
    }
}
