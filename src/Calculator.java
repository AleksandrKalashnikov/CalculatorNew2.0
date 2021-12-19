import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;

public class Calculator {

    /*
    Основной класс Calculator. Здесь принимаются и выводятся данные
     */

    public static void main (String[] args) {

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Калькулятор умеет работать с арабскими и римскими числами от 1 до 10 (от I до X)");
        System.out.println("Одновременно на вход принимаются только арабские или римские");
        System.out.println("Ввод данных принимается через пробел");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.print("Ввод: ");

        Scanner scan = new Scanner(System.in); // Объявляем Сканер
        String[] arrIn = scan.nextLine().split(" "); // Считываем введеные данные в строку, и сразу через Методом Split() делим ее через пробел на массив

        String a = arrIn[0];    // Присваиваем переменной первый элемент массива arrIn
        String op = arrIn[1];   //  Присваиваем переменной второй элемент массива arrIn
        String b = arrIn[2];    // Присваиваем переменной третий элемент массива arrIn

        if (arrIn.length != 3) {        // Error если длинна массива не равна 3
            System.err.println("Error");
        }

        if (Check.checkArab(a) && Check.checkArab(b) && op.length() == 1) {     // Обращаемся к классу Check и метод checkArab проверяем арабские числа
            System.out.println("Результат: " + Count.count(Integer.parseInt(a), Integer.parseInt(b), op.charAt(0))); // Преобразуем операнды из типа String в int, далее в классе Count, через метод count считаем
        }                                                                                                            //
        else if (Check.checkRome(a) && Check.checkRome(b) && op.length() == 1) {    // Обращаемся к классу Check и метод checkRome проверяем римские числа
            System.out.println("Результат: " + ToRome.toRome(Count.count(ToArab.toArab(a), +
                    ToArab.toArab(b), op.charAt(0)))); // Через класс ToArab и метод toArab преобразуем римские в арабские. Далее в классе Count, через метод count считаем
        }                                              // Ответ преобразуем через класс ToRome и метод toRome арабские в римские
    }
}
