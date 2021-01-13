package basics.lesson7;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		int [] myIntegers;
		myIntegers = new int [10];
		System.out.println(myIntegers[0]);
		
		myIntegers[0] = 5;
		System.out.println(myIntegers[0]);
		
		float [] myFloat = {1.0f, 2.0f, 3.0f};
		Integer firstInteger = 1;
		Integer secondInteger = 2;
		Integer [] array = {firstInteger, secondInteger};
		
		int [][] matrix = {{2 , 3 , 0}, {4, 5, 0}, {0, 7, 8}};
		
		int [] iterateFor = new int [100];
		int n = iterateFor.length;
		for(int i = 0; i < n; i++) {
		     iterateFor[i] = i+1;
		     System.out.println(iterateFor[i]);
		}
		
		int [] randomNumber = {1, 5, 3, 2, 4};
		Arrays.sort(randomNumber);
		for(int i = 0; i < randomNumber.length; i++) {
		     System.out.println(randomNumber[i]);
		}
		
		int[] arrayCopied = Arrays.copyOf(randomNumber, 3);
		for(int i = 0; i < arrayCopied.length; i++) {
		     System.out.println(arrayCopied[i]);
		}
		
		int [] partOfArray = Arrays.copyOfRange(randomNumber, 0, 2);
		for(int i = 0; i < partOfArray.length; i++) {
		     System.out.println(partOfArray[i]);
		}
		
		int [] emptyArray = new int [3];
        
		Arrays.fill(emptyArray, 9);
		for(int i = 0; i < emptyArray.length; i++) {
		     System.out.println(emptyArray[i]);
		}
		
		
		int[] randomNumbers = {10,3,11,5,8,3,2};
		Arrays.sort(randomNumbers);
		for (int i = 0; i < randomNumbers.length; i++) {
		     int binarySearch = Arrays.binarySearch(randomNumbers, randomNumbers[i]);
		     System.out.println(binarySearch);
		}
	}

}
