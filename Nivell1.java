package m2;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class Nivell1 {
    public static void main(String args[]) {

        // Fase 1
        char[] nom = {'P','o','l',' ','H','e','r','n','a','n','d','e','z'};
        for(int i = 0; i < nom.length; i++) {
            System.out.println(nom[i]);
        }

        // Fase 2
        List<Character> llista = new ArrayList<Character>();
        llista.add('P');
        llista.add('o');
        llista.add('l');
        llista.add(' ');
        llista.add('H');
        llista.add('e');
        llista.add('r');
        llista.add('n');
        llista.add('a');
        llista.add('n');
        llista.add('d');
        llista.add('e');
        llista.add('z');

        for(int i = 0; i < llista.size(); i++) {
            
            char lletra = Character.toLowerCase(llista.get(i));
            if (lletra == ' ') {
                System.out.println("WHITESPACE");
            }
            else if (Character.isDigit(lletra)) {
                System.out.println("Els noms de persones no contenen números!");
            }
            else if (lletra == 'a' || lletra == 'e' || lletra == 'i' || lletra == 'o' || lletra == 'u') {
                System.out.println("VOCAL");
            }
            else {
                System.out.println("CONSONANT");
            }
        }

        // Fase 3
        HashMap<Character,Integer> mapa = new HashMap<Character,Integer>();
        for(int i = 0; i < llista.size(); i++) {
            if (mapa.containsKey(llista.get(i)))  {
                mapa.put(llista.get(i), mapa.get(llista.get(i)) + 1);
            } else {
                mapa.put(llista.get(i), 1);
            }        
        }

    }
}

