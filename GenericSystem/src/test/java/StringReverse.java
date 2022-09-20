
public class StringReverse {

	public static void main(String[] args) {
		
		String message = "SIDD";
		String reverse ="";
		Character ch;
		
		
		
		for(int i=0  ; i<message.length(); i++) {
			
			ch=message.charAt(i);
			reverse=ch+reverse;
		}
		
		
		System.out.println(reverse);
		
		
		if(reverse.equalsIgnoreCase(message)) {
			System.out.print("Reverse string is same");
		}
		else
			System.out.print("Reverse string is NOT same");
			
		
		
	}

}
