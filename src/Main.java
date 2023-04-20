public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
}