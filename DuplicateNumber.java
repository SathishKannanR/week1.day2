package week2.day2;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		 int size= arr.length;
		 int count;
		 
		 for(int i=0;i<size;i++)
		 {
			 count=0;
			 for(int j=i+1;j<size;j++)
			 {
				 if(arr[i]==arr[j])
				 {
					 count++;
				 }
			 }
	
		 if(count>0)
		 {
			 System.out.println(arr[i]);
		 }
		 }

	}

}
