//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public  class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
          примитивы
         */
        int age = 12;
        double wallet = 10.50;
        boolean isSchoolBoy = true;
        char grade = 'A';

        /*
        Ссылочные типы данных
         */
        String name = "Alice";
        System.out.println(name.length());

        //Арифметические
        int a = 10;
        int b = 3;
        System.out.println(a / b);

        //Операторы сравнения
        System.out.println(a == b);

        //Логические операторы
        boolean x = true;
        boolean y = false;
        System.out.println("Логические операторы");
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
    }
}