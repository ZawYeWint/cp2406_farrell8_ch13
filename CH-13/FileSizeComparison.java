import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileSizeComparison
{
    public static void main(String[] args)
    {
        Path textFile =
                Paths.get("C:\\Users\\patri\\Desktop\\James Cook University\\Lessons\\SP53 2022\\CP2406 - Programming III\\CP2406-Practical Submission-Zaw Ye Wint\\cp2406_farrell8_ch13\\CH-13\\lyric.txt");
        Path wordFile =
                Paths.get("C:\\Users\\patri\\Desktop\\James Cook University\\Lessons\\SP53 2022\\CP2406 - Programming III\\CP2406-Practical Submission-Zaw Ye Wint\\cp2406_farrell8_ch13\\CH-13\\lyric.docx");
        try
        {
            BasicFileAttributes attrText =
                    Files.readAttributes(textFile, BasicFileAttributes.class);
            BasicFileAttributes attrWord =
                    Files.readAttributes(wordFile, BasicFileAttributes.class);
            long textSize = attrText.size();
            long wordSize = attrWord.size();
            double ratio = textSize * 100.0 / wordSize;
            System.out.println(textFile.toString() + " is " +
                    textSize + " bytes long");
            System.out.println(wordFile.toString() + " is " +
                    wordSize + " bytes long");
            System.out.println("The text file is " +
                    ratio + "% of the size of the Word file");
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }
    }
}
