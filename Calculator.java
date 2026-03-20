import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.print("숫자 입력: ");
            String input = scanner.nextLine();
            if(input.equals("exit"))
            {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int num1 = Integer.parseInt(input);
            if(num1 < 0)
            {
                System.out.println("음수는 입력할 수 없습니다. 다시 입력하세요.");
                continue;
            }

            System.out.print("기호 입력: ");
            String sign = scanner.nextLine();

            System.out.print("숫자 입력: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();
            if(num2 < 0)
            {
                System.out.println("음수는 입력할 수 없습니다. 다시 입력하세요.");
                continue;
            }

            switch (sign)
            {
                case "+":
                    int sum = num1 + num2;
                    System.out.println("결과: " + sum);
                    break;
                case "-":
                    int min = num1 - num2;
                    System.out.println("결과: " + min);
                    break;
                case "*":
                    int mul = num1 * num2;
                    System.out.println("결과: " + mul);
                    break;
                case "%":
                    if(num1 == 0 && num2 == 0)
                    {
                        System.out.println("0은 연산할 수 없습니다.");
                    }
                    int div = num1 / num2;
                    System.out.println("몫: " + div + ", 나머지:" + num1 % num2);
                    break;

            }

        }
    }
}
