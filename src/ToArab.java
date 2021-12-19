public class ToArab {

    /*
    В данном классе происходит преобразование римских цифр в арабские
     */

    public static int toArab(String rome) {  // В данном методе сравниваем и присваиваем значение операндам

        if (rome.equals("I")) {
            return 1;
        } else if (rome.equals("II")) {
            return 2;
        } else if (rome.equals("III")) {
            return 3;
        } else if (rome.equals("IV")) {
            return 4;
        } else if (rome.equals("V")) {
            return 5;
        } else if (rome.equals("VI")) {
            return 6;
        } else if (rome.equals("VII")) {
            return 7;
        } else if (rome.equals("VIII")) {
            return 8;
        } else if (rome.equals("IX")) {
            return 9;
        } else if (rome.equals("X")) {
            return 10;
        }
        return -1;
    }
}



