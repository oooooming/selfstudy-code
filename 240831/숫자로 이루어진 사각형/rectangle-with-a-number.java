import java.util.Scanner;

public class Main {
    public static void printSquare(int n) {
        int a = 1;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(a<10) {
                    System.out.print(a + " ");
                    a++;
                }
                else {
                    a=1;
                    System.out.print(a + " ");
                    a++;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSquare(n);
    }
}