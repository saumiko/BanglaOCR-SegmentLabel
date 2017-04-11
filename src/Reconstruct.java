import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saumiko
 */
public class Reconstruct {
    public static void reconstruct()
    {
        try{
            FileInputStream segmentCodesStream = new FileInputStream("SegmentCodes.txt");
            BufferedReader segmentCodesReader = new BufferedReader(new InputStreamReader(segmentCodesStream));
            BufferedWriter reconstructedDocumentWriter = null;
            reconstructedDocumentWriter = new BufferedWriter(new FileWriter("ReconstructedDoc.txt"));
            String Line;
            String CharCode;
            String finalStr = "";
            while ((Line = segmentCodesReader.readLine()) != null)
            {
                StringTokenizer inputLine = new StringTokenizer(Line);
                if(inputLine.hasMoreTokens())
                {
                    CharCode = inputLine.nextToken();
                    if(CharCode.charAt(0)=='a')
                        finalStr += AsciiCodeSearch(CharCode.substring(1, CharCode.length()));
                    else
                        finalStr += BanglaCodeSearch(CharCode);
                }
            }
            reconstructedDocumentWriter.write(finalStr);
            reconstructedDocumentWriter.flush();
            reconstructedDocumentWriter.close();
        }
        catch(Exception e){
        }
    }
    
    public static String BanglaCodeSearch(String code)
    {
        String finalChar = null;
        boolean found = true;
        try{
            FileInputStream inputBanglaCodesStream = new FileInputStream("BanglaCodes.txt");
            BufferedReader inputBanglaReader = new BufferedReader(new InputStreamReader(inputBanglaCodesStream));
            String Line;
            String LineCode;
            while(found)
            {
                Line = inputBanglaReader.readLine();
                StringTokenizer inputLine = new StringTokenizer(Line);
                if(inputLine.hasMoreTokens())
                {
                    LineCode = inputLine.nextToken();
                    if(LineCode.equals(code)){
                        finalChar = inputLine.nextToken();
                        found = false;
                    }
                }
            }
        }
        catch(Exception e){}
        return finalChar;
    }
    
    public static String BanglaLetterSearch(String code)
    {
      
        String finalChar = null;
        boolean found = true;
        try{
            FileInputStream inputBanglaCodesStream = new FileInputStream("BanglaCodes.txt");
            BufferedReader inputBanglaReader = new BufferedReader(new InputStreamReader(inputBanglaCodesStream));
            String Line;
            String LineCode, BanglaCode;
            while(found)
            {
                Line = inputBanglaReader.readLine();
                StringTokenizer inputLine = new StringTokenizer(Line);
                if(inputLine.hasMoreTokens())
                {
                    LineCode = inputLine.nextToken();
                    BanglaCode = inputLine.nextToken();
                    if(BanglaCode.equals(code)){
                        finalChar =LineCode;
                        found = false;
                    }
                }
            }
        }
        catch(Exception e){}
        return finalChar;
        
    }
    public static String AsciiCodeSearch(String code)
    {
        String finalChar = null;
        boolean found = true;
        try{
            FileInputStream inputAsciiCodesStream = new FileInputStream("ASCII.txt");
            BufferedReader inputAsciiReader = new BufferedReader(new InputStreamReader(inputAsciiCodesStream));
            String Line;
            String LineCode;
            while(found)
            {
                Line = inputAsciiReader.readLine();
                StringTokenizer inputLine = new StringTokenizer(Line);
                if(inputLine.hasMoreTokens())
                {
                    LineCode = inputLine.nextToken();
                    if(LineCode.equals(code)){
                        finalChar = inputLine.nextToken();
                        found = false;
                    }
                }
            }
        }
        catch(Exception e){}
        return finalChar;
    }
    
    
    
}
