package oop;

public class numbers {
    public static void main (String[] args){
        int[] ratings = {8, 7, 6, 9, 5, 10, 4, 6, 7, 8,
                9, 6, 5, 7, 4, 8, 6, 9, 3, 7,
                8, 6, 5, 9, 7, 6, 8, 5, 4, 6,
                9, 8, 7, 6, 5, 10, 4, 6, 7, 8,
                9, 6, 5, 8, 7, 6, 4, 5, 8, 9};
        int[] count = new int[10];

        for (int i = 0 ; i < ratings.length ; i++){
            int rating = ratings[i];
            count[rating - 1]++;
        }
        for (int i = 0 ; i < count.length ; i++){
            System.out.println((i+1) + "\t" +count[i]);
        }


    }
}

