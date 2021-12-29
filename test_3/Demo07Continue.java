/*
continue关键字：
    一旦执行。立即跳过当前循环剩余内容，马上开始下一次循环
*/
public class Demo07Continue {
    public static void main(String[] args) {
        for(int i = 1; i<10; i++)
        {
            if(i ==4)
            {
                continue;
            }
            System.out.println(i + " mal putzen");
        }
    }
}
