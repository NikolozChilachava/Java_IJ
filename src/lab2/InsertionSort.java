package lab2;

import java.util.Random;

public class InsertionSort {
    private int A[];

    public InsertionSort(int n, int min, int max)
    {
        A = new Random(42).ints(n, min, max).toArray();
    }

    public void print()
    {
        for (int i=0; i<A.length; i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public void sort() {
        for (int i = 1; i < A.length; i++) {
            int temp = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > temp)    {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = temp;
        }
    }


    public static void main(String[] args) {
        InsertionSort A = new InsertionSort(10, 0, 100);
        A.print();
        A.sort();
        A.print();
    }
}
