/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ercel
 */
import java.util.Arrays;
public class InsertionSort
{
    void insertionSort(int array[]) {
    for (int i = 1; i < array.length; i++) {
      int deger = array[i];
      int j = i - 1;
      while (j >= 0 && deger < array[j]) {
        array[j + 1] = array[j];
        --j;
      }
      array[j + 1] = deger;
    }
  }

   public static void main(String args[]) {
    int[] sayilar = { 9, 5, 1, 4, 3 };
    InsertionSort _insertSort = new InsertionSort();
    _insertSort.insertionSort(sayilar);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(sayilar));
  }
}
