public enum OperatorType {
    SUM('+'),
    SUB('-'),
    MUL('*'),
    DIV('%');

    private final char sign;

    //생성자
    OperatorType(char sign) {
        this.sign = sign;
    }

    //getter 생성
    public char getSign() {
        return sign;
    }

    public static OperatorType from(char sign)
    {
        for(OperatorType type : OperatorType.values()) // values()를 통해 OperateType이 가진 모든 값들 type에 담음
        {
            if(type.getSign() == sign)
            {
                return type;
            }
        }
        throw new IllegalArgumentException("지원하지 않는 연산자 " + sign);
    }
}
