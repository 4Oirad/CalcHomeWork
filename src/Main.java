public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        String c = calc.devide.apply(Integer.toString(a), Integer.toString(b));
        // причина возникновения ошибки: ноль в делителе.
        // ошибка заключается в том, что при делении на ноль мы получаем ArithmeticException
        // для устранения ошибки изменил тип переменной devide на String, а так же с помощью тернарного оператора учел возможный ноль в делителе.
        calc.println.accept(c);
    }
}
