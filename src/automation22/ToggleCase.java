package automation22;

public class ToggleCase {

	public static void main(String[] args) {
		char c =0;
		String line ="Hello how are you";
		for(int i=0;i<line.length(); i++) {
			c=line.charAt(i);
			if(Character.isUpperCase(c)) {
				c=Character.toLowerCase(c);
			}
			
			else if(Character.isLowerCase(c)) {
				c=Character.toUpperCase(c);
			}
		}
		System.out.println("Converted Case "+line);

	}

}
