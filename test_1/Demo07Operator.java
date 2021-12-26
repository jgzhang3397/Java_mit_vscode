/*
赋值运算符：
    =； int a = 30；
复合赋值运算符
    +=: a += 1 ==> a = a + 1;
    -=:
    *=:
    /=:
    %=:
注意事项：
    1.只能变量，不能常量
    2.复合赋值运算符隐藏强制转换
*/
public class Demo07Operator {
    public static void main(String[] args) {
        int a = 10;
        a += 5;
        System.out.println(a);//15

        int x = 10;
        x %= 3;
        System.out.println(x);

        byte num = 30;
        num += 5;
        System.out.println(num);
    }
}
