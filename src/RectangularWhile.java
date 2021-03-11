
// Вывести на экран квадрат 10х10 из букв P используя цикл while.

public class RectangularWhile {
    public static void main(String[] args) {
        int i = 1;
        int b = 1;
        while (i <= 10) {
            while (b < 10) {
                System.out.print("P");
                b++;
            }
            System.out.println("P");
            i++;
            b = 1;
        }
    }
}
