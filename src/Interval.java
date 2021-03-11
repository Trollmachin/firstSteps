
/* Реализовать метод checkInterval.
Метод должен проверять попало ли целое число в интервал от 20 до 50
 и сообщить результат на экран в следующем виде: "Число а не содержится в интервале."
 или "Число а содержится в интервале.", где а - аргумент метода. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interval {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        checkInterval(num);

    }

    public static void checkInterval(int a) {
        if (a >= 20 && a <= 50) {
            System.out.println("Число а содержится в интервале.");
        } else {
            System.out.println("Число а не содержится в интервале.");
        }

    }
}
