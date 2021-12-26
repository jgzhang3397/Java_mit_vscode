/*
比较运算符：
    >
    <
    >=
    <=
    == --> gleich
    !=
注意事项：
    1.结果是boolean， true or false
    2。verboten： 1 > x > 3
*/
public class Demo08Operator {
    public static void main(String[] args) {
        System.out.println(10 > 5);//true

        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 < num2);//true
        System.out.println(num2 >= 100);//false
        System.out.println(num2 <= 12);//true

        System.out.println("=============");
        //System.out.println(10 == 10);
        System.out.println(10 != 20);
        //System.out.println(10 != 10);
    }
}
