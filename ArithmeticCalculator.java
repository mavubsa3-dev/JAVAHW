public class ArithmeticCalculator<T extends Number> {

    public int calculate(T num1, T num2, char sign)
    {

        OperatorType types = OperatorType.from(sign);

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
