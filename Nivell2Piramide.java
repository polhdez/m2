package m2;

import java.util.Scanner;

class Nivell2Piramide {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int count = 0;
        for(int i = n - 1; i >= 0; i--) {
            String str = "";

            // Afegir spacers
            for(int j = 0; j < count; j++) {
                str += ' ';
            }

            // Afegir asteriscos
            int nAsteriscos = 1 + 2 * i;
            for(int k = 0; k < nAsteriscos; k++) {
                str += '*'; 
            }
            count++;
            System.out.println(str);
        }
    }

}


