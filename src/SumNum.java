/* Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу. -1 должно учитываться в сумме. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summ = 0;

        for ( ; true; ) {
            int i = Integer.parseInt(reader.readLine());

            if (i != -1) {
                summ += i;
            }
            else break;
        }
        System.out.println(summ + -1);
    }
}
