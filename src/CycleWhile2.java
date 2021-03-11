import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры строку и число N. Вывести на экран строку N раз используя цикл while.
Пример ввода: pro 2
Пример вывода: pro pro
*/
public class CycleWhile2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int num = Integer.parseInt(reader.readLine());
        int j = 0;
        while (num > 0) {
            System.out.println(str);
            num--;
        }
    }
}
