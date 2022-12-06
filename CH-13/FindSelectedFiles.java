import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FindSelectedFiles
{
    public static void main(String[] args)
    {
        Path f1 =
                Paths.get("C:\\Users\\patri\\Desktop\\James Cook University\\Lessons\\SP53 2022\\CP2406 - Programming III\\CP2406-Practical Submission-Zaw Ye Wint\\cp2406_farrell8_ch13\\CH-13\\CompareFolders.java");
        Path f2 =
                Paths.get("C:\\Users\\patri\\Desktop\\James Cook University\\Lessons\\SP53 2022\\CP2406 - Programming III\\CP2406-Practical Submission-Zaw Ye Wint\\cp2406_farrell8_ch13\\CH-13\\FileStatistics.class");
        int count = 0;
        try
        {
            if(Files.exists(f1))
            {
                System.out.println(f1.toString() + " exists");
                ++count;
            }
            if(Files.exists(f2))
            {
                System.out.println(f2.toString() + " exists");
                ++count;
            }
            System.out.println(count + " of the files exist");
        }
        catch(Exception e)
        {
            System.out.println("IO Exception");
        }
    }
}
