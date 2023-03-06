package Assignment1;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Zajecia {
    String nazwa;
    int liczbaGodzin;
    ArrayList<String> listaStudentow;

    public Zajecia(String nazwa, int liczbaGodzin){
        this.nazwa = nazwa;
        this.liczbaGodzin = liczbaGodzin;
        this.listaStudentow = new ArrayList<String>();
    }

    public void dopiszStudenta(String imie){
        if (listaStudentow.size() >= 10) {
            System.out.println("The maximum number of students has been reached");
        } else {
            listaStudentow.add(imie);
        }
    }
}
