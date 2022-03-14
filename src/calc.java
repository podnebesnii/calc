import java.util.InputMismatchException;
import java.util.Scanner;

public class calc {


    public static void main(String[] args) {
        int x, y, z; //x=1 число,y=2 число,z=ответ
        char mas[] = new char[11];
        char znak = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение ");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            mas[i] = str.charAt(i);
            if (mas[i] == '+') {
                znak = '+';
            }
            if (mas[i] == '-') {
                znak = '-';
            }
            if (mas[i] == '*') {
                znak = '*';
            }
            if (mas[i] == '/') {
                znak = '/';
            }
        }
        String osnova = String.valueOf(mas);
        String[] razdel = osnova.split("[+-/*]");
        String stable = razdel[0];
        String stable1 = razdel[1];
        String string1 = stable.trim();
        String string2 = stable1.trim();
        boolean s1 = testi.contains(string1);
        boolean s2 = testi.contains(string2);
        if (s1 && s2) {
            x = Converter.romanToArabian(string1);
            y = Converter.romanToArabian(string2);
            z = raschet.calculated(x, y, znak);
            String rezRim = Converter.convertArabianToRoman(z);
            System.out.println(rezRim);

        } else {
            x = Integer.parseInt(string1);
            y = Integer.parseInt(string2);
            boolean b = (0 < x) && (x <= 10) && (0 < y) && (y <= 10);
            if (b) {
                z = raschet.calculated(x, y, znak);
                System.out.println(z);
            } else {
                System.out.println("Неверный ввод данных");
            }
        }
    }
    enum Rim {
        I, II, III, IV, V, VI, VII, VIII, IX, X
    }

}


