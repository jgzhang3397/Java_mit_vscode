/*
break关键字的用法：
    1.在switch语句里，一旦执行，switch语句立即结束
    2.在循环语句中，一旦执行，循环结束，打断循环

Tips
    循环次数确定用for，否则用while
*/
public class Demo06Break {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++)
        {
            if(i == 3)
            {
                break;
            }
            System.out.println("Hello "+ i);
        }
    }
}
