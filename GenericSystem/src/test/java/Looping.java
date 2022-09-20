
public class Looping {

	public static void main(String[] args) {
		
		
		String str1 =  "00111aaaaabbccc0000" ;
		
		char[] a = str1.toCharArray();
		int count=1;
		int global = 0;
		
		int length = a.length;
		
		
		for(int i=0 ; i < length -1  ; i++) {
		
			if(a[i]==a[i+1])
			{
				count++;
			}else {
				global = global + count;
			}
		}
		
		System.out.print(count);
		
		System.out.print(global);
		
		
	}}
