import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;

public class Main {
    //задача1
    public static int MaxNumber(int a, int b) throws Exception {
        if (a>b) return a;
        else if (b > a) return b;
        else throw new Exception("Числа равны");
    }
    //задача2
    public static int IntDivide(int a, int b) throws Exception {
        if (b == 0) throw new ArithmeticException("На ноль делить нельзя!");
        return a/b;
    }
    //задача3
    public static int ConvertToInt(String str) {
        int num;
        try {
            num = Integer.parseInt(str);
            return num;
        }
        catch (Exception e) {
            throw new NumberFormatException("Неверный формат строки");
        }
    }
    //задача4
    public static Boolean CheckAge(int a) {
        if (a < 0 || a > 150) throw new IllegalArgumentException("Неверный возраст");
        return true;
    }
    //задача5
    public static double Root(double a, double b) {
        if (a < 0) throw new IllegalArgumentException("Отрицательный аргумент!");
        return Math.pow(a, 1.0/b);
    }
    //задача6
    public static int Factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Факториал отрицательного числа не вычисляется");
        if (n == 1 || n == 0) return 1;
        return n * Factorial(n -1);
    }
    //задача7
    public static Boolean CheckArrayForZeros(int[] nums) {
        for (int num: nums) {
            if (num == 0) throw new IllegalArgumentException("В массиве есть нули");
        }
        return true;
    }
    //задача8
    public static double PositivePow(double a, double n) {
        if (n < 0) throw new IllegalArgumentException("Неверный показатель степени");
        return Math.pow(a, n);
    }
    //задача9
    public static String SliceString(String str, int n) {
        if (n > str.length()) throw new IllegalArgumentException("Превышение длины строки");
        return str.substring(0, n);
    }
    //задача10
    public static int FindNumber(int[] arr, int n) throws Exception {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) return i;
        }
        throw  new Exception("Элемент не найден");
    }
    //задача11
    public static String ToBinary(int n) throws Exception {
        String str = "";
        if (n < 0) throw new Exception("Неверно");
        while (n > 0) {
            str = n % 2 + str;
            n /= 2;
        }
        return str;
    }
    //задача12
    public static Boolean CheckDivisibility(int a, int b) throws Exception {
        if (b == 0) throw new ArithmeticException("На ноль делить нельзя");
        else if (a % b == 0) return true;
        return false;
    }
    //задача13
    public static int FindArray(int[] arr, int index) throws Exception {
        if (arr.length - 1 < index) throw new IndexOutOfBoundsException(index);
        return arr[index];
    }
    //задача14
    public static class WeakPasswordException extends Throwable {
        private String password;
        public String getPassword(){return password;}
        public WeakPasswordException(String message, String pass){

            super(message);
            password=pass;
        }
    }

    public static Boolean CheckPassword(String str) throws WeakPasswordException {
        if (str.length() < 8) throw new WeakPasswordException("Недостаточная длина пароля", str);
        return true;
    }
    //задача15
    public static Boolean CheckDate(String date) throws Exception {
        if (!date.matches("([0-2][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.([0-9]{4})")) throw new DateTimeParseException("Неверный формат даты: ", date, 0);
        return true;
    }
    //задача16
    public static String StringConcat(String str1, String str2) throws Exception {
        if (str1 == null || str2 == null) throw new NullPointerException("Пустая строка");
        return str1 + str2;
    }
    //задача17
    public static int Remainder(int a, int b) throws Exception {
        if (b == 0) throw new Exception("На ноль делить нельзя!");
        return a % b;
    }
    //задача18
    public static double SquareRoot(int n) throws Exception {
        if (n < 0) throw new Exception("Отрицательный аргумент");
        return Math.pow(n, 0.5);
    }
    //задача19
    public static double CelsiusToFahrenheit(double c) throws Exception {
        if (c < -273.15) throw new Exception("Выход за пределы физики");
        return c * 1.8 + 32;
    }
    //задача20
    public static Boolean IsNullOrEmpty(String str) throws Exception {
        if (str.isEmpty()) throw new Exception("Строка пустая или равна null");
        return true;
    }


    public static void main(String[] args) throws Exception, WeakPasswordException {
        System.out.println(IsNullOrEmpty("f"));
    }
}