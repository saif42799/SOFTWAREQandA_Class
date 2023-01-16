package ClassActivity;

/*
Date 10/4/2022
Author Saif Shaikh
Input - none
exspected output - none
Description
    Test 3rd party libraries including apache Commons Lang and Apache Commons IO
 */
import org.apache.commons.lang3.StringUtils;
public class Main {
    public static void main(String[] args) {
        /*
        Description - test isBank()
         */

        if(StringUtils.isBlank(null)){
            System.out.println("It is null");
        }else {
            System.out.println("null is not blank");
        }

        if (StringUtils.isBlank("  ")){
            System.out.println("It is null");
        }else {
            System.out.println("null is not blank");
        }



    }

}
