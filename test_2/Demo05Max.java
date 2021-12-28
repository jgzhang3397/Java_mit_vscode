//使用三元运算符和if-else语句实现
//取两个数的最大值
public class Demo05Max {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //三元运算符
        //int max = a > b ? a : b;

        //使用if
        int max;
        if(a > b)
        {
            max = a;
        }
        else 
        {
            max = b;
        }

        System.out.println("最大值: "+ max);


    }
}
