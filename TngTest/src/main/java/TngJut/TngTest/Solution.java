package TngJut.TngTest;

public class Solution {
	public int solution(int[] A) {
        // write your code in Java SE 8int min1=ab[0];
		int min1=A[0];
		for (int i = 0; i < A.length; i++) {
			if(A[i]<min1)
			{
				min1=A[i];
			}
		}
		return min1;
    }
	
	public static void main(String[] args) {
		
		
		int a[]={10,20,40,50,70};
		
		//int max=getMax(a);
		//System.out.println("max value"+max);
Solution obj= new Solution();

		int min=obj.solution(a);
		System.out.println("minvalue"+min);
	}

}
