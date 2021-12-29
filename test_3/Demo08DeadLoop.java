/*
永远停不下来的循环，就是死循环

死循环的标准模式：
while(true)
{
    循环体
}
*/
public class Demo08DeadLoop {
    public static void main(String[] args) {
        // for(int i = 0; i <= 10; )
        // {
        //     System.out.println("dead loop ");
        // }
        //死循环 -- debug 运行

        while(true)
        {
            System.out.println("Ich liebe dich");
            break;
        }
    }
}
