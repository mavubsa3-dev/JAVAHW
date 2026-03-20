public class ArithmeticCalculator {

    public enum OperatorType {
        SUM("+"),
        MIN("-"),
        MUL("*"),
        DIV("%");

        private final String sign;

        OperatorType(String sign) {
            this.sign = sign;
        }

        public String getSign() {
            return sign;
        }
    }

    public void Calculate(int num1, int num2, String sign)
    {
        OperatorType[] types = {OperatorType.SUM, OperatorType.MIN, OperatorType.MUL, OperatorType.DIV};
        String mathtype = null;
        int result = 0;
        for(int i=0; i<OperatorType.values().length; i++)
            {
                String type = types[i].getSign();
                if (type == sign)
                {
                    mathtype = sign;
                }
            }
        switch (mathtype)
        {
            case "+":
                result = num1 + num2;
                break;
        }
    }
}
