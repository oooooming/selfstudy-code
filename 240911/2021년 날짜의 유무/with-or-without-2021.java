import java.util.Scanner;

public class Main {
    public static boolean existDay(int M, int D) {
        if (M < 1 || M > 12) {
            return false;
        } 
        else if ((M < 8 && M % 2 != 0) || (M >= 8 && M % 2 == 0)) {
            if (D <= 31 && D >= 1) {
                return true;
            }
        } 
        else if (M == 2) {
            if (D <= 28 && D >= 1) {
                return true;
            }
        } 
        else {
            if (D <= 30 && D >= 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();

        if (existDay(M, D)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}