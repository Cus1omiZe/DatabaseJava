import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lugemine1
{
    public static void main(String[] arg) throws IOException
    {
        BufferedReader lugeja = new BufferedReader(new FileReader("linnad.txt"));
        String rida = lugeja.readLine();
        while (rida!=null)
        {
            System.out.println(rida);
            rida = lugeja.readLine();
        }
    }
}
