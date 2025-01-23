package AmazonTestPackage.AmazonTestProject;

public class StringProg {
	public static void main(String[] args) {
		
		String input = "S a n d e e p";
		String output = "";
		
		for (int i=input.length()-1; i>=0; i--)
		{
			char ch= input.charAt(i);
			output = output+ch;
			
		}
		System.out.println(output);
	}

}
