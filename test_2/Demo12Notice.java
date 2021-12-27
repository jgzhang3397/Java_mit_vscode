//import java.net.Socket;

/*
对于byte/short/char三种类型，如果右边数值没有超过类型范围
javac编译器将自动补上一个(byte)/(short)/(char)

1.没超过范围，强转
2.超过范围，报错
======================
编译器的常量优化
    等式右侧全是常量可以
    short a = 5 + 8; --> short a = 13;
    等式右侧存在变量不行
    short a = 5 + b;//error
*/
public class Demo12Notice {
    public static void main(String[] args) {
        // byte a = /* byte */ 30;
        // System.out.println(a);//30

        // char b = /* char */ 65;
        // System.out.println(b);//a

        //byte c = 128;

        // short a = 10;
        // short b = 20;
        //short c = a + b;
        //short c = a + 5;
        short c = 10 + 20;
        System.out.println(c);

    }
}
