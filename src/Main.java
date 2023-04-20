public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("решение задачи №1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия ");
        }
    }

    public static void task2() {
        System.out.println("решение задачи №2");
        int temp = 5;
        if (temp < 5) {
            System.out.println("на улице холодно надо надеть шапку");
        } else {
            System.out.println("на улице тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("решение задачи №3");
        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч ,то можно ехать спокойно ");
        }
    }

    public static void task4() {
        System.out.println("решение задачи №4");
        int age = 18;
        if (age < 2) {
            System.out.println("Если человеку " + age + " то ему пора спать.");
        } else if (age >= 2 && age < 6) {
            System.out.println("Если человеку " + age + " то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если человеку " + age + " то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если человеку " + age + " то ему нужно ходить в университет");
        } else if (age < 60 && age > 24) {
            System.out.println("Если человеку " + age + " то ему нужно ходить на работу");
        } else {
            System.out.println("Если человеку " + age + " то ему можно отдохнуть");
        }
    }
}