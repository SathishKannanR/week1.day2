package week2.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] a= {3,2,11,4,6,7};
		int[] b= {1,2,8,4,9,7};
		int size=a.length;
		int size1=b.length;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size1;j++)
			{
				if(a[i]==b[i])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}

	}

}
