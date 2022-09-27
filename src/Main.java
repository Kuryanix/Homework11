import java.time.LocalDate;

public class Main {

    // Задача 1
    public static void defineYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год");
            return;
        } else {
            System.out.println(year + " не високосный год");
            return;
        }
    }

    // Задача 2
    public static int getClientOS (String name, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (name.equals("iOS") && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию для " + name + " по ссылке");
            return 0;
        } else if (name.equals("iOS") && deviceYear > currentYear) {
            System.out.println("Установите обычную версию для " + name + " по ссылке");
            return 1;
        } else if (name.equals("Android") && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию для " + name + " по ссылке");
            return 2;
        } else {
            System.out.println("Установите обычную версию для " + name + " по ссылке");
            return 3;
        }
    }

    // Задача 3
        public static void printDelivery (int distance) {
        int days = 0;
            if (distance < 20) {
                days = days + 1;
                System.out.println("Потребуется дней:" + days);
            } else if (distance >20 && distance < 60) {
                days = days + 2;
                System.out.println("Потребуется дней:" + days);
            } else
                days = days + 3;
                System.out.println("Потребуется дней:" + days);
        }

    public static void main(String[] args) {

        // ЗАДАЧА 1
        int year = 1400;
        defineYear(year);

        // ЗАДАЧА 2
        String osName = "Android";
        int deviceYear = 2023;
        getClientOS(osName, deviceYear);

        // ЗАДАЧА 3
        int deliveryDistance = 95;
        printDelivery(deliveryDistance);
    }
}