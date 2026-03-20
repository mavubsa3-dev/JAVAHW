import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Calculator {

    private List<Calculate> list = new ArrayList<>();

    public void estimate(int num1, int num2, char sign)
    {
        Calculate calc = new Calculate(num1, num2, sign);
        int result = calc.getResult();
        switch (sign)
        {
            case '+':
                result = num1 + num2;
                System.out.println("결과: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("결과: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("결과: " + result);
                break;
            case '%':
                if(num1 == 0 && num2 == 0)
                {
                    System.out.println("0은 연산할 수 없습니다.");
                }
                result = num1 / num2;
                System.out.println("나머지:" + result);
                break;
        }
        calc.setResult(result);
        list.add(calc);
    }

    public List<Calculate> getList()
    {
        return list;
    }


}
