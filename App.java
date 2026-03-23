import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorRep rep = new CalculatorRep();
        ArithmeticCalculator<Number> calc = null;
        Number num1 = 0;
        Number num2 = 0;
        Number result = 0;
        while(true)
        {
            System.out.println("옵션을 선택하세요: 1. 연산 | 2. 결과 보기 | 3. 첫 번째 값 제거 | 4. 큰 값 보기");
            int optionnumber = scanner.nextInt();
            scanner.nextLine();
            switch (optionnumber)
            {
                case 1:
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
                    try{
                        calc = new ArithmeticCalculator<>(num1, num2, sign);
                        result = calc.calculate();
                        rep.add(calc);
                        System.out.println("연산 결과: " + result);
                    } catch (ArithmeticException | IllegalArgumentException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    for(int i=0; i<rep.getList().size(); i++)
                    {
                        System.out.println((i + 1) + "번 연산 결과: " + rep.getList().get(i).getResult());
                    }
                    break;

                case 3:
                    try{
                        rep.removeFirstIndex();
                        System.out.println("제거 되었습니다!.");
                        for(int i=0; i<rep.getList().size(); i++)
                        {
                            System.out.println("제거된 리스트");
                            System.out.println((i + 1) + "번 연산 결과: " + rep.getList().get(i).getResult());
                        }
                    }catch (IndexOutOfBoundsException e)
                    {
                        System.out.println("실행된 연산이 없습니다.");
                    }
                    break;

                case 4:
                    if (calc == null) {
                        System.out.println("실행한 연산이 없습니다.");
                        break;
                    }
                    System.out.print("정수를 입력하세요: ");
                    Number comparenum = scanner.nextInt();
                    scanner.nextLine();
                    List<ArithmeticCalculator<?>> bigIndexlist = calc.getlistStream(comparenum, rep.getList());
                    if(bigIndexlist.isEmpty())
                    {
                        System.out.println("연산 결과가 없습니다.");
                    }
                    else
                    {
                        System.out.print(comparenum + "보다 더 큰 결과값: ");
                        for(int i=0; i< bigIndexlist.size(); i++)
                        {
                            System.out.print(bigIndexlist.get(i).getResult() + " ");
                        }
                        System.out.println();
                    }
                    break;
            }
        }

    }
}
