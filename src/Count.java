import java.io.IOException;

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
                try {
                    throw new IOException();
                }catch (IOException e) {
                    System.err.println("Неверный оператор. Принимаются только (+, -, /, *)");
                }
        }
        return res;
    }
}
