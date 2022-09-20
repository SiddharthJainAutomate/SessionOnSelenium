
public class OccurenceCharacterInString {

	public static void main(String[] args) {
		
		String message = "Java Javac Java";
		int count=0;
		
		char [] charArray=  message.toCharArray();
		
		for(int i =0; i<charArray.length;i++) {
			
			if(charArray[i] == 'J') {
				
				count++;
			}
		}
		
		System.out.println(count);
		
				
		
		

	}

}
