public class Demo01Const
{
    //Was ist Const?
    //1. string const : "abc", "123" ,"Hello"
    //2. int const: 123, 200, 0, -29
    //3. float const: 2.5, -3.13, 0.0
    //4. char const: 'a', 'v', '9', '\'
    //5. bool const: true, false
    //6. null const: null
    public static void main(String[] args)
    {
        //String const
        System.out.println("ABC");
        System.out.println(" ");
        System.out.println("abc");
        //int const
        System.out.println(30);
        System.out.println(-500);
        //float const
        System.out.println(3.14);
        System.out.println(-2.33);
        //char const
        System.out.println('a');
        System.out.println('6');
        System.out.println(' ');
        //bool const
        System.out.println(true);
        System.out.println(false);
        //null const
        //System.out.println(null);//不能直接显示
    }
}
//=========基本数据类型==========
//整型： byte short int long （1，2，4，8）
//浮点型： float double （4， 8）
//字符型： char （2）
//布尔类型： boolean（1）

//=========引用数据类型==========
//字符串，数组， 类， 接口， Lambda

//Achtung
//1.字符串是引用不是基本
//2.浮点型是近似值
//3.数据范围和字节数不相关， float>>long, but float 4byte, long 8byte
//4.浮点数默认double，使用float类型，需要加后缀F
//  如果是整数，默认int，如果使用long类型，需要加后缀L
//  System.out.println(100L)