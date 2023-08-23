package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        //아스키 코드(ANSI) : 미국 표준 코드
        //알파벳 대문자(A)는 65부터 시작, 소문자(a)는 97 부터 시작, 숫자(0)는 68부터 시작.
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        c ='B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        String[][] seats = new String[10][15];
        char ch = 'A';

        // char형이 seats배열에 들어가기 위해서는 String으로 형 변환이 되어야 한다.
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = String.valueOf(ch) + (j + i);
            }
            ch++;
        }
    }
}
