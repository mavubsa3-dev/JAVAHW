public class ArithmeticCalculator {

    //enum 생성
    public enum OperatorType {
        SUM('+'),
        MIN('-'),
        MUL('*'),
        DIV('%');

        private final char sign;

        //생성자
        OperatorType(char sign) {
            this.sign = sign;
        }

        //getter 생성
        public char getSign() {
            return sign;
        }
    }

    public int calculate(int num1, int num2, char sign)
    {
        char mathtype = '\u0000';
        int result = 0;
        for(OperatorType type : OperatorType.values()) // values()를 통해 OperateType이 가진 모든 값들 type에 담음
        {
            if(type.getSign() == sign)
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
