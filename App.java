import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        while(true)
        {
            System.out.print("숫자 입력: ");
            String num1 = scanner.nextLine();
            if(num1.equals("exit"))
            {
                System.out.println("프로그램을 종료합니다.");
                break;
            }


            System.out.print("기호 입력: ");
            String signinput = scanner.nextLine();
            char sign = signinput.charAt(0);

            System.out.print("숫자 입력: ");
            String num2 = scanner.nextLine();
            calc.estimate(num1, num2, sign);
        }
        try{
            List<Calculate> resultlList = calc.getList();
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
