import java.io.*;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 * This Class will Label the segments in the segment.txt file.
 * @author saumiko
 */
public class LabelSegments {
    public static void label()
    {
        try{
            FileInputStream segmentStream = new FileInputStream("segmentTest.txt");
            BufferedReader segmentReader = new BufferedReader(new InputStreamReader(segmentStream));
            
            BufferedWriter outputWriter = null;
            outputWriter = new BufferedWriter(new FileWriter("LabeledSegment.txt"));
            
            String segment = null;
            
            char[] segmentChars;
            
            int segmentCounter = 0;
            while((segment = segmentReader.readLine()) != null)
            {
                segmentChars = segment.toCharArray();
                if(segmentChars[segment.length()-1]==':')
                {
                    outputWriter.write("segment: "+segmentCounter);
                    System.out.println("segment: "+segmentCounter);
                    segmentCounter++;
                    while(segment.length()!=0)
                    {
                        outputWriter.write(segment);
                        System.out.println(segment);
                        segment = segmentReader.readLine();
                    }
                    System.out.println("segment: Shesh");
                    outputWriter.write("segment: Shesh");
                }
            }
            outputWriter.flush();
            outputWriter.close();
        }
        catch(Exception e){}
    }
}