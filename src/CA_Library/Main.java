package CA_Library;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.CharEncoding;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**Class: Main.java
 * @author Saif Shaikh
 * @version 1.0
 * Course : ITEC 4260
 * Fall 2022
 * Written: November 10, 2022
 * Description:
 * Refer to the Testing with Routines n Libraries (p.11 - p.16)
 *
 *     Use attached input.txt to practice FileUtils.
 *     For p.16, you need to create -> write 10 lines of 30 letters  by using RandomString Utils -> read the file and print out.
 *     Submit main.java and output file.
 *     Main.java is supposed to have the following functions
 *
 *           testIsBlank();
 *         testIgnoreCase();;
 *         testArrayUtils();
 *         testRandomStringUtils();
 *         testValidateInput();
 *         testCommonIo();
 *         testFileUtils();
 *
 */

public class Main {
    public static void main(String[] args) {


        File file = FileUtils.getFile("C:\\Users\\Saif4\\Downloads\\SOFTWAREQandA\\src\\CA_Library\\input(1).txt");

        try {
            List<String> lines = FileUtils.readLines(file, CharEncoding.UTF_8);
//            System.out.println(lines);

        }catch (IOException e){
            e.printStackTrace();
        }


        System.out.println("_______testIsBlank______");
        //testIsBlank
        if (testIsBlank(file)){
            System.out.println("File exists");
        }else {
            throw new IllegalArgumentException();

        }

        System.out.println("\n");
        System.out.println("_______testIgnoreCase______");
        //testIgnoreCase
        try {
            testIgnoreCase(file);

        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("\n");
        System.out.println("_______testArrayUtils______");
        //testArrayUtils
        try {

            testArrayUtils();

        }catch (Exception e){
            e.printStackTrace();

        }


        System.out.println("\n");
        System.out.println("_______testRandomStringUtils______");
        //testRandomStringUtils
        testRandomStringUtils();


        System.out.println("\n");
        System.out.println("_______testValidateInput______");
//        testValidateInput();
        testValidateInput(file);


        System.out.println("\n");
        System.out.println("_______testCommonIo______");
//        testCommonIo();
        try {

            testCommonIo();

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("\n");
        System.out.println("_______testFileUtils______");
//        testFileUtils();
        try {

            testFileUtils(file);

        }catch (Exception e){
            e.printStackTrace();
        }


    }


//        testIsBlank();
//        testIgnoreCase();
//        testArrayUtils();
//        testRandomStringUtils();
//        testValidateInput();
//        testCommonIo();
//        testFileUtils();
//        Main.java is supposed to have the following functions


    public static boolean testIsBlank(File fileName) {

        if(fileName == null){
            return false;
        }
        else{
            return true;
        }

    }

    public static void testIgnoreCase(File fileName) throws IOException {

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


    public static void testArrayUtils() {

        String[] array = {"1", "2", "3"};
        System.out.println(array.toString());
        System.out.println(ArrayUtils.toString(array));


    }

    public static void testRandomStringUtils() {

        ArrayList<String> randomArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            randomArrayList.add(RandomStringUtils.randomAlphanumeric(30));
            System.out.println(randomArrayList.get(i));

        }

    }

    public static File testValidateInput(File file) {

        if (file == null){
            throw new NullPointerException();
        }else {
            System.out.println("File is valid");
        }

        return file;
    }

    public static void testCommonIo() throws IOException {

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

    public static File testFileUtils(File file) {

        try {
            List<String> lines = FileUtils.readLines(file, CharEncoding.UTF_8);
            System.out.println(lines);

        }catch (IOException e){
            e.printStackTrace();
        }

        return file;
    }

}
