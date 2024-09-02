import java.util.Scanner;

public class Main {
    public static String even5(int n) {
        int a = n/10;
        int b = n%10;

        if(b%2==0 && (a+b)%5==0) {
            return "Yes";
        }
        else {
            return "No";
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(even5(n));
    }
}