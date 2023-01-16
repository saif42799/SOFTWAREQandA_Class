package Assignment_12;

/**Class: Main.java
 * @author Saif Shaikh
 * @version 1.0
 * Course : ITEC 4260
 * Spring 2021
 * Written: November 10, 2022
 * Description:
 * Given:
 * 	Person interface
 * 	DiskManager interface
 * 	CacheManager interface
 * 	How it works:
 * When asked for person by phone number (this is the getFullName method of the SUT), the system shall
 * 1.	If the person is not in either storage mechanism a null will be returned
 * 2.	If the person exists in some storage mechanism an instance of the person will be returned
 * a.	If the person exists in the cache, it will be returned from cache without searching disk
 * b.	Only if the person does not exist in the cache then search the disk
 * Implement:
 * 	PersonTest class
 *
 * Details:
 * 1.	Implement the PersonTest to ensure the given requirement is met according to the details above with the following test
 * a)	Create a test that checks that a Person not in the Disk nor the Cache actually does return null from both Disk and Cache. Use verify() method to confirm that the right call were made.
 * b)	Create a test that checks that a Person in the Cache actually does return the from the Cache. Confirm this by name as well. Use verify() method to confirm that the getPerson() call were made.
 * c)	Create a test that checks when a Person is not in the Cache but is in the Disk. Use verify() to make sure that the Person class did try looking up from cache.
 */

public class Main {
    public static void main(String[] args) {


    }
}
