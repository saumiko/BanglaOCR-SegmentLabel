import java.io.*;
import java.util.StringTokenizer;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 * This class will configure the input.txt file.
 * @author saumiko
 */
public class ConfigureTwoSegment {
    /*
    * This method will take the input file and create an intermidiate file (OutputChar.txt) without all the spaces in the main document.
    */
    public static void initiate()
    {
        try{
            FileInputStream inputDocumentStream = new FileInputStream("GranadaOutput.txt");
            BufferedReader inputDocumentReader = new BufferedReader(new InputStreamReader(inputDocumentStream));
            BufferedWriter intermidiateDocumentWriter = null;
            intermidiateDocumentWriter = new BufferedWriter(new FileWriter("IntermidiateDocument.txt"));
            String Line;
            while ((Line = inputDocumentReader.readLine()) != null)   {
                StringTokenizer inputLine = new StringTokenizer(Line);
                while(inputLine.hasMoreTokens())
                {
                    String word = inputLine.nextToken();
                    intermidiateDocumentWriter.write(word);
                }
            }
            intermidiateDocumentWriter.flush();
            intermidiateDocumentWriter.close();
            inputDocumentReader.close();
        }
        catch(Exception e){}
        swapCharacters();
    }
    
    /*
    * This method will swap the ি ে ো ৈ ৌ Charachters with the parent character.
    */
    public static void swapCharacters()
    {
        try{
            FileInputStream intermidiateFileStream = new FileInputStream("IntermidiateDocument.txt");
            BufferedReader intermidiateFileReader = new BufferedReader(new InputStreamReader(intermidiateFileStream));
            
            BufferedWriter outputWriter = null;
            outputWriter = new BufferedWriter(new FileWriter("Output.txt"));
            
            String Document = null;
            String swapped;
            Document = intermidiateFileReader.readLine();
            
            //Convert the document string to character array.
            char[] DocumentCharacters = Document.toCharArray();
            char charMain, charKar; //Parent-Character & Kar-Character
            for(int i = 0; i<Document.length(); i++)
            {
                //Swap
                if(DocumentCharacters[i]=='ি'||DocumentCharacters[i]=='ে'||DocumentCharacters[i]=='ো'||DocumentCharacters[i]=='ৌ'||DocumentCharacters[i]=='ৈ'||DocumentCharacters[i]=='ু'||DocumentCharacters[i]=='ূ'||DocumentCharacters[i]=='ৃ')
                {
                    charKar = DocumentCharacters[i];
                    charMain = DocumentCharacters[i-1];
                    DocumentCharacters[i-1] = charKar;
                    DocumentCharacters[i] = charMain;
                }
            }
            swapped = new String(DocumentCharacters);
            outputWriter.write(swapped);
            outputWriter.flush();
            outputWriter.close();
        }
        catch(Exception e){}
        
        //Deleating the intermidiate file
        try{
            File f = new File("IntermidiateDocument.txt");
            f.delete();
        }
        catch(Exception e){}
        //Two Combined Characters
        handleCombinedCharacters();
        //Three Combined Characters
        handleCombinedCharacters();       
    }
    
    public static void handleCombinedCharacters()
    {
        try{
            FileInputStream intermidiateFileStream = new FileInputStream("Output.txt");
            BufferedReader intermidiateFileReader = new BufferedReader(new InputStreamReader(intermidiateFileStream));
            
            BufferedWriter outputWriter = null;
            outputWriter = new BufferedWriter(new FileWriter("Output2.txt"));
            
            String Document = null;
            String swapped;
            
            Document = intermidiateFileReader.readLine();
            
            //Convert the document string to character array.
            char[] DocumentCharacters = Document.toCharArray();
            char charMain, charKar; //Parent-Character & Kar-Character
            for(int i = 0; i<Document.length(); i++)
            {
                //Swap
                if(DocumentCharacters[i]=='ি'||DocumentCharacters[i]=='ে'||DocumentCharacters[i]=='ো'||DocumentCharacters[i]=='ৌ'||DocumentCharacters[i]=='ৈ'||DocumentCharacters[i]=='ু'||DocumentCharacters[i]=='ূ'||DocumentCharacters[i]=='ৃ')
                {
                    if(DocumentCharacters[i-1] == '্' )
                    {
                        charKar = DocumentCharacters[i];
                        charMain = DocumentCharacters[i-2];
                        DocumentCharacters[i-2] = charKar;
                        DocumentCharacters[i-1] = charMain;
                        DocumentCharacters[i] = '্';
                    }
                }
            }
            swapped = new String(DocumentCharacters);
            outputWriter.write(swapped);
            outputWriter.flush();
            outputWriter.close();
        }
        catch(Exception e){}
        
        //Deleating the intermidiate file
        try{
            File f = new File("Output.txt");
            f.delete();
            File oldfile =new File("Output2.txt");
            File newfile =new File("Output.txt");
            oldfile.renameTo(newfile);
        }
        catch(Exception e){}
    }
}
