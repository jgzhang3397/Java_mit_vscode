/*
    与：&& 全都是true 才是true
    或：|| 一个是true 就是true
    非：！ 本来是true ==> 变 false
&& 和 ｜｜ 具有短路效果：左边得到最终结果，右边将不再执行，节省性能

注意事项：
1. 逻辑运算符只能boolean
2. 
*/
public class Demo09Logic {
    public static void main(String[] args) {
        System.out.println(true && false);//false
        System.out.println(true && true);//true
        System.out.println("=================");

        //System.out.println(true || (1 > 3));//true
        System.out.println(false || false);//false
        System.out.println("=================");

        System.out.println(true);
        System.out.println(!true);
        System.out.println("=================");

        int a = 10;
        //System.out.println(3 > 4 && ++a > 100);
        System.out.println(a);
        System.out.println("=================");
        
        int b = 20;
        //System.out.println(3 <4 || ++b < 100);
        System.out.println(b);
        
    }
}
