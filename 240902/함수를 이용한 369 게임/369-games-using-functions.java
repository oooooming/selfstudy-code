import java.util.Scanner;

public class Main {
    public static boolean isMagicNum(int i) {
        return i%3==0 || e369(i);
    }

    public static boolean e369(int i) {
        String s = Integer.toString(i);
        return s.contains("3") || s.contains("6") || s.contains("9");
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