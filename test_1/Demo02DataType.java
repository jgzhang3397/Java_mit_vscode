/*
强制类型转换
    范围小的变量名 ==》原本范围大的数据
注意事项
    1.不推荐使用，容易精度损失，数据溢出
    2.byte/short/char 可以数学运算，例如加法‘+’
    3.byte/short/char 运算时 都被提升为int 然后计算
    4.boolean类型不能发生数据类型转换
ASCII
   0  --> 48
   65 --> A
   97 --> a
*/
public class Demo02DataType {
    public static void main(String[] args) {
        int num1 = (int) 100L;
        System.out.println(num1);

        int num2 = (int)6000000000L;//long 强制转换成 int 精度损失
        System.out.println(num2);//1705032704

        int num3 =(int)3.14;
        System.out.println(num3);//3

        char c ='A';
        System.out.println(c + 1);//6 A==65 ASCII

        byte num4 = 40;
        byte num5 = 50;
        //byte + byte --> int + int --> int
        int result1 = num4 + num5;
        System.out.println(result1);//90

        short num6 = 60;
        //byte + short --> int + int --> int
        // int --> short 必须保证逻辑真实大小没有超过short，否则数据溢出
        short result2 = (short)(num4 + num6);
        System.out.println(result2);//100

        
    }
}
