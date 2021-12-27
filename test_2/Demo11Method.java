/*
定义一个方法的格式

public static void 方法名(){
    方法体
}
方法名：和变量一样，小驼峰
方法体：大括号内的任意一条语句

注意事项：
    方法定义顺序无所谓
    方法只能并列不能嵌套
    方法需要调用才能使用
方法的调用：
    方法名();

*/
public class Demo11Method{
    public static void main(String[] args) {
        ich();//调用方法
    }

    //Ich
    public static void ich(){
        System.out.println("essen");
        System.out.println("schlafen");
        System.out.println("lernen");
    }

    //Snowy
    public static void snowy() {
        System.out.println("essen");
        System.out.println("schlafen");
    }

    //Anna
    public static void anna() {
        System.out.println("schlafen");
        System.out.println("essen");
        System.out.println("arbeiten");
    }
}