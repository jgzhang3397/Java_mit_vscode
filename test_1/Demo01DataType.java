/*
    当数据类型不一样，数据类型转换
        1.自动类型转换（隐式）
            代码不需要处理，自动完成
            规则：数据范围从小大da
        2.强制类型转换（显式）
*/
public class Demo01DataType {
    public static void main(String[] args) {
        System.out.println(1024);//整数，默认int
        System.out.println(3.14);//浮点数，默认double

        //左边long类型， 右边默认int类型
        //int --> long, 数据范围从小到大
        long num1 = 100;
        System.out.println(num1);//100

        //double数据类型，右边float类型，左右不一样
        //float-->double,从小到大
        double num2 = 2.5F;
        System.out.println(num2);

        //float数据类型，long类型
        //long->>float,从小到大
        float num3 = 30L;
        System.out.println(num3);
    }
}
