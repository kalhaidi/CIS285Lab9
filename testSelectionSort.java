/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
        
        SelectionSort arr1 = new SelectionSort();
        int [] val = arr1.basicSelectionSort(arr);
        int maxVal = val [Sortedarr.length-1];
        assertEquals (10, maxVal);
        
    }
    
    public void testNegative(){
        
    	   int[] arr = new int[5];
           arr[0] = -8;
           arr[1] = -9;
           arr[2] = -7;
           arr[3] = -10;
           arr[4] = -2;
           
           int[] Sortedarr = new int[5];
           Sortedarr[0] = -2;
           Sortedarr[1] = -7;
           Sortedarr[2] = -8;
           Sortedarr[3] = -9;
           Sortedarr[4] = -10;
           
           /** Test data contains negative values only **/
           
           SelectionSort arr1 = new SelectionSort();
           int [] val = arr1.basicSelectionSort(arr);
           int maxVal = val [Sortedarr.length-1];
           assertEquals (-2, maxVal);
    }
   
    public void testMixed(){
        
    	   int[] arr = new int[5];
           arr[0] = 8;
           arr[1] = 9;
           arr[2] = 0;
           arr[3] = -10;
           arr[4] = -2;
           
           int[] Sortedarr = new int[5];
           Sortedarr[0] = -2;
           Sortedarr[1] = 7;
           Sortedarr[2] = 0;
           Sortedarr[3] = -9;
           Sortedarr[4] = 6;
           
           /** Test data contains with both positive, negative and zeros **/
           
           SelectionSort arr1 = new SelectionSort();
           int [] val = arr1.basicSelectionSort(arr);
           int maxVal = val [Sortedarr.length-1];
           assertEquals (9, maxVal);
//Person 2 did this
    };
    
    
    public void testDuplicates(){
    	
    	   int[] arr = new int[5];
           arr[0] = 7;
           arr[1] = 9;
           arr[2] = 7;
           arr[3] = 3;
           arr[4] = 2;
           
           int[] Sortedarr = new int[5];
           Sortedarr[0] = 2;
           Sortedarr[1] = 5;
           Sortedarr[2] = 8;
           Sortedarr[3] = 9;
           Sortedarr[4] = 2;
           
           /** Test data contains duplicates **/
           
           SelectionSort arr1 = new SelectionSort();
           int [] val = arr1.basicSelectionSort(arr);
           int maxVal = val [Sortedarr.length-1];
           assertEquals (9, maxVal);
//Person 2 did this
    }


}
