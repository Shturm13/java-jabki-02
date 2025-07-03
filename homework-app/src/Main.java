import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        int year = 2004;
        System.out.printf("Является ли год %s високосным: %s \n", year, (year % 400 == 0) || ((year % 4 == 0) && !(year % 100 == 0)) );

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

        System.out.println("if-else");

        System.out.println("1. Дано число. Напишите программу, которая определяет, является ли оно четным или нечетным");
        int x = 5;
        System.out.printf("Проверка на четность числа %s : %s\n",x,x % 2==0);
        x = 4;
        System.out.printf("Проверка на четность числа %s : %s\n",x,x % 2==0);

        System.out.println("2. Даны два числа. Выведите «Первое больше», «Второе больше» или «Равны»");
        int a = 5;
        int b = 6;
        if (a>b) {
            System.out.println("Первое больше");
        } else if (a<b) {
            System.out.println("Второе больше");
        } else {
            System.out.println("Равны");
        }

        System.out.println("3. Дано число. Выведите «Положительное», «Отрицательное» или «Равно нулю»");
        int z = 0;
        if (z>0) {
            System.out.println("Положительное");
        } else if (z<0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Равно нулю");
        }

        System.out.println("4. Дано число (возраст). Если возраст >= 18, выведите «Доступ разрешен», иначе — «Доступ запрещен");
        int age = 18;
        if (age >=18 ) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }

        System.out.println("5. Придумать задачу самим");
        System.out.println("Рассчитаться на первый-второй");
        int num = 4;
        if (num % 2 == 1 ) {
            System.out.println("Первый");
        } else {
            System.out.println("Второй");
        }

        System.out.println("Тернарный оператор");
        System.out.println("1. Дано число. Используя тернарный оператор, определите, положительное, отрицательное или нулевое");
        int zzz = -1;
        String result = zzz > 0 ? "Положительное" : zzz < 0 ? "Отрицательное" : "Нулевое";
        System.out.printf("Число %s - %s \n", zzz, result);

        System.out.println("2. Дано число. С помощью тернарного оператора проверьте, делится ли оно на 3 и 5 одновременно. Выведите «Кратно» или «Не кратно»");
        int yyy = 15;
        result = (yyy % 3 + yyy % 5) == 0 ? "Кратно" : "Не кратно";
        System.out.printf("Число %s одновременно числам 3 и 5 %s \n", yyy, result);

        System.out.println("3. Для заданного числа верните строку «Четное» или «Нечетное», используя тернарный оператор.");
        int xxx = 4;
        result = xxx % 2 == 0 ? "Четное": "Нечетное";
        System.out.printf("Число %s - %s \n", xxx, result);

        System.out.println("switch");
        System.out.println("1. Дано число от 1 до 7. Выведите название дня недели. Если число вне диапазона, выведите «Ошибка»");
        int dow = 8;
        String dowName;
        switch (dow) {
            case 1:
                dowName = "Понедельник";
                break;
            case 2:
                dowName = "Вторник";
                break;
            case 3:
                dowName = "Среда";
                break;
            case 4:
                dowName = "Четверг";
                break;
            case 5:
                dowName = "пятница";
                break;
            case 6:
                dowName = "Суббота";
                break;
            case 7:
                dowName = "Воскресенье";
                break;
            default:
                dowName = "Хз какой день";
        }
        System.out.println(dowName);

        System.out.println("2. Дано число от 1 до 5. Выведите описание оценки (оцените свою работу)");
        int grade = 5;
        String gradeName;
        switch (grade) {
            case 1:
                gradeName = "Кол";
                break;
            case 2:
                gradeName = "Двойка";
                break;
            case 3:
                gradeName = "Тройка";
                break;
            case 4:
                gradeName = "Четверка";
                break;
            case 5:
                gradeName = "Пятерка";
                break;
            default:
                gradeName = "Непонятно";
        }
        System.out.printf("Оценка %s это %s \n", grade, gradeName);

        System.out.println("Цикл for");
        System.out.println("1. Дан список чисел. Посчитайте сумму всех четных элементов");
        int summa = 0;
        int startNum = 5;
        int endNum = 15;
        for (int i = startNum; i < endNum; i++) {
            if (i % 2 ==0) {
                summa = summa + i;
            }
        }
        System.out.printf("Сумма четных элементов в интервале от %s до %s равна %s\n", startNum, endNum, summa);

        System.out.println("2. Дан список чисел. Найдите максимальное значение");
        int maxNum = 0;
        for (int i = 0; i < 15; i++) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        System.out.printf("Максимальное число %s\n", maxNum);

        System.out.println("3. Дано число n. Выведите таблицу умножения для n от 1 до 10");
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.printf("%s * %s = %s; ", i, j, i*j);
            }
            System.out.println();
        }

        System.out.println("4. С помощью цикла for выведите числа от 10 до 1 в обратном порядке");
        for (int i = 10; i >0 ; i--) {
            System.out.printf("%s", i);
            if (i == 1) {
                break;
            }
            System.out.printf(", ");
        }
        System.out.println();

        System.out.println("5. Найдите количество четных чисел в диапазоне от 1 до 50");
        int evenCount = 0;
        for (int i = 1; i < 51; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }
        System.out.printf("Количество четных чисел в диапазоне от 1 до 50: %s\n", evenCount);

        System.out.println("Цикл while");
        System.out.println("1. Найдите наименьшее число больше 100, которое делится на 7");

        int w=100;
        while (w % 7 != 0) {
            w++;
        }
        System.out.printf("Наименьшее число больше 100, которое делится на 7 это: %s\n",w);

        System.out.println("2. Дано число n. Вычислите его факториал через цикл while");
        int n = 4;
        int factorial=1;
        while (n > 1) {
            factorial = factorial * n;
            n--;
        }
        System.out.printf("Факториал равен %s \n", factorial);

        System.out.println("3. Дано число. Определите, является ли оно простым");
        int k = 11;
        int i=2;
        boolean simpleNum = true;
        while (i <= Math.sqrt(k)) {
            if (k % i == 0) {
                simpleNum = false;
            }
            i++;
        }
        if (simpleNum) {
            System.out.printf("Число %s простое\n", k);
        }else {
            System.out.printf("Число %s не простое\n", k);
        }

        System.out.println("4. Придумать задачу самим");
        String answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Удалось придумать задачу?");
        while (true) {
            answer = scanner.nextLine();
            if (answer.equals("да")) {
                System.out.println("Ну и хорошо");
                break;
            }
            System.out.println("а если еще раз подумать, то удалось?");
        }

        System.out.println("break & continue");
        System.out.println("1. Выведите все числа от 1 до 20, кроме тех, что делятся на 3");
        for (int g = 1; g <= 20 ; g++) {
            if (g % 3 == 0) {
                continue;
            }
            System.out.printf("Число %s не делится на три, его выводим\n",g);
        }

        System.out.println("2. Дан список чисел. Суммируйте элементы, пока не встретите отрицательное число");
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(-3);

        int h = 0;
        int sum = 0;
        while (h < list.size()){
           if (list.get(h) > 0) {
                sum = sum + list.get(h);
            } else {
                break;
            }
            h ++;
        }
        System.out.printf("Сумма чисел до первого отрицательного равно: %s \n", sum);

        System.out.println("3. Дан список чисел. Суммируйте элементы, пока сумма не превысит 100");
        list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        sum = 0;
        h = 0;
        while (true){
            if (sum + list.get(h) > 100) {
                break;
            }
            sum = sum + list.get(h);
            h++;
        }
        System.out.printf("Удалось насчитать %s, а закончили числом %s\n", sum, list.get(h));


    }
}