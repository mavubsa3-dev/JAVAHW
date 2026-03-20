public class Calculate <T>{
    private T num1;
    private T num2;
    private T sign;
    private T result;

    public Calculate(T num1, T num2, T sign)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
    }

    public T getResult()
    {
        return this.result;
    }

    public void setResult(T result)
    {
        this.result = result;
    }
}
