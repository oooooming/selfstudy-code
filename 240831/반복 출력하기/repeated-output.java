import java.util.Scanner;

public class Main {
    public static void printNLines(int n) {
        for(int i=0; i<n; i++) {
            System.out.print("12345^&*()_");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int rowNum = sc.nextInt();
    printNLines(rowNum);
    }
}