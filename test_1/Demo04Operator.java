/*
Operator: + - * / % ...
Ausdruck: a+b, 20+30; ...

Operator: ++ --
使用方法：
    1.单独使用
    2.混合使用
使用区别：
    1.单独使用：++num == num++
    2.混合使用：
        a： ++num， 先+后用
        b： num++，先用后+
注意事项：
    只能变量，不能常量
*/
public class Demo04Operator {
    public static void main(String[] args) {
        // System.out.println(20 + 30);//50

        // int a = 20;
        // int b = 30;
        // System.out.println(a-b);//-10

        // System.out.println(a*10);//200

        // int x = 10;
        // int y = 3;
        // int result1 = x / y;
        // int result2 = x % y;
        // System.out.println(result1);//3
        // System.out.println(result2);//1

        // //int + double --> double + double --> double
        // double result3 = x + 2.5;
        // System.out.println(result3);

        int num1 = 10;
        System.out.println(num1);
        num1++;
        System.out.println(num1);
        ++num1;
        System.out.println(num1);
        System.out.println("==============");

        //与打印语句混合
        int num2 = 20;
        System.out.println(++num2);//21 --> 21
        System.out.println(num2);//21
        System.out.println("==============");

        int num3 = 30;
        System.out.println(num3++);//30
        System.out.println(num3);//31
        System.out.println("==============");

        int num4 = 40;
        //和赋值语句混合
        int result1 = --num4;//39 --> 39
        System.out.println(result1);//39
        System.out.println(num4);//39
        System.out.println("==============");

        int num5 = 50;
        int result2 = num5--;//50 --> 49
        System.out.println(result2);//50
        System.err.println(num5);//49
        System.out.println("==============");

        int x = 10;
        int y = 20;
        int result3 = ++x + y--;
        System.out.println(result3);//11+20
        System.out.println(x);//11
        System.out.println(y);//19

    }
}
