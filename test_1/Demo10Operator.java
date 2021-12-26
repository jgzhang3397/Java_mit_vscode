//import java.rmi.server.SocketSecurityException;

/*
一元运算符：！ ++ --
二元运算符：+ - * / % =
三元运算符：
    格式：
    数据类型 变量名 = 条件判断 ？表达式A ：表达式B
    条件判断= true ==> 变量名=表达式A
    条件判断= false ==> 变量名=表达式B
注意事项：
    表达式A和B符合左边数据类型
    其结果必须被使用
*/
public class Demo10Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = a>b ? a : b ;
        System.out.println("Max: "+ max);

        //int result = 3 > 4 ? 2.5 : 10;
        
    }
}
