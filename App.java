import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        Number num1 = null;
        Number num2 = null;
        while(true)
        {
            System.out.print("숫자 입력: ");
            String input1 = scanner.nextLine();
            if(input1.equals("exit"))
            {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if(input1.contains("."))
            {
                num1 = Double.parseDouble(input1);
            }
            else
            {
                num1 = Integer.parseInt(input1);
            }


            System.out.print("기호 입력: ");
            String signinput = scanner.nextLine();
            char sign = signinput.charAt(0);

            System.out.print("숫자 입력: ");
            String input2 = scanner.nextLine();
            if(input2.equals("exit"))
            {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if(input2.contains("."))
            {
                num2 = Double.parseDouble(input2);
            }
            else
            {
                num2 = Integer.parseInt(input2);
            }
            calc.estimate(num1, num2, sign);

        }
        try{
            List<Calculate<?>> resultlList = calc.getList();
            for(int i=0; i< resultlList.size(); i++)
            {
                System.out.println((i + 1) + " 번 계산 결과: " + resultlList.get(i).getResult());
            }
        } catch (IndexOutOfBoundsException e)
        {
            System.out.println("계산 기록이 없습니다.");
        }
    }
}
