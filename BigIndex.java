import java.util.List;

@FunctionalInterface
public interface BigIndex {
    List<ArithmeticCalculator<?>> bigger(Number result, List<ArithmeticCalculator<?>> list);
}
