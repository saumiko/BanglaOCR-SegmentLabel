import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author saumiko
 */
public class Main {
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        FileInputStream fstream = new FileInputStream("input.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String Line;

        while ((Line = br.readLine()) != null)   {
            StringTokenizer inputLine = new StringTokenizer(Line);
            while(inputLine.hasMoreTokens())
            {
                String word = inputLine.nextToken();
                int wordLength = word.length();
                for(int i=0;i<wordLength;i++)
                {
                    System.out.println(word.charAt(i));
                }
            }
        }

        br.close();
    }
}
