public class Main {
    public static void main(String[] args) {

        System.out.println("Залача 1");
        int salary = 15000;
        int total = 0;
        int a = 1;
        for (; total < 2_459_000; a++) {
            total = total + salary;
        }
        System.out.println("Месяц " + a + ", сумма накоплений равна " + total + " рублей");

        System.out.println("Задача 2");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for (int f = 10; f >= 1; f--) {
            System.out.print(f + " ");
        }
        System.out.print("\n");
        System.out.println("Задача 3");
        int population = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            int fertility = population / 1_000 * 17;
            int mortality = population / 1_000 * 8;
            population = population + fertility - mortality;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        System.out.println("Задача 4");
        int total1 = 15000;
        int b = 1;
        for (; total1 < 12_000_000; b++) {
            total1 = total1 + total1 / 100 * 7;

            System.out.println("Месяц " + b + ", сумма накоплений равна " + total1 + " рублей");
        }
        System.out.println("Задача 5");
        int total2 = 15000;
        int c = 1;
        for (; total2 < 12_000_000; c++) {
            total2 = total2 + total2 / 100 * 7;
            if (c % 6 == 0)

                System.out.println("Месяц " + c + ", сумма накоплений равна " + total2 + " рублей");
        }
        System.out.println("Задача 6");
        int total3 = 15000;
        int f = 1;
        for (; f <= 108; f++) {
            total3 = total3 + total3 / 100 * 7;
            if (f % 6 == 0)

                System.out.println("Месяц " + f + ", сумма накоплений равна " + total3 + " рублей");
        }

        System.out.println("Задача 7");
    int d = 3;
    for (; d <= 31; d = d + 7){
        System.out.println("Сегодня пятница, " + d + "-е число. Необходимо подготовить отчет");
    }
    }
}