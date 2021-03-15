package m2;

import java.util.Scanner;

class Nivell2Numeros {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        String str = "";
        for(int i = 1; i <= n; i++) {
            str += i;
            System.out.println(str);
        }

    }
}

