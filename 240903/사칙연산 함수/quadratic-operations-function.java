import java.util.Scanner;

public class Main {
    public static int add(int a, int c) {
        return a+c;
    }
    public static int sub(int a, int c) {
        return a-c;
    }
    public static int mul(int a, int c) {
        return a*c;
    }
    public static int div(int a, int c) {
        return (int)(a/c);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        char o = s.charAt(0);
        int c = sc.nextInt();

        if(o=='+')
            System.out.println(a + " " + o + " " + c + " = " + add(a, c));
        else if(o=='-')
            System.out.println(a + " " + o + " " + c + " = " + sub(a, c));
        else if(o=='*')
            System.out.println(a + " " + o + " " + c + " = " + mul(a, c));
        else if(o=='/')
            System.out.println(a + " " + o + " " + c + " = " + div(a, c));
        else
            System.out.println("False");
    }
}