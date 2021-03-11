/* Вывести на экран числа от 1 до 10 используя цикл while. */
/* Вывести на экран числа от 10 до 1 используя цикл while. */

public class CycleWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        int j = 10;
        while (j > 0) {
            System.out.println(j);
            j--;
        }
    }
}
