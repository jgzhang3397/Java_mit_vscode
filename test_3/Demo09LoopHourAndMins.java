/*

*/
public class Demo09LoopHourAndMins {
    public static void main(String[] args) {
        for(int hour = 0; hour<24; hour++)
        {
            for(int mins = 0; mins<60; mins++)
            {
                System.out.println("Um "+ hour + " Uhr " + mins + " Minuten" );
            }
        }
    }
}
