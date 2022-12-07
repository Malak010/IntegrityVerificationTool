/**
 * 
 */
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.Scanner;

/**
 * @author LAP-3
 *Malak Abdullah
 */



public class Hash{
	
	
	//Defined a main method
	public static void main (String [] gh) throws NoSuchAlgorithmException {
		
		
		Scanner sc = new Scanner(System.in);//Ask User to Select one Action
		System.out.println("Select an Action:");
		System.out.println("-----------------");
		      int action = sc.nextInt();
		     
		      
		
		if (action == 1){
		System.out.println("Generate Hash");
		}
		
		else if (action == 2){
		System.out.println("Compare Hash");
		
		}
		else{
		System.out.println("Re-compute");
		}
		
		  
		System.out.println("-----------------");
	      System.out.println("Enter message: ");
	       
	      String input = new Scanner(System.in).nextLine();
	      
	      
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(input.getBytes());

        byte[] digest = md.digest();
        StringBuffer sb = new StringBuffer();
        for (byte b : digest){
            sb.append(String.format("%02x", b & 0xff));
        }

        System.out.println("SHA256 Hash: " + sb.toString());
	
	}
}