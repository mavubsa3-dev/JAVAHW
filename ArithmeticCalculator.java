public class ArithmeticCalculator<T extends Number> {
    private T num1;
    private T num2;
    private char sign;

    public ArithmeticCalculator(T num1, T num2, char sign)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
    }

    public Number calculate()
    {

        OperatorType types = OperatorType.from(sign);
        Number result = 0;
        switch (types)
        {
            case SUM:
                return num1 + num2;


            case SUB:
                return num1 - num2;


            case MUL:
                return  num1 * num2;


            case DIV:
                return  num1 % num2;
        }
        return 0;
    }
}
