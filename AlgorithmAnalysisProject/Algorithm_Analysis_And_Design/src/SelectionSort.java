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
public class SelectionSort
{
     void selectionSort(int array[]) {

    for (int i = 0; i < array.length - 1; i++) {
      int _minumumSayi = i;
      for (int j = i + 1; j < array.length; j++) {

        // To sort in descending order, change > to < in this line.
        // Select the minimum element in each loop.
        if (array[j] < array[_minumumSayi]) {
          _minumumSayi = j;
        }
      }

      // put min at the correct position
      int geciciDeger = array[i];
      array[i] = array[_minumumSayi];
      array[_minumumSayi] = geciciDeger;
    }
  }
    public static void main(String[] args) {
        int[] sayilar = { 20, 12, 10, 15, 2 };
        SelectionSort _selectSort = new SelectionSort();
        _selectSort.selectionSort(sayilar);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(sayilar));
    }
}
