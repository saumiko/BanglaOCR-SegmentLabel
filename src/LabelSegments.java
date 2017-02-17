import java.io.*;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 * This Class will Label the segments in the segment.txt file.
 * @author saumiko
 */
public class LabelSegments {
    public static void labelCharacters()
    {
        String document = null;
        String segmentCode = "";    
        try{
            FileInputStream inputDocumentStream = new FileInputStream("Output.txt");
            BufferedReader inputDocumentReader = new BufferedReader(new InputStreamReader(inputDocumentStream));
            document = inputDocumentReader.readLine();
            for(int i=0; i<document.length(); i++)
            {
                
                if(document.charAt(i+1) == '্' )
                {   
                    
                    //Three Combined Characters
                    if(document.charAt(i+3) == '্' )
                    {
                        if(document.charAt(i)=='ক' && document.charAt(i+2)=='ষ' && document.charAt(i+4)=='য')
                            segmentCode += "215547 215547\n";
                        else if(document.charAt(i)=='ক' && document.charAt(i+2)=='ষ' && document.charAt(i+4)=='ম')
                            segmentCode += "215546 215546\n";
                        else if(document.charAt(i)=='ক' && document.charAt(i+2)=='ষ' && document.charAt(i+4)=='ণ')
                            segmentCode += "215535 215535 215535\n";
                        else if(document.charAt(i)=='ক' && document.charAt(i+2)=='ত' && document.charAt(i+4)=='র')
                            segmentCode += "213648 213648\n";
                        else if(document.charAt(i)=='গ' && document.charAt(i+2)=='ন' && document.charAt(i+4)=='য')
                            segmentCode += "234047 234047\n";
                    }
                    //Two Combined Characters
                    else
                    {
                        if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'য') 
                            segmentCode += "4047 4047\n";
                        else if(document.charAt(i) == 'ব' && document.charAt(i+2) == 'য') 
                            segmentCode += "4447 4447\n";
                        else if(document.charAt(i) == 'ক' && document.charAt(i+2) == 'ব') 
                            segmentCode += "2144 2144\n";
                        else if(document.charAt(i) == 'ক' && document.charAt(i+2) == 'ট') 
                            segmentCode += "2131 2131\n";
                        else if(document.charAt(i) == 'ক' && document.charAt(i+2) == 'ক') 
                            segmentCode += "2121\n";
                        else if(document.charAt(i) == 'ক' && document.charAt(i+2) == 'স') 
                            segmentCode += "2156\n";
                        else if(document.charAt(i) == 'ক' && document.charAt(i+2) == 'ত') 
                            segmentCode += "2136\n";
                        else if(document.charAt(i) == 'ক' && document.charAt(i+2) == 'র') 
                            segmentCode += "2148\n";
                        else if(document.charAt(i) == 'গ' && document.charAt(i+2) == 'ধ') 
                            segmentCode += "2148\n";
                        else if(document.charAt(i) == 'ক' && document.charAt(i+2) == 'ল') 
                            segmentCode += "2150\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'ত') 
                            segmentCode += "4036\n";
                        else if(document.charAt(i) == 'গ' && document.charAt(i+2) == 'ন') 
                            segmentCode += "2340\n";
                        else if(document.charAt(i) == 'গ' && document.charAt(i+2) == 'ণ') 
                            segmentCode += "2335\n";
                        else if(document.charAt(i) == 'খ' && document.charAt(i+2) == 'র') 
                            segmentCode += "2248\n";
                        else if(document.charAt(i) == 'ষ' && document.charAt(i+2) == 'ট') 
                            segmentCode += "5531 5531\n";
                        else if(document.charAt(i) == 'গ' && document.charAt(i+2) == 'ব') 
                            segmentCode += "2344\n";
                    }
                    
                }
                //Single Characters
                else
                {
                    switch (document.charAt(i)) {
                        case 'ঐ':
                            segmentCode += "16 16\n";
                            break;
                        case 'ি':
                            segmentCode += "63 63\n";
                            break;
                        case 'ম':
                            segmentCode += "46\n";
                            break;
                        case 'ঞ':
                            segmentCode += "30\n";
                            break;
                        case 'া':
                            segmentCode += "62\n";
                            break;
                        case 'অ':
                            segmentCode += "5\n";
                            break;
                        case 'ঘ':
                            segmentCode += "24\n";
                            break;
                        case 'ট':
                            segmentCode += "31 31\n";
                            break;
                        case 'ন':
                            segmentCode += "40\n";
                            break;
                        case 'ে':
                            segmentCode += "71\n";
                            break;
                        case 'দ':
                            segmentCode += "38\n";
                            break;
                        case 'খ':
                            segmentCode += "22 22 - Amb\n";
                            break;
                        case ';':
                            segmentCode += "a59 a59\n";
                            break;
                        case 'ঊ':
                            segmentCode += "10 10\n";
                            break;
                        case 'ষ':
                            segmentCode += "55\n";
                            break;
                        case 'ব':
                            segmentCode += "44\n";
                            break;
                        case 'ল':
                            segmentCode += "50\n";
                            break;
                        case 'ঔ':
                            segmentCode += "20 20\n";
                            break;
                        case 'প':
                            segmentCode += "42 42\n";
                            break;
                        case 'স':
                            segmentCode += "56\n";
                            break;
                        case 'ক':
                            segmentCode += "21\n";
                            break;
                        case 'ও':
                            segmentCode += "19\n";
                            break;
                        case 'ত':
                            segmentCode += "36\n";
                            break;
                        case 'র':
                            segmentCode += "48 48\n";
                            break;
                        case 'ু':
                            segmentCode += "65\n";
                            break;
                        case 'ঃ':
                            segmentCode += "3 3\n";
                            break;
                        case 'ঋ':
                            segmentCode += "11\n";
                            break;
                        case 'ণ':
                            segmentCode += "35\n";
                            break;
                        case 'ী':
                            segmentCode += "64 64\n";
                            break;
                        case 'ভ':
                            segmentCode += "45\n";
                            break;
                        case 'ই':
                            segmentCode += "7 7\n";
                            break;
                        case 'ঢ':
                            segmentCode += "34\n";
                            break;
                        case 'শ':
                            segmentCode += "54\n";
                            break;
                        case 'হ':
                            segmentCode += "57\n";
                            break;
                        case 'উ':
                            segmentCode += "9 9\n";
                            break;
                        case 'চ':
                            segmentCode += "26\n";
                            break;
                        case 'ঁ':
                            segmentCode += "1\n";
                            break;
                        case 'য':
                            segmentCode += "47\n";
                            break;
                        case 'ড':
                            segmentCode += "33\n";
                            break;
                        case 'গ':
                            segmentCode += "23\n";
                            break;
                        case 'ফ':
                            segmentCode += "43\n";
                            break;
                        case 'ড়':
                            segmentCode += "92 92\n";
                            break;
                        case 'ং':
                            segmentCode += "2 2\n";
                            break;
                        case ',':
                            segmentCode += "a44 a44\n";
                            break;
                        case 'ঈ':
                            segmentCode += "8 8\n";
                            break;
                        case 'এ':
                            segmentCode += "15\n";
                            break;
                        case 'ঙ':
                            segmentCode += "25\n";
                            break;
                        case 'আ':
                            segmentCode += "6 6\n";
                            break;
                        case 'ছ':
                            segmentCode += "27\n";
                            break;
                        case 'ঢ়':
                            segmentCode += "93 93\n";
                            break;
                        case 'ঠ':
                            segmentCode += "32 32\n";
                            break;
                        case 'ধ':
                            segmentCode += "39\n";
                            break;
                        case 'ঝ':
                            segmentCode += "29\n";
                            break;
                        case 'থ':
                            segmentCode += "37\n";
                            break;
                        case '।'://দাড়ি
                            segmentCode += "329192\n";
                            break;
                        case 'ূ':
                            segmentCode += "66\n";
                            break;
                        case 'য়':
                            segmentCode += "95 95\n";
                            break;
                        case 'জ':
                            segmentCode += "28 28\n";
                            break;
                        default:
                            break;
                    }
                    
                }
            }
            
        }
        catch(Exception e){}
        System.out.println(segmentCode);
        try{
            BufferedWriter outputWriter = null;
            outputWriter = new BufferedWriter(new FileWriter("SegmentCodes.txt"));
            outputWriter.write(segmentCode);
            outputWriter.flush();
            outputWriter.close();
        }
        catch(Exception e){}
    }
}