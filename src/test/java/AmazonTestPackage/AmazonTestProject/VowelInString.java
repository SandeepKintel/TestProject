package AmazonTestPackage.AmazonTestProject;

public class VowelInString {
	public static void main(String[] args) {
		String input= "sandeepkiomar";
		String output="";
		
		for(int i=0; i<input.length(); i++)
		{
			char ch= input.charAt(i);
			if(ch=='a' || ch=='i' || ch=='o' || ch=='e' || ch=='u')
			{
				output = output + ch;
			}
		}
		System.out.println(output);
	}

}
