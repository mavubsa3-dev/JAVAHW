public class ArithmeticCalculator<T> {

    public int calculate(int num1, int num2, char sign)
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
