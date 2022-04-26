package JavaCodingInterviewPackage;

// This program is Polindrome
public class FindPolindrome 
{
  public static void findPolindrome(String str)
  {
	  
	  StringBuffer buffer = new StringBuffer(str);
	  buffer.reverse();
	  String s = buffer.toString();
	  System.out.println(s);
	  if (str.equals(s))
	  {
		  System.out.println("String is polindrome");
		  System.out.println("String is polindrome good");
	  }
	  else
	  {
		  System.out.println("String is not polindrome");
	  }
  }
	public static void main(String[] args) {
		findPolindrome("kayak");
	}

}
