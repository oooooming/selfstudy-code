import java.util.Scanner;

public class Main {
    public static int addPrime(int a, int b) {
        int sum = 0;

        for(int i=a; i<=b; i++) {
            if(isPrime(i))
                sum += i;
        }
        return sum;
    }
    public static boolean isPrime(int i) {
        for(int j=2; j<i; j++) {
            if(i%j==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(addPrime(a, b));
    }
}