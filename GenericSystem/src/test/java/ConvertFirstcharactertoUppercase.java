
public class ConvertFirstcharactertoUppercase {

	public static void main(String[] args) {
		
		String message = "java is king";
		Boolean foundspace = true;
		char [] charArray = message.toCharArray();
		
		
		for(int i = 0 ; i <charArray.length;i++) {
			if(Character.isLetter(charArray[i])) {
				
				if(foundspace) {
					
					charArray[i] = Character.toUpperCase(charArray[i]);
					foundspace = false;
					
				}
				}
			
			else
				foundspace = true;
			
		}
		
		message = String.valueOf(charArray);
		
		System.out.print(message);
		
		
	}

}
