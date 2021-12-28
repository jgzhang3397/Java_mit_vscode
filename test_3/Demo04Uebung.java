
/*
求1~100内数字的偶数之和
*/
public class Demo04Uebung {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        for(i=1; i<=100; i++)
        {
            if(i%2==0)
            {
                sum += i;
            }
        }
        System.out.println("Sum : "+ sum);

        System.out.println("===========");
        while(i<=100)
        {
            if(i%2==0)
            {
                sum = sum +i;
            }
            i++;
        }
        System.out.println("Sum : "+ sum);

        System.out.println("===========");
        do
        {
            if(i%2==0)
            {
                sum = sum +i;
            }
            i++;
        }while(i<=100);
        System.out.println("Sum : "+ sum);
    }
}
