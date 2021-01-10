package ncs.test1;

public class ArrayTest {

	public static void main(String[] args) {
	

		
		
		int[][] array = {{12, 41, 36, 56, 21}, {82, 10, 12, 61, 45}, 
				{14, 16, 18, 78, 65}, {45, 26, 72, 23, 34}};
		
		int sum = 0;
		int cut = 0;
		double result = 0.0;
		
		for(int i = 0; i < array.length; i++) {
		 for(int j = 0; j < array[i].length; j++) {
			 sum += array[i][j];
			 cut++; //이거 이해가 잘 안감
		 }
		}
	
		System.out.printf("합계 : %.2f%n",(double)sum);
		System.out.println("평균은 : "+ (double)sum/cut);
		
		
	}
	
}
