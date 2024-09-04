import java.util.Scanner;

public class Main {
    public static boolean consecutiveNum(int[] A, int[] B) {
        if(A.length > B.length){
            for(int i=0; i<A.length; i++) {
                if(B[0] == A[i])
                    for(int j=0; j<B.length; j++) {
                        if(B[j] != A[i+j])
                            return false;
                    }
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] A = new int[n1];
        for(int i=0; i<n1; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[n2];
        for(int i=0; i<n2; i++) {
            B[i] = sc.nextInt();
        }
        if(consecutiveNum(A, B))
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
}