import Assignment1.Ex1;
import Assignment1.Ex2;
import Assignment1.Ex3;
import Assignment1.Zajecia;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Ex1
        System.out.println(Ex1.CalculatePriceNetto(172.0, 17.0));

        //Ex2
        Ex2.Fifo();

        //Ex3
        Ex3.writeToFile("Hello World!", "C:\\Users\\jmeka\\OneDrive\\Desktop\\Sql\\ROKII\\Sem letni\\PP4\\Assignment1\\src\\Assignment1");
        Ex3.writeToFile("Hello World!!!", "C:\\Users\\jmeka\\OneDrive\\Desktop\\Sql\\ROKII\\Sem letni\\PP4\\Assignment1\\src\\Assignment1");

        //Ex4
        Zajecia analiza = new Zajecia("Analiza", 40);
        analiza.dopiszStudenta("Gosia");
        analiza.dopiszStudenta("Amelia");
        analiza.dopiszStudenta("Asia");
        analiza.dopiszStudenta("Malwina");
        analiza.dopiszStudenta("Wiktor");
        analiza.dopiszStudenta("Szymon");
        analiza.dopiszStudenta("Filip");
        analiza.dopiszStudenta("Ążej");
    }
}