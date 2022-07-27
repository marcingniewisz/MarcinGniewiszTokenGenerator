import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Token {
    public static void main(String[] args) {

        List<Character> authToken = new ArrayList<>();
        boolean flaga=false;

        System.out.println("Program - Geenerator tokenów.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tokena Jaki chcesz wygenerować (5 ,10 lub 15).");
        int tokenSize = scanner.nextInt();
        if (tokenSize == 5) flaga = true;
        else if (tokenSize == 10) flaga = true;
        else if (tokenSize == 15) flaga = true;

        while (flaga==false) {
            System.out.println("Błędna wartość! Podaj ponownie rozmiar tokena jaki chcesz wygenerować (5 ,10 lub 15).");
            tokenSize = scanner.nextInt();
            if (tokenSize == 5) flaga = true;
            else if (tokenSize == 10) flaga = true;
            else if (tokenSize == 15) flaga = true;
        }
        System.out.println("Wybrałeś token o długości :" + tokenSize);
        for (int i = 0; i < tokenSize; i++) {

            int rndAsciIndex;
            Random r = new Random();
            char rndAsci = (char) r.nextInt(40, 122);
            authToken.add(i, rndAsci);
        }
        for (Character tokenValue : authToken) {
            System.out.print(tokenValue);
        }
/*
        switch (tokenSize) {
            case (5):
                System.out.println("Wybrałeś token o długości :" + tokenSize);
                for (int i = 0; i < tokenSize; i++) {
                    //char rndAsci;
                    int rndAsciIndex;
                    Random r = new Random();
                    //rndAsciIndex =
                    char rndAsci = (char) r.nextInt(48, 122);
                    authToken.add(i, rndAsci);
                }
                for (Character tokenValue : authToken) {
                    System.out.print(tokenValue);
                }

                break;
            case (10):
                System.out.println("Wybrałeś token o długości :" + tokenSize);
                for (int i = 0; i < tokenSize; i++) {
                    //char rndAsci;
                    int rndAsciIndex;
                    Random r = new Random();
                    //rndAsciIndex =
                    char rndAsci = (char) r.nextInt(40, 122);
                    authToken.add(i, rndAsci);
                }
                for (Character tokenValue : authToken) {
                    System.out.print(tokenValue);
                }
                break;
            case (15):
                System.out.println("Wybrałeś token o długości :" + tokenSize);
                for (int i = 0; i < tokenSize; i++) {
                    //char rndAsci;
                    int rndAsciIndex;
                    Random r = new Random();
                    //rndAsciIndex =
                    char rndAsci = (char) r.nextInt(48, 122);
                    authToken.add(i, rndAsci);
                }
                for (Character tokenValue : authToken) {
                    System.out.print(tokenValue);
                }
                break;

            default:
                System.out.println("Wybrałeś niedozwoloną opcję. Koniec Programu.");
                break;


        }

 */
    }


}
