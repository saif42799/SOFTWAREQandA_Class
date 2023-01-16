package Final_coding;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.*;

public class countingLiines {

    @Test
    public void fiveLines() {
        File fileName = FileUtils.getFile("http://textfile.com/abc.txt");
        int lines = 0;
        int count1 = 0;
        int count2 = 0;
        byte[] bytes = null;
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(fileName))) {
             bytes = FileUtils.readFileToByteArray(fileName);
            boolean endsWithoutNewLine = false;
            while ((count2 = inputStream.read(bytes)) != -1) {
                for (int i = 0; i < count2; ++i) {
                    if (bytes[i] == '\n')
                        ++count1;
                }
                endsWithoutNewLine = (bytes[count2 - 1] != '\n');
            }
            if (endsWithoutNewLine) {
                ++count1;
            }
            lines = count1;
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (lines == 5) {
            System.out.println("Number of lines: " + 5);
        } else {
            System.out.println("There are not five lines 5 ");
        }
    }

}