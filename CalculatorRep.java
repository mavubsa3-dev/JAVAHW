import java.util.ArrayList;
import java.util.List;

public class CalculatorRep{
    List<ArithmeticCalculator<?>> list = new ArrayList<>();

    public void add(ArithmeticCalculator<?> resultlist)
    {
        list.add(resultlist);
    }

    public List<ArithmeticCalculator<?>> getList()
    {
        return this.list;
    }
}
