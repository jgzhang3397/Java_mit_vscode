/*
Operator: +

    1.数值， 加法
    2.字符char类型， char-->int，然后计算， ASCII, Unicode
    3.String字符串， 加号表示连接操作
*/
public class Demo05Plus {
    public static void main(String[] args) {
        String st1 = "Hello";
        System.out.println(st1);

        System.out.println(st1 + " World");

        String st2 = "Java";
        //String + int --> String
        System.out.println(st2 + 20);

        //优先级
        //String + int + int
        //String + int
        //String
        System.out.println(st2 + 20 + 30);//Java2030
        System.out.println(st2 +(20 + 30));//Java50
    }
}
