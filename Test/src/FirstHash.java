import java.util.Scanner;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * This class can be used to generate hashes of files and strings 
 *
 */
public class FirstHash 
{

	/**
	 * @param args:Contains the arguments from the command line 
	 * @throws NoSuchAlgorithmException 
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method 
		System.out.println("test");

		Scanner sc= new Scanner(System.in);
		Scanner SC= new Scanner(System.in);

		System.out.println("Select an Action:");
		System.out.println("______________________________________");
		System.out.println("\t1> Genarate HASH");
		System.out.println("\t2> Compare HASH");
		System.out.println("\t3> Re-compute");
		boolean valid=false;

		do {
			System.out.println("\tEnter Your Input:");
			int input=sc.nextInt();

			if(input==1)
			{
				System.out.println("\tEnter text:");
				String TS = SC.nextLine();

				System.out.println("\t--Genarating HASH--");
				System.out.println(toHexString(getSHA(TS)));

				valid=true;
				break;
			}
			else if(input==2)
			{
				valid=true;
				System.out.println("\t--Comparing HASH--");
				break;
			}
			else if(input==3) 
			{
				valid=true;
				System.out.println("\t--ReComputing HASH--");
				break;
			}
			else 
			{
				valid=false;
				System.out.println("\t--Invalid Input--");
				break;
			}

		}while(valid!=true);
	}


	public static byte[] getSHA(String input) throws NoSuchAlgorithmException
	{
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		return md.digest(input.getBytes(StandardCharsets.UTF_8));
	}

	public static String toHexString(byte[] hash)
	{
		BigInteger number = new BigInteger(1, hash);

		StringBuilder hexString = new StringBuilder(number.toString(16));
		while (hexString.length() < 64)
		{
			hexString.insert(0, '0');
		}

		return hexString.toString();
	}

	public void CompHash() {}
	public void ReComp() {}

}