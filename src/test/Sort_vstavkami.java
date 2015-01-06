package test;

public class Sort_vstavkami {

	public static void main(String[] args) {

		int[] arr = {3, 1, 67, -6, 0, 22};
		
		int min, temp;
		
		for (int j = 0; j < arr.length; j++){
		
			min = j;
		
		for (int i = j + 1; i < arr.length; i++) 
			if(arr[i] < arr[min]) min = i;
		
		temp = arr[j];
		arr[j] = arr[min];
		arr[min] = temp;
		
		}
		
		for(int m:arr){
			System.out.println(m);
		}

	}

}
