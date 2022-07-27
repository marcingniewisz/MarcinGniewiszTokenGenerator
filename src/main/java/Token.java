import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Token {
    public static void main(String[] args) {

        List<Character> authToken = new ArrayList<>();
        boolean flaga = false;

        System.out.println("Program - Geenerator tokenów.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tokena Jaki chcesz wygenerować (5 ,10 lub 15).");
        int tokenSize = scanner.nextInt();
        if (tokenSize == 5) flaga = true;
        else if (tokenSize == 10) flaga = true;
        else if (tokenSize == 15) flaga = true;

        while (!flaga) {
            System.out.println("Błędna wartość! Podaj ponownie rozmiar tokena jaki chcesz wygenerować (5 ,10 lub 15).");
            tokenSize = scanner.nextInt();
            if (tokenSize == 5) flaga = true;
            else if (tokenSize == 10) flaga = true;
            else if (tokenSize == 15) flaga = true;
        }
        System.out.println("Wybrałeś token o długości :" + tokenSize);
        for (int i = 0; i < tokenSize; i++) {

            Random r = new Random();

            int category = r.nextInt(1, 5);
            switch (category) {
                case (1): //losowanie wartości [0-9]
                    char rndAsci1 = (char) r.nextInt(48, 57);
                    authToken.add(i, rndAsci1);
                    break;
                case (2)://losowanie wartości [a-z]
                    char rndAsci2 = (char) r.nextInt(97, 122);
                    authToken.add(i, rndAsci2);
                    break;
                case (3)://losowanie wartości [A-Z]
                    char rndAsci3 = (char) r.nextInt(65, 90);
                    authToken.add(i, rndAsci3);
                    break;
                case (4)://losowanie wartości [!@#$%^&*()]
                    char[] specialSigns = {33, 64, 35, 36, 37, 94, 38, 40, 41};
                    char rndAsci4 = specialSigns[r.nextInt(0, 8)];
                    authToken.add(i, rndAsci4);
                    break;

            }
        }
        for (Character tokenValue : authToken) {
            System.out.print(tokenValue);
        }
        }
    }

