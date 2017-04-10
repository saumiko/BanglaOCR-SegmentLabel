import java.io.*;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 * This Class will Label the segments in the segment.txt file.
 * @author saumiko
 */
public class TwoSegments {
    public static void labelCharacters()
    {
        Reconstruct recon = new Reconstruct();
        String document = null;
         String banglaCharCode = null;
        String segmentCode = "";    
         String firstCombCharCode=null;
         String secCombCharCode = null;
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
                            segmentCode += "215546\n";
                        else if(document.charAt(i)=='ক' && document.charAt(i+2)=='ষ' && document.charAt(i+4)=='ণ')
                            segmentCode += "215535\n";
                        else if(document.charAt(i)=='ক' && document.charAt(i+2)=='ত' && document.charAt(i+4)=='র')
                            segmentCode += "213648\n";
                        else if(document.charAt(i)=='গ' && document.charAt(i+2)=='ন' && document.charAt(i+4)=='য')
                            segmentCode += "234047 234047\n";
                        else if(document.charAt(i)=='ঙ' && document.charAt(i+2)=='ঘ' && document.charAt(i+4)=='র')
                            segmentCode += "252448\n";
                        else if(document.charAt(i)=='ঙ' && document.charAt(i+2)=='ক' && document.charAt(i+4)=='য')
                            segmentCode += "252147 252147\n";
                        else if(document.charAt(i)=='ঙ' && document.charAt(i+2)=='গ' && document.charAt(i+4)=='য')
                            segmentCode += "252347 252347\n";
                        else if(document.charAt(i)=='চ' && document.charAt(i+2)=='ছ' && document.charAt(i+4)=='র')
                            segmentCode += "262748\n";
                        else if(document.charAt(i)=='জ' && document.charAt(i+2)=='জ' && document.charAt(i+4)=='ব')
                            segmentCode += "282844\n";
                        else if(document.charAt(i)=='চ' && document.charAt(i+2)=='ছ' && document.charAt(i+4)=='ব')
                            segmentCode += "262744\n";
                        else if(document.charAt(i)=='ন' && document.charAt(i+2)=='ড' && document.charAt(i+4)=='র')
                            segmentCode += "403348\n";
                        else if(document.charAt(i)=='ত' && document.charAt(i+2)=='ত' && document.charAt(i+4)=='ব')
                            segmentCode += "363644\n";
                        else if(document.charAt(i)=='দ' && document.charAt(i+2)=='দ' && document.charAt(i+4)=='ব')
                            segmentCode += "383844\n";
                        else if(document.charAt(i)=='দ' && document.charAt(i+2)=='র' && document.charAt(i+4)=='য')
                            segmentCode += "384847 384847\n";
                        else if(document.charAt(i)=='ন' && document.charAt(i+2)=='দ' && document.charAt(i+4)=='ব')
                            segmentCode += "403844\n";
                        else if(document.charAt(i)=='ন' && document.charAt(i+2)=='দ' && document.charAt(i+4)=='র')
                            segmentCode += "403848\n";
                        else if(document.charAt(i)=='ন' && document.charAt(i+2)=='ত' && document.charAt(i+4)=='য')
                            segmentCode += "403647 403647\n";
                        else if(document.charAt(i)=='ন' && document.charAt(i+2)=='ত' && document.charAt(i+4)=='র')
                            segmentCode += "403648\n";
                        else if(document.charAt(i)=='ন' && document.charAt(i+2)=='ধ' && document.charAt(i+4)=='র')
                            segmentCode += "403948\n";
                        else if(document.charAt(i)=='ম' && document.charAt(i+2)=='প' && document.charAt(i+4)=='র')
                            segmentCode += "464248\n";
                        else if(document.charAt(i)=='ম' && document.charAt(i+2)=='ভ' && document.charAt(i+4)=='র')
                            segmentCode += "464548\n";
                        else if(document.charAt(i)=='ষ' && document.charAt(i+2)=='ক' && document.charAt(i+4)=='র')
                            segmentCode += "552148\n";
                        else if(document.charAt(i)=='ষ' && document.charAt(i+2)=='ট' && document.charAt(i+4)=='র')
                            segmentCode += "553148 553148\n";
                        else if(document.charAt(i)=='স' && document.charAt(i+2)=='ক' && document.charAt(i+4)=='র')
                            segmentCode += "562148\n";
                        else if(document.charAt(i)=='ষ' && document.charAt(i+2)=='প' && document.charAt(i+4)=='র')
                            segmentCode += "554248\n";
                        else if(document.charAt(i)=='স' && document.charAt(i+2)=='ত' && document.charAt(i+4)=='র')
                            segmentCode += "563648\n";
                        else if(document.charAt(i)=='স' && document.charAt(i+2)=='ট' && document.charAt(i+4)=='র')
                            segmentCode += "563148 563148\n";
 
                    }
                    //Two Combined Characters
                    else
                    {
                        if(document.charAt(i) == 'স' && document.charAt(i+2) == 'ক') {
                            System.out.println("ui");
                              segmentCode += "5621\n";
                        }
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'য') 
                            segmentCode += "4047 4047\n";
                        else if(document.charAt(i) == 'ব' && document.charAt(i+2) == 'য') 
                            segmentCode += "4447 4447\n";
                        else if(document.charAt(i) == 'ক' && document.charAt(i+2) == 'ব') 
                            segmentCode += "2144\n";
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
                            segmentCode += "2335 2335\n";
                        else if(document.charAt(i) == 'খ' && document.charAt(i+2) == 'র') 
                            segmentCode += "2248\n";
                        else if(document.charAt(i) == 'ষ' && document.charAt(i+2) == 'ট') 
                            segmentCode += "5531\n";
                        else if(document.charAt(i) == 'গ' && document.charAt(i+2) == 'ব') 
                            segmentCode += "2344\n";
                        else if(document.charAt(i) == 'গ' && document.charAt(i+2) == 'ম') 
                            segmentCode += "2346\n";
                        else if(document.charAt(i) == 'গ' && document.charAt(i+2) == 'র') 
                            segmentCode += "2348\n";
                        else if(document.charAt(i) == 'গ' && document.charAt(i+2) == 'য') 
                            segmentCode += "2347 2347\n";
                        else if(document.charAt(i) == 'গ' && document.charAt(i+2) == 'ল') 
                            segmentCode += "2350\n";
                        else if(document.charAt(i) == 'ঘ' && document.charAt(i+2) == 'ন') 
                            segmentCode += "2440\n";
                        else if(document.charAt(i) == 'ঙ' && document.charAt(i+2) == 'খ') 
                            segmentCode += "2522\n";
                        else if(document.charAt(i) == 'ঙ' && document.charAt(i+2) == 'ম') 
                            segmentCode += "2546\n";
                        else if(document.charAt(i) == 'ঙ' && document.charAt(i+2) == 'ঘ') 
                            segmentCode += "2524\n";
                        else if(document.charAt(i) == 'জ' && document.charAt(i+2) == 'জ') 
                            segmentCode += "2828\n";
                        else if(document.charAt(i) == 'ঙ' && document.charAt(i+2) == 'গ') 
                            segmentCode += "2523\n";
                        else if(document.charAt(i) == 'চ' && document.charAt(i+2) == 'ঞ') 
                            segmentCode += "2630\n";
                        else if(document.charAt(i) == 'চ' && document.charAt(i+2) == 'ছ') 
                            segmentCode += "2627\n";
                        else if(document.charAt(i) == 'জ' && document.charAt(i+2) == 'ব') 
                            segmentCode += "2844\n";
                        else if(document.charAt(i) == 'চ' && document.charAt(i+2) == 'চ') 
                            segmentCode += "2626\n";
                        else if(document.charAt(i) == 'চ' && document.charAt(i+2) == 'য') 
                            segmentCode += "2647 2647\n";
                        else if(document.charAt(i) == 'প' && document.charAt(i+2) == 'র') 
                            segmentCode += "4248\n";
                        else if(document.charAt(i) == 'ঞ' && document.charAt(i+2) == 'চ') 
                            segmentCode += "3026\n";
                        else if(document.charAt(i) == 'ঞ' && document.charAt(i+2) == 'ছ') 
                            segmentCode += "3027\n";
                        else if(document.charAt(i) == 'ঞ' && document.charAt(i+2) == 'জ') 
                            segmentCode += "3028\n";
                        else if(document.charAt(i) == 'ঞ' && document.charAt(i+2) == 'ঝ') 
                            segmentCode += "3029\n";
                        else if(document.charAt(i) == 'হ' && document.charAt(i+2) == 'য') 
                            segmentCode += "5747\n";
                        else if(document.charAt(i) == 'জ' && document.charAt(i+2) == 'র') 
                            segmentCode += "2848\n";
                        else if(document.charAt(i) == 'জ' && document.charAt(i+2) == 'ঞ') 
                            segmentCode += "2830\n";
                        else if(document.charAt(i) == 'জ' && document.charAt(i+2) == 'ঝ') 
                            segmentCode += "2829\n";
                        else if(document.charAt(i) == 'ট' && document.charAt(i+2) == 'ব') 
                            segmentCode += "3144 3144\n";
                        else if(document.charAt(i) == 'ট' && document.charAt(i+2) == 'ম') 
                            segmentCode += "3146 3146 3146\n";
                        else if(document.charAt(i) == 'ট' && document.charAt(i+2) == 'ট') 
                            segmentCode += "3131 3131\n";
                        else if(document.charAt(i) == 'ট' && document.charAt(i+2) == 'র') 
                            segmentCode += "3148 3148\n";
                        else if(document.charAt(i) == 'ড' && document.charAt(i+2) == 'ড') 
                            segmentCode += "3333\n";
                       else if(document.charAt(i) == 'ড়' && document.charAt(i+2) == 'গ') 
                          segmentCode += "9223 9223 9223\n";
                       else if(document.charAt(i) == 'ড' && document.charAt(i+2) == 'র') 
                           segmentCode += "3348\n";
                        else if(document.charAt(i) == 'ড' && document.charAt(i+2) == 'র') 
                            segmentCode += "3448 3448\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'ট') 
                            segmentCode += "4031 4031\n";
                        else if(document.charAt(i) == 'ণ' && document.charAt(i+2) == 'ট') 
                            segmentCode += "3431 3431\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'ড') 
                            segmentCode += "4033\n";
                        else if(document.charAt(i) == 'ণ' && document.charAt(i+2) == 'ম') 
                            segmentCode += "3546\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'ঠ') 
                            segmentCode += "4032 4032\n";
                        else if(document.charAt(i) == 'ণ' && document.charAt(i+2) == 'ঠ') 
                            segmentCode += "3532 3532\n";
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'ব') 
                            segmentCode += "5644\n";
                        else if(document.charAt(i) == 'ণ' && document.charAt(i+2) == 'ঢ') 
                            segmentCode += "3534\n";
                        else if(document.charAt(i) == 'ণ' && document.charAt(i+2) == 'ব') 
                            segmentCode += "3544\n";
                        else if(document.charAt(i) == 'ণ' && document.charAt(i+2) == 'ণ') 
                            segmentCode += "3535\n";
                        else if(document.charAt(i) == 'দ' && document.charAt(i+2) == 'গ') 
                            segmentCode += "3823 3823\n";
                        else if(document.charAt(i) == 'ত' && document.charAt(i+2) == 'ত') 
                            segmentCode += "3636\n";
                        else if(document.charAt(i) == 'র' && document.charAt(i+2) == 'জ') 
                            segmentCode += "4828 4828\n";
                        else if(document.charAt(i) == 'ত' && document.charAt(i+2) == 'থ') 
                            segmentCode += "3637\n";
                        else if(document.charAt(i) == 'ত' && document.charAt(i+2) == 'ম') 
                            segmentCode += "3646\n";
                        else if(document.charAt(i) == 'ত' && document.charAt(i+2) == 'ন') 
                            segmentCode += "3640\n";
                        else if(document.charAt(i) == 'ত' && document.charAt(i+2) == 'ব') 
                            segmentCode += "3644\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'ব') 
                            segmentCode += "4044\n";
                        else if(document.charAt(i) == 'থ' && document.charAt(i+2) == 'ব') 
                            segmentCode += "3744\n";
                        else if(document.charAt(i) == 'ত' && document.charAt(i+2) == 'র') 
                            segmentCode += "3648\n";
                        else if(document.charAt(i) == 'দ' && document.charAt(i+2) == 'দ') 
                            segmentCode += "3838\n";
                        else if(document.charAt(i) == 'থ' && document.charAt(i+2) == 'র') 
                            segmentCode += "3748\n";
                        else if(document.charAt(i) == 'দ' && document.charAt(i+2) == 'ধ') 
                            segmentCode += "3839\n";
                        else if(document.charAt(i) == 'দ' && document.charAt(i+2) == 'ঘ') 
                            segmentCode += "3824\n";
                        else if(document.charAt(i) == 'দ' && document.charAt(i+2) == 'ম') 
                            segmentCode += "3846\n";
                        else if(document.charAt(i) == 'দ' && document.charAt(i+2) == 'ভ') 
                            segmentCode += "3845\n";
                        else if(document.charAt(i) == 'দ' && document.charAt(i+2) == 'ব') 
                            segmentCode += "3844\n";
                        else if(document.charAt(i) == 'র' && document.charAt(i+2) == 'থ') 
                            segmentCode += "4837 4837\n";
                        else if(document.charAt(i) == 'ধ' && document.charAt(i+2) == 'ন') 
                            segmentCode += "3940 3940\n";
                        else if(document.charAt(i) == 'ধ' && document.charAt(i+2) == 'ম') 
                            segmentCode += "3946\n";
                        else if(document.charAt(i) == 'ধ' && document.charAt(i+2) == 'ব') 
                            segmentCode += "3944\n";
                        else if(document.charAt(i) == 'ধ' && document.charAt(i+2) == 'র') 
                            segmentCode += "3948\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'ধ') 
                            segmentCode += "4039\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'দ') 
                            segmentCode += "4038\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'থ') 
                            segmentCode += "4037 4037\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'ম') 
                            segmentCode += "4046\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'ন') 
                            segmentCode += "4040\n";
                        else if(document.charAt(i) == 'প' && document.charAt(i+2) == 'ন') 
                            segmentCode += "4240\n";
                        else if(document.charAt(i) == 'ফ' && document.charAt(i+2) == 'র') 
                            segmentCode += "4348\n";
                        else if(document.charAt(i) == 'প' && document.charAt(i+2) == 'ল') 
                            segmentCode += "4250\n";
                        else if(document.charAt(i) == 'প' && document.charAt(i+2) == 'ট') 
                            segmentCode += "4231 4231\n";
                        else if(document.charAt(i) == 'প' && document.charAt(i+2) == 'ত') 
                            segmentCode += "4236\n";
                        else if(document.charAt(i) == 'প' && document.charAt(i+2) == 'র') 
                            segmentCode += "4248\n";
                        else if(document.charAt(i) == 'প' && document.charAt(i+2) == 'স') 
                            segmentCode += "4256\n";
                        else if(document.charAt(i) == 'ফ' && document.charAt(i+2) == 'ল') 
                            segmentCode += "4350\n";
                        else if(document.charAt(i) == 'ব' && document.charAt(i+2) == 'ধ') 
                            segmentCode += "4439\n";
                        else if(document.charAt(i) == 'ব' && document.charAt(i+2) == 'ব') 
                            segmentCode += "4444\n";
                        else if(document.charAt(i) == 'ব' && document.charAt(i+2) == 'দ') 
                            segmentCode += "4438\n";
                        else if(document.charAt(i) == 'ব' && document.charAt(i+2) == 'জ') 
                            segmentCode += "4428\n";
                        else if(document.charAt(i) == 'ম' && document.charAt(i+2) == 'ভ') 
                            segmentCode += "4645\n";
                        else if(document.charAt(i) == 'ম' && document.charAt(i+2) == 'র') 
                            segmentCode += "4648\n";
                        else if(document.charAt(i) == 'ব' && document.charAt(i+2) == 'ল') 
                            segmentCode += "4450\n";
                        else if(document.charAt(i) == 'ব' && document.charAt(i+2) == 'র') 
                            segmentCode += "4448\n";
                        else if(document.charAt(i) == 'ভ' && document.charAt(i+2) == 'র') 
                            segmentCode += "4548\n";
                        else if(document.charAt(i) == 'ম' && document.charAt(i+2) == 'ল') 
                            segmentCode += "4650\n";
                        else if(document.charAt(i) == 'ম' && document.charAt(i+2) == 'ব') 
                            segmentCode += "4644\n";
                        else if(document.charAt(i) == 'ম' && document.charAt(i+2) == 'ম') 
                            segmentCode += "4646\n";
                        else if(document.charAt(i) == 'ম' && document.charAt(i+2) == 'প') 
                            segmentCode += "4642\n";
                        else if(document.charAt(i) == 'ম' && document.charAt(i+2) == 'ন') 
                            segmentCode += "4640\n";
                        else if(document.charAt(i) == 'ম' && document.charAt(i+2) == 'ফ') 
                            segmentCode += "4643\n";
                        else if(document.charAt(i) == 'শ' && document.charAt(i+2) == 'চ') 
                            segmentCode += "5426\n";
                        else if(document.charAt(i) == 'ল' && document.charAt(i+2) == 'ড') 
                            segmentCode += "5033\n";
                        else if(document.charAt(i) == 'ত' && document.charAt(i+2) == 'য') 
                            segmentCode += "3647 3647\n";
                        else if(document.charAt(i) == 'শ' && document.charAt(i+2) == 'ব') 
                            segmentCode += "5444\n";
                        else if(document.charAt(i) == 'ল' && document.charAt(i+2) == 'ভ') 
                            segmentCode += "5045\n";
                        else if(document.charAt(i) == 'ল' && document.charAt(i+2) == 'ল') 
                            segmentCode += "5050\n";
                        else if(document.charAt(i) == 'ল' && document.charAt(i+2) == 'ম') 
                            segmentCode += "5046\n";
                        else if(document.charAt(i) == 'ল' && document.charAt(i+2) == 'ব') 
                            segmentCode += "5044\n";
                        else if(document.charAt(i) == 'ল' && document.charAt(i+2) == 'গ') 
                            segmentCode += "5023\n";
                        else if(document.charAt(i) == 'ল' && document.charAt(i+2) == 'ট') 
                            segmentCode += "5031 5031\n";
                        else if(document.charAt(i) == 'ল' && document.charAt(i+2) == 'প') 
                            segmentCode += "5042\n";
                        else if(document.charAt(i) == 'ল' && document.charAt(i+2) == 'ক') 
                            segmentCode += "5021\n";
                        else if(document.charAt(i) == 'ষ' && document.charAt(i+2) == 'ঠ') 
                            segmentCode += "5532 5532\n";
                        else if(document.charAt(i) == 'ষ' && document.charAt(i+2) == 'ট') 
                            segmentCode += "5531 5531\n";
                        else if(document.charAt(i) == 'শ' && document.charAt(i+2) == 'ল') 
                            segmentCode += "5450\n";
                        else if(document.charAt(i) == 'ষ' && document.charAt(i+2) == 'ণ') 
                            segmentCode += "5535\n";
                        else if(document.charAt(i) == 'র' && document.charAt(i+2) == 'ত') 
                            segmentCode += "4836 4836\n";
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'থ') 
                            segmentCode += "5637\n";
                        else if(document.charAt(i) == 'ষ' && document.charAt(i+2) == 'ক') 
                            segmentCode += "5521\n";
                        else if(document.charAt(i) == 'শ' && document.charAt(i+2) == 'ছ') 
                            segmentCode += "5427\n";
                        else if(document.charAt(i) == 'দ' && document.charAt(i+2) == 'র') 
                            segmentCode += "3848\n";
                        else if(document.charAt(i) == 'শ' && document.charAt(i+2) == 'ম') 
                            segmentCode += "5446\n";
                        else if(document.charAt(i) == 'শ' && document.charAt(i+2) == 'র') 
                            segmentCode += "5448\n";
                        else if(document.charAt(i) == 'ঢ' && document.charAt(i+2) == 'র') 
                            segmentCode += "3448\n";
                        else if(document.charAt(i) == 'ষ' && document.charAt(i+2) == 'ফ') 
                            segmentCode += "5543\n";
                        else if(document.charAt(i) == 'ষ' && document.charAt(i+2) == 'ম') 
                            segmentCode += "5546\n";
                        else if(document.charAt(i) == 'ধ' && document.charAt(i+2) == 'য') 
                            segmentCode += "3947 3947\n";
                        else if(document.charAt(i) == 'হ' && document.charAt(i+2) == 'ন') 
                            segmentCode += "5740\n";
                        else if(document.charAt(i) == 'হ' && document.charAt(i+2) == 'ণ') 
                            segmentCode += "5735\n";
                        else if(document.charAt(i) == 'ষ' && document.charAt(i+2) == 'প') 
                            segmentCode += "5542\n";
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'প') 
                            segmentCode += "5622\n";
                        else if(document.charAt(i) == 'র' && document.charAt(i+2) == 'শ') 
                            segmentCode += "4854\n";
                        else if(document.charAt(i) == 'ষ' && document.charAt(i+2) == 'ব') 
                            segmentCode += "5544\n";
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'ট') 
                            segmentCode += "5631\n";
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'ট') 
                            segmentCode += "5622\n";
                        else if(document.charAt(i) == 'হ' && document.charAt(i+2) == 'র') 
                            segmentCode += "5748\n";
                        else if(document.charAt(i) == 'হ' && document.charAt(i+2) == 'ল') 
                            segmentCode += "5750\n";
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'র') 
                            segmentCode += "5648\n";
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'ম') 
                            segmentCode += "5646\n";
                        else if(document.charAt(i) == 'হ' && document.charAt(i+2) == 'ম') 
                            segmentCode += "5746\n";
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'থ') 
                            segmentCode += "5637\n";
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'র') 
                            segmentCode += "5637\n";
                        else if(document.charAt(i) == 'র' && document.charAt(i+2) == 'ট') 
                            segmentCode += "4831\n";
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'ল') 
                            segmentCode += "5650\n";
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'ত') 
                            segmentCode += "5636\n";
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'ন') 
                            segmentCode += "5640\n";
                        
                          
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'ফ') 
                            segmentCode += "5643\n";
                        else if(document.charAt(i) == 'থ' && document.charAt(i+2) == 'র' && document.charAt(i+3) == 'ে') 
                            segmentCode += "374871\n";
                        else if(document.charAt(i) == 'ধ' && document.charAt(i+2) == 'র' && document.charAt(i-1) == 'ু') 
                            segmentCode += "394865\n";
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'র' && document.charAt(i+3) == 'ু') 
                            segmentCode += "564865\n";
                    }
                    
                }
                //Single Characters
                
               else
                {
                    if(document.charAt(i)== 'ি' && document.charAt(i+1)== 'ট')
                            segmentCode += "3163";
                       else if(document.charAt(i)== 'ঐ')
                            segmentCode += "16\n";
                            
                        else if(document.charAt(i)== 'ি')
                            segmentCode += "63 63\n";
                            
                        else if(document.charAt(i)== 'ম')
                            segmentCode += "46\n";
                            
                        else if(document.charAt(i)== 'ঞ')
                            segmentCode += "30\n";
                            
                        else if(document.charAt(i)== 'া')
                            segmentCode += "62\n";
                            
                        else if(document.charAt(i)== 'অ')
                            segmentCode += "5\n";
                            
                        else if(document.charAt(i)== 'ঘ')
                            segmentCode += "24\n";
                            
                        else if(document.charAt(i)== 'ট')
                            segmentCode += "31 31\n";
                            
                        else if(document.charAt(i)== 'ন')
                            segmentCode += "40\n";
                            
                        else if(document.charAt(i)== 'ে')
                            segmentCode += "71\n";
                            
                        else if(document.charAt(i)== 'দ')
                            segmentCode += "38\n";
                            
                        else if(document.charAt(i)== 'খ')
                            segmentCode += "22 22 - Amb\n";
                            
                        else if(document.charAt(i)== ';')
                            segmentCode += "a59 a59\n";
                            
                        else if(document.charAt(i)== 'ঊ')
                            segmentCode += "10 10\n";
                            
                        else if(document.charAt(i)== 'ষ')
                            segmentCode += "55\n";
                            
                        else if(document.charAt(i)== 'ব')
                            segmentCode += "44\n";
                            
                        else if(document.charAt(i)== 'ল')
                            segmentCode += "50\n";
                            
                        else if(document.charAt(i)== 'ঔ')
                            segmentCode += "20\n";
                            
                        else if(document.charAt(i)== 'প')
                            segmentCode += "42\n";
                            
                        else if(document.charAt(i)== 'স')
                            segmentCode += "56\n";
                            
                        else if(document.charAt(i)== 'ক')
                            segmentCode += "21\n";
                            
                        else if(document.charAt(i)== 'ও')
                            segmentCode += "19\n";
                            
                        else if(document.charAt(i)== 'ত')
                            segmentCode += "36\n";
                            
                        else if(document.charAt(i)== 'র')
                            segmentCode += "48 48\n";
                            
                            
                        else if(document.charAt(i)== 'ঃ')
                            segmentCode += "3 3\n";
                            
                        else if(document.charAt(i)== 'ঋ')
                            segmentCode += "11\n";
                            
                        else if(document.charAt(i)== 'ণ')
                            segmentCode += "35\n";
                            
                        else if(document.charAt(i)== 'ী')
                            segmentCode += "64 64\n";
                            
                        else if(document.charAt(i)== 'ভ')
                            segmentCode += "45\n";
                            
                        else if(document.charAt(i)== 'ই')
                            segmentCode += "7 7\n";
                            
                        else if(document.charAt(i)== 'ঢ')
                            segmentCode += "34\n";
                            
                        else if(document.charAt(i)== 'শ')
                            segmentCode += "54\n";
                            
                        else if(document.charAt(i)== 'হ')
                            segmentCode += "57\n";
                            
                        else if(document.charAt(i)== 'উ')
                            segmentCode += "9 9\n";
                            
                        else if(document.charAt(i)== 'চ')
                            segmentCode += "26\n";
                            
                        else if(document.charAt(i)== 'ঁ')
                            segmentCode += "1\n";
                            
                        else if(document.charAt(i)== 'য')
                            segmentCode += "47\n";
                            
                        else if(document.charAt(i)== 'ড')
                            segmentCode += "33\n";
                            
                        else if(document.charAt(i)== 'গ')
                            segmentCode += "23\n";
                            
                        else if(document.charAt(i)== 'ফ')
                            segmentCode += "43\n";
                            
                        else if(document.charAt(i)== 'ড়')
                            segmentCode += "92 92\n";
                            
                        else if(document.charAt(i)== 'ং')
                            segmentCode += "2 2\n";
                            
                        else if(document.charAt(i)== ',')
                            segmentCode += "a44 a44\n";
                            
                        else if(document.charAt(i)== 'ঈ')
                            segmentCode += "8 8\n";
                            
                        else if(document.charAt(i)== 'এ')
                            segmentCode += "15\n";
                            
                        else if(document.charAt(i)== 'ঙ')
                            segmentCode += "25\n";
                            
                        else if(document.charAt(i)== 'আ')
                            segmentCode += "6 6\n";
                            
                        else if(document.charAt(i)== 'ছ')
                            segmentCode += "27\n";
                            
                        else if(document.charAt(i)== 'ঢ়')
                            segmentCode += "93 93\n";
                            
                        else if(document.charAt(i)== 'ঠ')
                            segmentCode += "32 32\n";
                            
                        else if(document.charAt(i)== 'ধ')
                            segmentCode += "39\n";
                            
                        else if(document.charAt(i)== 'ঝ')
                            segmentCode += "29\n";
                            
                        else if(document.charAt(i)== 'থ')
                            segmentCode += "37\n";
                            
                        else if(document.charAt(i)== '।')//দাড়ি
                            segmentCode += "329192\n";
                          
                        else if(document.charAt(i)== 'য়')
                            segmentCode += "95 95\n";
                            
                        else if(document.charAt(i)== 'জ')
                            segmentCode += "28\n";
                         
                          else if(document.charAt(i)== 'ো'){
                         banglaCharCode =  Reconstruct.BanglaLetterSearch(Character.toString(document.charAt(i+1)));
                         segmentCode += "75\n" + banglaCharCode+"\n" +"75\n";
                         banglaCharCode = null;
                        }
                        
                        else if(document.charAt(i)== 'ৌ'){
                         banglaCharCode =  Reconstruct.BanglaLetterSearch(Character.toString(document.charAt(i+1)));
                         segmentCode += "76\n" + banglaCharCode+"\n" +"76\n";
                         banglaCharCode = null;
                        }
                        else if(document.charAt(i)== 'ু'){
                         banglaCharCode =  Reconstruct.BanglaLetterSearch(Character.toString(document.charAt(i+1)));
                         banglaCharCode = banglaCharCode + "65\n";
                         segmentCode += banglaCharCode;
                         banglaCharCode = null;
                        }
                           
                       else if(document.charAt(i)== 'ূ'){
                         banglaCharCode =  Reconstruct.BanglaLetterSearch(Character.toString(document.charAt(i+1)));
                         banglaCharCode = banglaCharCode + "66\n";
                         segmentCode += banglaCharCode;
                         banglaCharCode = null;
                        }
                      else if(document.charAt(i)== 'ৃ'){
                         banglaCharCode =  Reconstruct.BanglaLetterSearch(Character.toString(document.charAt(i+1)));
                         banglaCharCode = banglaCharCode + "67\n";
                         segmentCode += banglaCharCode;
                         banglaCharCode = null;
                        }
                    }
                }
            }
            
        
        catch(Exception e){}
        //System.out.println(segmentCode);
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