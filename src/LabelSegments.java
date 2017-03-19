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
                        else if(document.charAt(i)=='ঙ' && document.charAt(i+2)=='ঘ' && document.charAt(i+4)=='র')
                            segmentCode += "252448\n";
                        else if(document.charAt(i)=='ঙ' && document.charAt(i+2)=='ক' && document.charAt(i+4)=='য')
                            segmentCode += "252147 252147\n";
                        else if(document.charAt(i)=='ঙ' && document.charAt(i+2)=='গ' && document.charAt(i+4)=='য')
                            segmentCode += "252347 252347\n";
                        else if(document.charAt(i)=='চ' && document.charAt(i+2)=='ছ' && document.charAt(i+4)=='র')
                            segmentCode += "262748 262748\n";
                        else if(document.charAt(i)=='জ' && document.charAt(i+2)=='জ' && document.charAt(i+4)=='ব')
                            segmentCode += "282844 282844\n";
                        else if(document.charAt(i)=='চ' && document.charAt(i+2)=='ছ' && document.charAt(i+4)=='ব')
                            segmentCode += "262744 262744\n";
                        else if(document.charAt(i)=='ন' && document.charAt(i+2)=='ড' && document.charAt(i+4)=='র')
                            segmentCode += "403348 403348\n";
                        else if(document.charAt(i)=='ত' && document.charAt(i+2)=='ত' && document.charAt(i+4)=='ব')
                            segmentCode += "363644 363644\n";
                        else if(document.charAt(i)=='দ' && document.charAt(i+2)=='দ' && document.charAt(i+4)=='ব')
                            segmentCode += "383844 383844\n";
                        else if(document.charAt(i)=='দ' && document.charAt(i+2)=='র' && document.charAt(i+4)=='য')
                            segmentCode += "384847 384847\n";
                        else if(document.charAt(i)=='ন' && document.charAt(i+2)=='দ' && document.charAt(i+4)=='ব')
                            segmentCode += "403844 403844\n";
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
                        else if(document.charAt(i) == 'গ' && document.charAt(i+2) == 'ম') 
                            segmentCode += "2346\n";
                        else if(document.charAt(i) == 'গ' && document.charAt(i+2) == 'র') 
                            segmentCode += "2348\n";
                        else if(document.charAt(i) == 'গ' && document.charAt(i+2) == 'য') 
                            segmentCode += "2347 2347\n";
                        else if(document.charAt(i) == 'গ' && document.charAt(i+2) == 'ল') 
                            segmentCode += "2350 2350\n";
                        else if(document.charAt(i) == 'ঘ' && document.charAt(i+2) == 'ন') 
                            segmentCode += "2440 2440\n";
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
                            segmentCode += "2844 2844 2844\n";
                        else if(document.charAt(i) == 'চ' && document.charAt(i+2) == 'চ') 
                            segmentCode += "2626 2626\n";
                        else if(document.charAt(i) == 'চ' && document.charAt(i+2) == 'য') 
                            segmentCode += "2647 2647\n";
                        else if(document.charAt(i) == 'প' && document.charAt(i+2) == 'র') 
                            segmentCode += "4248\n";
                        else if(document.charAt(i) == 'ঞ' && document.charAt(i+2) == 'চ') 
                            segmentCode += "3026\n";
                        else if(document.charAt(i) == 'ঞ' && document.charAt(i+2) == 'ছ') 
                            segmentCode += "3027 3027\n";
                        else if(document.charAt(i) == 'ঞ' && document.charAt(i+2) == 'জ') 
                            segmentCode += "3028\n";
                        else if(document.charAt(i) == 'ঞ' && document.charAt(i+2) == 'ঝ') 
                            segmentCode += "3029\n";
                        else if(document.charAt(i) == 'হ' && document.charAt(i+2) == 'য') 
                            segmentCode += "5747\n";
                        else if(document.charAt(i) == 'জ' && document.charAt(i+2) == 'র') 
                            segmentCode += "2848 2848\n";
                        else if(document.charAt(i) == 'জ' && document.charAt(i+2) == 'ঞ') 
                            segmentCode += "2830\n";
                        else if(document.charAt(i) == 'জ' && document.charAt(i+2) == 'ঝ') 
                            segmentCode += "2829 2829\n";
                        else if(document.charAt(i) == 'ট' && document.charAt(i+2) == 'ব') 
                            segmentCode += "3144 3144\n";
                        else if(document.charAt(i) == 'ট' && document.charAt(i+2) == 'ম') 
                            segmentCode += "3146 3146 3146\n";
                        else if(document.charAt(i) == 'ট' && document.charAt(i+2) == 'ট') 
                            segmentCode += "3131 3131\n";
                        else if(document.charAt(i) == 'ট' && document.charAt(i+2) == 'র') 
                            segmentCode += "3148 3148 3148\n";
                        else if(document.charAt(i) == 'ড' && document.charAt(i+2) == 'ড') 
                            segmentCode += "3333\n";
//                        else if(document.charAt(i) == 'ড়' && document.charAt(i+2) == 'গ') 
//                           segmentCode += "9223 9223 9223\n";
//                        else if(document.charAt(i) == 'ড' && document.charAt(i+2) == 'র') 
//                            segmentCode += "3348 3348\n";
                        else if(document.charAt(i) == 'ড' && document.charAt(i+2) == 'র') 
                            segmentCode += "3448 3448\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'ট') 
                            segmentCode += "4031 4031\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'ট') 
                            segmentCode += "4031 4031\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'ড') 
                            segmentCode += "4033\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'ট') 
                            segmentCode += "4031 4031\n";
                        else if(document.charAt(i) == 'ণ' && document.charAt(i+2) == 'ম') 
                            segmentCode += "3546 3546\n";
                        else if(document.charAt(i) == 'ন' && document.charAt(i+2) == 'ঠ') 
                            segmentCode += "4032 4032\n";
                        else if(document.charAt(i) == 'স' && document.charAt(i+2) == 'ব') 
                            segmentCode += "5644 5644\n";
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
                            segmentCode += "4828 4828 4828\n";
                        else if(document.charAt(i) == 'ত' && document.charAt(i+2) == 'থ') 
                            segmentCode += "3637\n";
                        else if(document.charAt(i) == 'ত' && document.charAt(i+2) == 'ম') 
                            segmentCode += "3646\n";
                        else if(document.charAt(i) == 'ত' && document.charAt(i+2) == 'ন') 
                            segmentCode += "3640 3640\n";
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
                            segmentCode += "3946 3946\n";
                        else if(document.charAt(i) == 'ধ' && document.charAt(i+2) == 'ব') 
                            segmentCode += "3944 3944\n";
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
                            segmentCode += "4428 4428\n";
                        else if(document.charAt(i) == 'ম' && document.charAt(i+2) == 'ভ') 
                            segmentCode += "4645\n";
                        else if(document.charAt(i) == 'ম' && document.charAt(i+2) == 'র') 
                            segmentCode += "4648\n";
                        else if(document.charAt(i) == 'ব' && document.charAt(i+2) == 'ল') 
                            segmentCode += "4450 4450\n";
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
                            segmentCode += "5637 5637\n";
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