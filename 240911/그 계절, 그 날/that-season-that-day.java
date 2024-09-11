import java.util.Scanner;

public class Main {
    public static boolean leapYear(int Y) {
        if(Y%4==0) {
            if(Y%100==0) {
                if(Y%400==0) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }
    public static boolean existDay(int Y, int M, int D) {
        if(leapYear(Y) && M==2) { // 윤년의 2월이라면 
            if(D>=1 && D<=29) {
                return true;
            }
        }
        else { // 윤년의 2월이 아니라면
            if((M<8 && M%2!=0) || (M>=8 && M%2==0)) {
                if(D>=1 && D<=31) {
                    return true;
                }
            }
            else if(M==2) {
                if(D>=1 && D<=28) {
                    return true;
                }
            }
            else {
                if(D>=1 && D<=30) {
                    return true;
                }
            }
        }
        return false;
    }
    public static String whichSeason(int Y, int M, int D) {
        if(existDay(Y, M, D)) { // 존재라는 날이라면 
            if(M>=3 && M<=5) {
                return "Spring";
            }
            else if(M>=6 && M<=8) {
                return "Summer";
            }
            else if(M>=9 && M<=11) {
                return "Fall";
            }
            else {
                return "Winter";
            }
        }
        else { // 존재하지 않는 날이라면 
            return "-1";
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        System.out.println(whichSeason(Y, M, D));
    }
}