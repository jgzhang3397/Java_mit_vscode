/*
标准格式：
    while(条件判断)
    {
        循环体
    }
拓展格式：
    初始化语句；
    while(条件判断)
    {
        循环体
        步进表达式
    }
*/
public class Demo02WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while(i<=100)
        {
            System.out.println("i love u " + i);
            i++;
        }
    }
}
