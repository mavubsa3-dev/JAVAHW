import java.util.ArrayList;
import java.util.List;

public class CalculatorRep<T>{
    List<ArithmeticCalculator<?>> list = new ArrayList<>();

    public void add(ArithmeticCalculator<?> resultlist)
    {
        list.add(resultlist);
    }
}
