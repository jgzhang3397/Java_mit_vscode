

public class Demo04IfUebung {
    public static void main(String[] args) {
        int note = 98;
        if(note >= 90 && note <=100)
        {
            System.out.println("Sehr gut!");
        }
        else if (note>=80 && note < 90)
        {
            System.out.println("Gut");
        }
        else if (note>= 70 && note < 80)
        {
            System.out.println("Befriedigend");
        }
        else if(note>= 60 && note <70)
        {
            System.out.println("Bestanden");
        }
        else if(note >=0 && note < 60)
        {
            System.out.println("Nicht bestanden");
        }
        else 
        {
            System.out.println("Daten Error!");
        }
    }
}
