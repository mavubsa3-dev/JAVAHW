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

        public char getSign() {
            return sign;
        }
    }

    public int calculate(int num1, int num2, char sign)
    {
        OperatorType[] types = {OperatorType.SUM, OperatorType.MIN, OperatorType.MUL, OperatorType.DIV};
        char mathtype = '\u0000';
        int result = 0;
        for(int i=0; i<OperatorType.values().length; i++)
            {
                char type = types[i].getSign();
                if (type == sign)
                {
                    mathtype = sign;
                }
            }
        switch (mathtype)
        {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '%':
                result = num1 % num2;
                break;

            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        return result;
    }
}
