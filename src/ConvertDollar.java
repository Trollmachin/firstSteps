/*
1) Создать метод convert, который должен конвертировать евро в доллары.
В метод должен приходить один аргумент (к-во евро).
Метод должен возвращать к-во долларов.
2) Создать метод percent, который принимает один аргумент (число)
и возвращает это же число + 10% от него.
3) Создать метод print, который принимает один аргумент (строку)
и выводит эту строку 4 раза в консоль.
*/
public class ConvertDollar {
    public static void main(String[] args) {

        double dollar = convert(80.00);
        System.out.println(dollar);

        double res = percent(20);
        System.out.println(res);

        String rest = print("Ура");
        System.out.println(rest);
    }
    private static double convert(double euro) {
        double course = 1.21;
        double dollar = euro * course;
        return dollar;
    }
    private static double percent(int number1) {
        double res = number1 + number1/10;
        return res;

    }
    private static String print(String str) {
        String rest = str + str + str + str ;
        return rest;
    }
}
