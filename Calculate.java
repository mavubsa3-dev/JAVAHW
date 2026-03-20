public class Calculate {
    private int num1;
    private int num2;
    private char sign;
    private Integer result;

    public Calculate(int num1, int num2, char sign)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
        result = 0;
    }

    public Integer getResult()
    {
        return this.result;
    }

    public void setResult(Integer result)
    {
        this.result = result;
    }
}
