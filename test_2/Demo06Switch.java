public class Demo06Switch {
    public static void main(String[] args) {
        int num = 7;
        switch(num)
        {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tus");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("Daten error");
                break;
        }
    }
}
