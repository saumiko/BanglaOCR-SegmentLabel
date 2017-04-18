import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ConfigureReconstructedDocument {
    public static void SwapCharacters()
    {
        String reconstructedDoc, newlyConstructed;
        try{
            FileInputStream reconstructedDocStream = new FileInputStream("ReconstructedDoc.txt");
            BufferedReader roconstructedDocReader = new BufferedReader(new InputStreamReader(reconstructedDocStream));
            BufferedWriter intermidiateDocumentWriter = null;
            intermidiateDocumentWriter = new BufferedWriter(new FileWriter("IntermidiateReconstructedDocument.txt"));
            reconstructedDoc = roconstructedDocReader.readLine();
            char[] DocumentCharacters = reconstructedDoc.toCharArray();
            char charMain, charKar;

            for(int i = 0; i<reconstructedDoc.length(); i++)
            {
                 if(DocumentCharacters[i]=='ি'||DocumentCharacters[i]=='ে'||DocumentCharacters[i]=='ো'||DocumentCharacters[i]=='ৌ'||DocumentCharacters[i]=='ৈ')
                {
                    if((i+1)!=reconstructedDoc.length()){
                        charKar = DocumentCharacters[i];
                        charMain = DocumentCharacters[i+1];
                        DocumentCharacters[i+1] = charKar;
                        DocumentCharacters[i] = charMain;
                        i++;
                    }
                }
            }
            System.out.println(DocumentCharacters);
            newlyConstructed = new String(DocumentCharacters);
            //newlyConstructed = handleCombinedCharacters(newlyConstructed);
            //System.out.println(newlyConstructed);
            intermidiateDocumentWriter.write(newlyConstructed);
            intermidiateDocumentWriter.flush();
            intermidiateDocumentWriter.close();
        }
        catch(Exception e){
             System.out.println(e);
        }
        
        //Two Combined Characters
        handleCombinedCharacters();
        //Three Combined Characters
        handleCombinedCharacters();      

    }
 public static void handleCombinedCharacters()
    {
    try{
            FileInputStream intermidiateFileStream = new FileInputStream("IntermidiateReconstructedDocument.txt");
            BufferedReader intermidiateFileReader = new BufferedReader(new InputStreamReader(intermidiateFileStream));
            
            BufferedWriter outputWriter = null;
            outputWriter = new BufferedWriter(new FileWriter("FinalReconstructed.txt"));
            
            String Document = null;
            String swapped;
            
            Document = intermidiateFileReader.readLine();
            
            //Convert the document string to character array.
            char[] DocumentCharacters = Document.toCharArray();
            char charMain, charKar; //Parent-Character & Kar-Character
            for(int i = 0; i<Document.length(); i++)
            {
                //Swap
                if(DocumentCharacters[i]=='ি'||DocumentCharacters[i]=='ে'||DocumentCharacters[i]=='ো'||DocumentCharacters[i]=='ৌ'||DocumentCharacters[i]=='ৈ')
                {
                    if(DocumentCharacters[i+1] == '্' )
                    {
                        charKar = DocumentCharacters[i];
                        charMain = DocumentCharacters[i+2];
                        DocumentCharacters[i+2] = charKar;
                        DocumentCharacters[i+1] = charMain;
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
       
    }
    
}
