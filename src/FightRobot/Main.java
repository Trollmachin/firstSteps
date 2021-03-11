package FightRobot;
/*
Создать класс Robot с параметрами: name, age, power
Реализовать метод boolean fight(Robot anotherRobot): реализовать механизм драки роботов в зависимости от силы.
Метод должен определять, выиграл ли робот, у которого вызвали метод fight (this) бой или нет,
                                                            т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие: если robot1.fight(robot2) = true, то robot2.fight(robot1) = false
*/

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot("R2D2", 147, 100500);
        System.out.println("Робот: " + robot1.getName());
        System.out.println("Возраст: " + robot1.getAge());
        System.out.println("Сила: " + robot1.getPower());

        Robot robot2 = new Robot("C-3PO", 250, 300);
        System.out.println("Робот 2: " + robot2.getName());
        System.out.println("Возраст: " + robot2.getAge());
        System.out.println("Сила: " + robot2.getPower());

        System.out.println(robot1.getName() + " Start fight!");
        System.out.println(robot1.fight(robot2));

        System.out.println(robot2.getName() + " Start fight!");
        System.out.println(robot2.fight(robot1));
    }
}
