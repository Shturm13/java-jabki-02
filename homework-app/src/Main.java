import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание. Урок 2");

        System.out.println("1. Напишите функциональность, которая вычисляет площадь круга");
        int circleRadius = 5;
        double circleSquare = Math.PI*Math.pow(circleRadius,2);
        System.out.printf("Площадь круга с радиусом %s равна %s\n", circleRadius, circleSquare);

        System.out.println("2. Переведите температуру в градусах Цельсия в Фаренгейты");
        int tempCelsus = 22;
        double tempFahrenheit = tempCelsus *9/5 + 32;
        System.out.printf("Температура в градусах цельсия: %s равна температуре в градусах фаренгейта: %s\n", tempCelsus, tempFahrenheit);

        System.out.println("3. Проверьте, является ли длина сроки \"Hello\" равной длине другой строки");
        String helloString = "Hello";
        String testString = "Hi!";
        if (helloString.length() == testString.length()){
            System.out.printf("Длина строки %s равна длине строки %s \n", helloString, testString);
        } else {
            System.out.printf("Длина строки %s не равна длине строки %s \n", helloString, testString);
        }

        System.out.println("4. Напишите функциональность, которая определяет, является ли год високосным");
        int year = 2025;
        System.out.printf("Является ли год %s високосным: %s \n", year, year % 4 == 0);

        System.out.println("5. Напишите калькулятор ИМТ");
        double weight = 100;
        double height = 173;
        double imt = weight/(height*height);
        System.out.printf("ИМТ при росте %s и весе %s составляет %.6f \n", height, weight, imt);

        System.out.println("6. Выведите в консоль таблицу истинности для операторов && и ||");
        System.out.printf("Для true && true получаем: %b \n", true && true);
        System.out.printf("Для true && false получаем: %b \n", true && false);
        System.out.printf("Для false && true получаем: %b \n", false && true);
        System.out.printf("Для false && false получаем: %b \n", false && false);
        System.out.println();
        System.out.printf("Для true || true получаем: %b \n", true || true);
        System.out.printf("Для true || false получаем: %b \n", true || false);
        System.out.printf("Для false || true получаем: %b \n", false || true);
        System.out.printf("Для false || false получаем: %b \n", false || false);

        System.out.println("7. Выведите в консоль квадрат");
        System.out.println("квадрат");
        System.out.println(" ■ ");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");

        System.out.println("8. Выведите в консоль полый квадрат");
        System.out.println("полыйквадрат");
        System.out.println(" □ ");
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*****");

        System.out.println("9. Выведите в консоль ромб");
        System.out.println(" ◊ ");

        System.out.println("10. Выведите в консоль смайлик");
        System.out.println(" \uD83D\uDE00 ");



        System.out.println("1. Дано число. Напишите программу, которая определяет, является ли оно четным или нечетным");
        int x = 5;
        System.out.printf("Проверка на четность числа %s : %s\n",x,x % 2==0);
        x = 4;
        System.out.printf("Проверка на четность числа %s : %s\n",x,x % 2==0);

    }
}