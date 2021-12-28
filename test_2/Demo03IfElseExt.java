//import javax.lang.model.util.ElementScanner6;

/*
if x >= 3 --> y = 2x +1;
if -1<x<3 --> y = 2x;
if x<=-1  --> y = 2x -1;
*/
public class Demo03IfElseExt {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        if(x>=3)
        {
            y = 2*x + 1;
        }
        else if (-1<x && x<3)
        {
            y = 2*x;
        }
        else if (x <= -1)
        {
            y = 2*x -1;
        }
        else
        {
            ;
        }
        System.out.println("y = "+y);
    }
}
