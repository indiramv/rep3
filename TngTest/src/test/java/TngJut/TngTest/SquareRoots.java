package TngJut.TngTest;

public class SquareRoots {
static int count=0;

	public static void main(String[] args) {
		
		SquareRoots obj=new SquareRoots();
		int value=obj.solution(-2, 647);
		System.out.println("value"+value);
		// TODO Auto-generated method stub

	}
	public int solution(int A, int B)
	
	{
        int cnt = 0; // Initialize result
 
        // Traverse through all numbers
        for (int i=A; i<=B; i++)
 
            // Check if current number 'i' is perfect
            // square
            for (int j=1; j*j<=i; j++)
                if (j*j==i)
                    cnt++;
        return cnt;
    }
}

