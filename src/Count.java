public class Count {

    /*
     В этом классе проходят операции над операндами.
     */

    public static int count(int a, int b, char op) {
        int res = 0;

        switch (op) {
            case '+':
                res = a + b;
                return res;
            case '-':
                res = a - b;
                return res;
            case '*':
                res = a * b;
                return res;
            case '/':
                res = a / b;
                return res;
            default:
                System.err.println("Не допустимый оператор");
        }
        return res;
    }
}
