public class ArithmeticCalculator {
    public enum OperatorType {
        SUM('+'),
        MIN('-'),
        MUL('*'),
        DIV('%');

        private final char sign;

        OperatorType(char sign) {
            this.sign = sign;
        }
    }

}
