import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Calculator {

    private List<Calculate> list = new ArrayList<>();

    public void estimate(String num1, String num2, char sign)
    {
        Calculate calc = new Calculate(num1, num2, sign);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        int result = arithmeticCalculator.calculate(num1, num2, sign);
        System.out.println("결과 출력: " + result);
        calc.setResult(result);
        list.add(calc);
    }



    public List<Calculate> getList()
    {
        return list;
    }


}
