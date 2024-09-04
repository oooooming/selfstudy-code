import java.util.Scanner;

public class Main {
    public static boolean Onjeonsu(int i) {
        if(i%2==0)
            return false;
        else if(i%10==5)
            return false;
        else if(i%3==0 && i%9!=0)
            return false;
        return true;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i=a; i<=b; i++) {
            if(Onjeonsu(i))
                cnt++;
        }

        System.out.println(cnt);
    }
}