package assignment2;

public class DivideAndConquer {

    public static int fibonacci(int n) {
        // TASK 1.A.a
        if (n==0) return 0;
        if (n==1) return 1;

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public static int search(int[] A, int v)
    {
        // TASK 1.A.b
        int left = 0;
        int right = A.length-1;
        while (left <= right)
        {
            int mid = left + (right - left)/2;
            if (A[mid] == v)
            {
                return mid;
            }
            else if (A[mid] < v)
            {
                left = mid + 1;
            }
            else if (A[mid] > v)
            {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void hanoi(int n, char A, char B, char C)
    {
        // TASK 1.A.c
        if (n == 1) {
            System.out.println(A + " -> " + C);
            return;
        }
        hanoi(n - 1, A, C, B);
        System.out.println(A + " -> " + C);
        hanoi(n - 1, B, A, C);
    }

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println(fibonacci(i));
        }
        System.out.println();
        for (int i=0; i<10; i++) {
            System.out.println(search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, i));
        }
        System.out.println();
        hanoi(3, 'A', 'B', 'C');
    }
}
