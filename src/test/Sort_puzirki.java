package test;

public class Sort_puzirki {

	public static void main(String[] args) {
	
		int[] arr = {3, 1, 67, -6, 0, 22};
		int temp;
		
		for (int j = arr.length-1; j > 0 ; j--){
		for (int i = 0; i < j; i++){
			
		    	if (arr[i] > arr[i+1]){
				  temp = arr[i+1];
				  arr[i+1] = arr[i];
				  arr[i] = temp;
	  		    }
     		}

		}
		
		for(int m:arr){
			System.out.println(m);
		}

    }
	
}
