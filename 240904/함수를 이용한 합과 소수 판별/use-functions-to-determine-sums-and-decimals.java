import java.util.Scanner;

public class Main {
    public static boolean isMagicNum(int i) {
        return isPrimeNum(i) && isEvenNum(i);
    }
    public static boolean isPrimeNum(int i) {
        if(i==1)
            return false;

        for(int j=2; j<i; j++) {
            if(i%j==0)
                return false;
        }

        return true;
    }
    public static boolean isEvenNum(int i) {
        int sum = 0;

        while(i>0) {
            sum += i%10;
            i = i/10;
        }

        if(sum%2==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i=a; i<=b; i++) {
            if(isMagicNum(i)) 
                cnt++;
        }

        System.out.println(cnt);
    }
}