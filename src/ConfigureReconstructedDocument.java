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
            reconstructedDoc = roconstructedDocReader.readLine();
            char[] DocumentCharacters = reconstructedDoc.toCharArray();
            char charMain, charKar;
            for(int i = 0; i<reconstructedDoc.length(); i++)
            {
                if(DocumentCharacters[i]=='ি'||DocumentCharacters[i]=='ে'||DocumentCharacters[i]=='ো'||DocumentCharacters[i]=='ৌ'||DocumentCharacters[i]=='ৈ')
                {
                    charKar = DocumentCharacters[i];
                    charMain = DocumentCharacters[i+1];
                    DocumentCharacters[i+1] = charKar;
                    DocumentCharacters[i] = charMain;
                }
            }
            System.out.println(DocumentCharacters);
            newlyConstructed = new String(DocumentCharacters);
            System.out.println(newlyConstructed);
        }
        catch(Exception e){}
    }
}
