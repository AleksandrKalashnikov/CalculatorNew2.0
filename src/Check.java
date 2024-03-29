
public class Check {

    /*
     В данном классе, через цикл for-each проверяем весь массив на то, какие числа были введены.
     Если совпадение было найдено, возвращается true.

     Методы checkArab и checkRome типа boolean, т.е. возвращают true или false еслизначение было найденно или нет соотвественно
     */

    public static boolean checkArab (String arrArab) {

        String[] strArab = {"1","2","3","4","5","6","7","8","9","10"};     // Массив из арабских чисел
        for (String strArabF : strArab) {   // Через цикл for-each обрабатываем весь массив
            if (arrArab.equals(strArabF)) { // Сравниваем через метод equals() и возвращаем елемент массива если было найдено совпадение
                return true;
            }
        }
        return false;
    }


    public static boolean checkRome (String arrRome) {

        String[] strRome = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};    // Массив из римских чисел
        for (String strRomeF: strRome) {
            if(arrRome.equals(strRomeF)) {
                return true;
            }
        }
        return false;
    }
}
