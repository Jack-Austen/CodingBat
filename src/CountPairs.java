
public class CountPairs {
	public int countPairs(String str) {
		 if(str.length()>=3) {
			 if (str.charAt(0)==str.charAt(2)){
				return 1+countPairs (str.substring(1,str.length()));
			 }
			 else {
				 return countPairs (str.substring(1,str.length()));
			 }
		 }
		 else {
			 return 0;
		 }
	}		
	public static void main (String [] args) {
		
	}
}
