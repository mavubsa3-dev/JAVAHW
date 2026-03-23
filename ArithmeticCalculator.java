public class ArithmeticCalculator<T extends Number> {
    private T num1;
    private T num2;
    private char sign;
    private Number result;

    public ArithmeticCalculator(T num1, T num2, char sign)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
    }

    public Number calculate()
    {

        OperatorType types = OperatorType.from(sign);
        switch (types)
        {
            case SUM:
                if(num1 instanceof Double || num2 instanceof Double)
                {
                    result = (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
                }
                else
                {
                    result = (T) Integer.valueOf(num1.intValue() + num2.intValue());
                }
                break;


            case SUB:
                if(num1 instanceof Double || num2 instanceof Double)
                {
                    result = (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
                }
                else
                {
                    result = (T) Integer.valueOf(num1.intValue() - num2.intValue());
                }
                break;


            case MUL:
                if(num1 instanceof Double || num2 instanceof Double)
                {
                    result = (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
                }
                else
                {
                    result = (T) Integer.valueOf(num1.intValue() * num2.intValue());
                }
                break;


            case DIV:
                if(num2.doubleValue() != 0)
                {
                    if(num1 instanceof Double || num2 instanceof Double)
                    {
                        result = (T) Double.valueOf(num1.doubleValue() % num2.doubleValue());
                    }
                    else
                    {
                        result = (T) Integer.valueOf(num1.intValue() % num2.intValue());
                    }
                }
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return result;
    }

    public Number getResult()
    {
        return result;
    }
}
