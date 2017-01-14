import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * In the DeleteRepeats method, output is strange. File printing fails.
 * @author saumiko
 */
public class Main {
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        differentiateCharacters();
        swapCharacters();
        
    }
    
    public static void differentiateCharacters()
    {
        try{
            FileInputStream fstream = new FileInputStream("input.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            BufferedWriter outputCharWriter = null;
            outputCharWriter = new BufferedWriter(new FileWriter("OutputChar.txt"));
            String Line;
            while ((Line = br.readLine()) != null)   {
                StringTokenizer inputLine = new StringTokenizer(Line);
                while(inputLine.hasMoreTokens())
                {
                    String word = inputLine.nextToken();
                    int wordLength = word.length();
                    for(int i=0;i<wordLength;i++)
                    {
                        outputCharWriter.write(word.charAt(i));
                    }
                }
            }
            outputCharWriter.flush();
            outputCharWriter.close();
            br.close();
        }
        catch(Exception e){}
    }
    
    public static void swapCharacters()
    {
        try{
            FileInputStream fstream = new FileInputStream("OutputChar.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            BufferedWriter outputCharWriter = null;
            outputCharWriter = new BufferedWriter(new FileWriter("OutputCharTwo.txt"));
            
            String Doc;
            char CharOne, CharTwo;
            Doc = br.readLine();
            for(int i=0; i<Doc.length();i++)
            {
                if(Doc.charAt(i)=='ি'||Doc.charAt(i)=='ে'||Doc.charAt(i)=='ো'||Doc.charAt(i)=='ৌ'||Doc.charAt(i)=='ৈ')
                {
                    CharTwo = Doc.charAt(i);
                    CharOne = Doc.charAt(i-1);
                    outputCharWriter.write(CharTwo);
                    outputCharWriter.write(CharOne);
                }
                else
                {
                    outputCharWriter.write(Doc.charAt(i));
                }
            }
            outputCharWriter.flush();
            outputCharWriter.close();
            br.close();
        }
        catch(Exception e){}
        try{
            File f = new File("OutputChar.txt");
            f.delete();
        }
        catch(Exception e){}
        DeleteRepeats();
    }
    
    public static void DeleteRepeats()
    {
        try{
            FileInputStream fstream = new FileInputStream("OutputCharTwo.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            BufferedWriter outputCharWriter = null;
            outputCharWriter = new BufferedWriter(new FileWriter("Output.txt"));
            String Doc;
            int j;
            Doc = br.readLine();
            for(int i=0; i<Doc.length();i++)
            {
                j = i+1;
                if(Doc.charAt(j)=='ি'||Doc.charAt(j)=='ে'||Doc.charAt(j)=='ো'||Doc.charAt(j)=='ৌ'||Doc.charAt(j)=='ৈ'){
                    continue;
                }
                else{
                    outputCharWriter.write(Doc.charAt(i));
                    System.out.print(Doc.charAt(i));
                }
            }
            outputCharWriter.flush();
            outputCharWriter.close();
            br.close();
        }
        catch(Exception e){}
        try{
            File f = new File("OutputCharTwo.txt");
            f.delete();
        }
        catch(Exception e){}
    }
}
