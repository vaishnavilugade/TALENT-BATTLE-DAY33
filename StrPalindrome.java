import java.util.*;
class StrPalindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String v , rev = "";
		System.out.println("Enter:");
		v=sc.nextLine();
    
		int length = v.length();

		for (int i = (length - 1); i >=0; i--) {
			rev = rev + v.charAt(i);
		}

		if (v.toUpperCase().equals(rev.toUpperCase())) {
			System.out.println(v + " is a Palindrome String.");
		}
		else {
			System.out.println(v + " is not a Palindrome String.");
		}
  }
}
