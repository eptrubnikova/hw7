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
        for (int i= 1; i <= 10; i++){
            int fertility = population/1_000*17;
            int mortality = population/1_000*8;
            population = population + fertility - mortality;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        System.out.println("Задача 4");
    }
}