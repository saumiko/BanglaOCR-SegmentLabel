/**
 * This is the Main Class.
 * @author saumiko
 */
public class Main {
    public static void main(String args[])
    {
//        ConfigureInputFile.initiate();
        TwoSegments.labelCharacters();
        Reconstruct.reconstruct();
        ConfigureReconstructedDocument.SwapCharacters();
    }
}
