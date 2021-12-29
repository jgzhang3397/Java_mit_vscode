/*
三种循环的区别：
    1. 如果条件判断从来没有满足，那么for循环和while循环会执行0次， 但是do-while循环会执行至少一次
    2. 如果for循环的变量在小括号中定义，只有循环内部可以用。while循环和do-while循环初始化语句在外面，循环后可继续使用
*/
public class Demo05LoopDiff {
    public static void main(String[] args) {
        int i = 1;
        for(i = 1; i<0; i++)
        {
            System.out.println("Hello");
        }
        //System.out.println(i); //变量i定义在for循环小括号内，只有for循环才能用
        System.out.println("============");

        do
        {
            System.out.println("World");
            i++;
        }while(i<0);
        System.out.println(i);//2
    }
}
