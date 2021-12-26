/*
ASCII (American Standrad Code for Information Interchange)
   0  --> 48
   65 --> 'A'
   97 --> 'a'
Unicode 0~127 sind gleich wie ASCII, mehr groesser
*/
public class Demo03DataTypeChar {
    public static void main(String[] args) {
        char ch1 ='1';
        System.out.println(ch1 + 0);//1 + 48

        char ch2 = 'A';
        System.out.println(ch2);

        char ch3 ='c';
        //char --> 从小到大
        //自动转换
        int num = ch3;
        System.out.println(num);

        char ch4 = '中';
        System.out.println(ch4 + 0);//20013
    }
}
