package introductionToJava.assignments;
import java.util.Scanner;
import java.util.Arrays;
public class SortCharInStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		System.out.println("The sorted String is : " + sortCharInStr(str));
	}
	private static String sortCharInStr(String s)
	{
		char[] charArr = s.toCharArray();
		Arrays.sort(charArr);
		String sortedString = new String(charArr);
		return sortedString;
	}

}
