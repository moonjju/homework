package workshop4;

public class Test2 {

	public static void main(String[] args) {
		
		 
		int[] arr3 = new int[5];
		int sum = 0;
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = (int)(Math.random()*10)+1;
			for(int j = 0; j<i; j++) {
				if(arr3[i]==arr3[j]) {
					i--;
				}
				  
			}
		}
		   for(int k=0;k<=arr3.length;k++) {
			   if(k!=arr3.length) {
				   System.out.print(arr3[k]+ " "); //중복제거
				   sum += arr3[k]; 
				   
			   }
		   }
		   System.out.println("\nsum = " + sum);
		   double avg = (double)sum / arr3.length;
		   System.out.println("avg = " + (int)avg);
	}

}
