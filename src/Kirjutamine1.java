import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Kirjutamine1
{
    public static void main(String arg[]) throws IOException
    {
        PrintWriter kirjutaja = new PrintWriter(new FileWriter("tervitus.txt"));
        kirjutaja.println();
        kirjutaja.close();
    }
}
