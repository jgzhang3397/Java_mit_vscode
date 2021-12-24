/*
    1.
    2.
    3.
    ...
*/
public class Demo03VariableNotice {
    public static void main(String[] args) {
    //1.变量名不能重复
        //     int num1 = 20;
        //     int num1 = 200;
    // 2.对于float 和 long， F 和 L 要加上
    // 3.使用bite和short时， 数据值不能超过数据类型范围
    // 4.没有赋值的变量要先赋值才能使用
        // int num2;
        // System.out.println(num2);
    // 5.[作用域]，先定义后使用，在大括号内可用
    int num3 = 20;
    System.out.println(num3);

    {
        int num4 = 30;
        System.out.println(num4);
    }
    //System.out.println(num4);
    // 6. 可以同时定义多个值，但不推荐
    }
}
