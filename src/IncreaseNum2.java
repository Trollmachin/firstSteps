
/*
1) Создать метод sum, который должен суммировать 2 числа.
2) Создать метод multy, который должен умножить 2 числа.
3) Создать метод subt, который должен вычесть второе число из первого.
4) Создать метод div, который должен делить 2 числа.
*/

public class IncreaseNum2 {
    public static void main(String[] args) {
        int res1 = sum(20, 30);
        System.out.println(res1);

        int res2 = multy(20, 30);
        System.out.println(res2);

        int res3 = subt(res1, res2);
        System.out.println(res3);

        int res4 = div(1234, 48);
        System.out.println(res4);

    }

    private static int sum(int number1, int number2) {
        int res1 = number1 + number2;
        return res1;
    }

    private static int multy(int number1, int number2) {
        int res2 = number1 * number2;
        return res2;
    }
    private static int subt(int number1, int number2) {
        int res3 = number1 - number2;
        return res3;
    }
    private static int div(int number1, int number2) {
        int res4 = number1 / number2;
        return res4;
    }
}
