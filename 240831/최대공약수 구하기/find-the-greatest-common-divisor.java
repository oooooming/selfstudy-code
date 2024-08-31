import java.util.Scanner;

public class Main {
    public static void calGCD(int n, int m) {
        int a, b, r, gcd;
        if(n<m) {
            b = n;
            a = m;
        }
        else {
            b = m;
            a = n;
        }

        while(true) {
            r = a % b;
            if(r == 0) {
                gcd = b;
                break;
            }
            a = b;
            b = r;
        }
        
        System.out.print(gcd);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        calGCD(n, m);
    }
}