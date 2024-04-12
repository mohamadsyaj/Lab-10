package lab10;

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
    @Test
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 11;
        arr[4] = 5;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 1;
        Sortedarr[1] = 5;
        Sortedarr[2] = 7;
        Sortedarr[3] = 9;
        Sortedarr[4] = 11;
        

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        
        assertArrayEquals(Sortedarr, arr);
        /** add tests to check for this unit test **/
    }
    @Test
    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -6;
        arr[1] = -12;
        arr[2] = -4;
        arr[3] = -5;
        arr[4] = -9;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -12;
        Sortedarr[1] = -9;
        Sortedarr[2] = -6;
        Sortedarr[3] = -5;
        Sortedarr[4] = -4;
        

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        
    	assertArrayEquals(Sortedarr, arr);
        /** Test data contains negative values only **/
    }
    @Test
    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = -5;
        arr[1] = -3;
        arr[2] = -8;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -5;
        Sortedarr[2] = -3;
        Sortedarr[3] = 2;
        Sortedarr[4] = 10;
        
        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        
    	assertArrayEquals(Sortedarr, arr);
        /** Test data contains with both positive, negative and zeros **/
    }
    @Test
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = 9;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 8;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        
    	assertArrayEquals(Sortedarr, arr);
        /** Test data contains duplicates **/
    }


}