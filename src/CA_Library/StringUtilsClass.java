package CA_Library;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.CharEncoding;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.mockito.Mockito;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class StringUtilsClass {


//        testIsBlank();
//        testIgnoreCase();
//        testArrayUtils();
//        testRandomStringUtils();
//        testValidateInput();
//        testCommonIo();
//        testFileUtils();


    public boolean testIsBlank(File fileName) {

        if(fileName == null){
            return false;
        }
        else{
            return true;
        }

    }

    public void testIgnoreCase(File fileName) throws IOException {

        List<String> lines = FileUtils.readLines(fileName, CharEncoding.UTF_8);

            if(StringUtils.startsWithIgnoreCase(lines.toString(), "abc")){
                System.out.println("Starts with abc");
            }
            if (StringUtils.endsWithIgnoreCase(lines.toString(), "abc")){
                System.out.println("ends with abc");
            }
            if (StringUtils.containsIgnoreCase(lines.toString(), "abc")){
                System.out.println("Contains with abc");
            }else {
                System.out.println("Doesn't contain abc");
            }

    }


    public void testArrayUtils() {

        String[] array = {"1", "2", "3"};
        System.out.println(array.toString());
        System.out.println(ArrayUtils.toString(array));


    }

    public void testRandomStringUtils() {

        ArrayList<String> randomArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            randomArrayList.add(RandomStringUtils.randomAlphanumeric(30));
            System.out.println(randomArrayList.get(i));

        }

    }

    public File testValidateInput(File file) {

        if (file == null){
            throw new NullPointerException();
        }else {
            System.out.println("File is valid");
        }

        return file;
    }

    public void testCommonIo() throws IOException {

        InputStream in = null;
        try {
            in = new URL("http://commons.apache.org").openStream();
            InputStreamReader inR = new InputStreamReader(in);
            BufferedReader buf = new BufferedReader(inR);
            String line;
            while ((line = buf.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            in.close();
        }

    }

    public File testFileUtils(File file) {

        try {
            List<String> lines = FileUtils.readLines(file, CharEncoding.UTF_8);
            System.out.println(lines);

        }catch (IOException e){
            e.printStackTrace();
        }

        return file;
    }


}
