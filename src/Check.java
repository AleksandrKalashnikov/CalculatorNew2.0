public class Check {

    /*
     В данном классе, через цикл for-each проверяем весь массив на то, какие числа были введены.
     Если совпадение было найдено, возвращается true.

     Методы checkArab и checkRome типа boolean, т.е. возвращают true или false еслизначение было найденно или нет соотвественно
     */

    public static boolean checkArab (String arrArab) {
        String[] strArab = {"1","2","3","4","5","6","7","8","9","10"};     // Массив из арабских чисел
        for (String strArab1 : strArab) {   // Через цикл обрабатываем весь массив
            if (arrArab.equals(strArab1)) { // Сравниваем через метод equals() и возвращаем елемент массива если было найдено совпадение
                return true;
            }
        }
        return false;
    }

    public static boolean checkRome (String arrStr) {
        String[] strRome = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};    // Массив из римских чисел
        for (String strRome1: strRome) {
            if(arrStr.equals(strRome1)) {
                return true;
            }
        }
        return false;
    }
}
