/*
do while 的标准格式
    do 
    {
        循环体
    }while(条件判断)；

拓展格式：
do{
    循环体
    步进语句
}while(条件判断);

*/
public class Demo03DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do
        {
            System.out.println("我爱你 "+ i);
            i++;
        }while(i<=100);
    }
}
