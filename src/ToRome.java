import java.lang.ArrayIndexOutOfBoundsException;

public class ToRome {

    /*
    В данном классе происходит преобразование арабских цифр в римские
     */

    public static String toRome (int numArab) {
        String[] rome = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI",
                "XVII","XVIII","XIX","XX","XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
                "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL","XLI","XLII","XLIII",
                "XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII",
                "LIX","LX","LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX","LXXI","LXXII",
                "LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX","LXXXI","LXXXII","LXXXIII",
                "LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC","XCI","XCII","XCIII","XCIV",
                "XCV","XCVI","XCVII","XCVIII","XCIX","C"};

        if (numArab < 1) {
            try {
                throw new ArrayIndexOutOfBoundsException();
            }catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("В римской системе результат не может быть меньше I !");
            }
        }else if (numArab >= 1 && numArab <= 100) {
            String STR = rome[numArab - 1]; // Получившейся ответ в арабском, равен номеру элемента в массиве
            return STR;      // Возращаем ответ в римском
        }
        return null;
    }
}
