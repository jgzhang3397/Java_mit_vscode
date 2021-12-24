public class Demo02Variable {
    public static void main(String[] args) {
        //erstellen eine Variante
        int num1;
        //eine Daten darin zufuegen
        num1 = 10;
        System.out.println(num1);
        //num1 aendern
        num1 = 20;
        System.out.println(num1);;

        //dirkt alle erstllen
        int num2 = 30;
        System.out.println(num2); 
        num2 = 35;
        System.out.println(num2);
        System.out.println("=======================");

        byte num3 = 30;//数值范围不能超过数据类型范围
        System.out.println(num3);
        // byte num4 = 400;
        // System.out.println(num4);

        short num5 = 50;
        System.out.println(num5);

        long num6 = 3000000L;
        System.out.println(num6);//3000000 keine L

        float num7 = 2.5F;
        System.out.println(num7);//2.5 keine F

        double num8 = 1.2;
        System.out.println(num8);

        char c1 = 'a';
        System.out.println(c1);
        c1 = '中';
        System.out.println(c1);

        boolean var1 = true;
        System.out.println(var1);
        var1 = false;
        System.out.println(var1);

        boolean var2 = var1;
        System.out.println(var2);
    }
}