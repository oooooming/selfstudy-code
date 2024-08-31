import java.util.Scanner;

public class Main {
    public static void findLCD(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        int r, GCD, LCD;
        while(true) {
            r = a % b;
            if(r == 0) {
               GCD = b;
               LCD = n*m/GCD;
               break;
            }
            a = b;
            b = r;
        }
        System.out.print(LCD);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    findLCD(n, m);
    }
}