import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saumiko
 */
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
                    //System.out.println(i+" :"+DocumentCharacters[i]+" "+(i+1)+": "+DocumentCharacters[i+1]);
                    if((i+1)!=reconstructedDoc.length()){
                        charKar = DocumentCharacters[i];
                        charMain = DocumentCharacters[i+1];
                        DocumentCharacters[i+1] = charKar;
                        DocumentCharacters[i] = charMain;
                        i++;
                    }
                }
            }
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
    }
    
    public static String handleCombinedCharacters(String input)
    {
        String handled = null;
        try{
            
            char[] DocumentCharacters = input.toCharArray();
            char charMain, charKar; //Parent-Character & Kar-Character
            for(int i = 0; i<input.length(); i++)
            {
                if(DocumentCharacters[i]=='ি'||DocumentCharacters[i]=='ে'||DocumentCharacters[i]=='ো'||DocumentCharacters[i]=='ৌ'||DocumentCharacters[i]=='ৈ')
                {
                    if(DocumentCharacters[i-1] == '্' )
                    {
                        charKar = DocumentCharacters[i];
                        charMain = DocumentCharacters[i-2];
                        System.out.println(i+": "+DocumentCharacters[i]+" "+DocumentCharacters[i-2]);
                        DocumentCharacters[i-2] = charKar;
                        DocumentCharacters[i-1] = charMain;
                        DocumentCharacters[i] = '্';
                    }
                }
            }
            handled = new String(DocumentCharacters);
            System.out.println(handled);
            return handled;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            return handled;
        }
    }
    
}
