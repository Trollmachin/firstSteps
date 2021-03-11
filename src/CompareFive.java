/* Реализовать метод compare(int a). Метод должен выводить строку на экран "Число меньше 5",
если параметр метода меньше 5 - и, выводить строку "Число больше 5", если параметр метода больше 5 - и,
и выводить строку "Число равно 5", если параметр метода равен 5 - и. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareFive {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        compare(num);
    }
    public static void compare (int num) {
        if (num < 5) {
            System.out.println("Число меньше 5");
        } else if (num > 5) {
            System.out.println("Число больше 5");
        } else {
            System.out.println("Число равно 5");
        }
    }
}
