package assignment2;

import java.util.LinkedList;

public class Greedy {

    public static LinkedList<Activity> activitySelection(LinkedList<Activity> activities) {
        // TASK 1.B.a
        LinkedList<Activity> selected = new LinkedList<>();

        if (activities.isEmpty()) {
            return selected;
        }

        // Select the first activity (earliest finish time)
        Activity lastSelected = activities.get(0);
        selected.add(lastSelected);

        // Iterate through remaining activities
        for (int i = 1; i < activities.size(); i++) {
            Activity current = activities.get(i);

            if (!current.overlap(lastSelected)) {
                selected.add(current);
                lastSelected = current;
            }
        }

        return selected;
    }

    public static LinkedList<Integer> makeChange(int amount, int[] denominations) {
        // TASK 1.B.b
        LinkedList<Integer> coins = new LinkedList<>();

        int remaining = amount;

        // Iterate through denominations from largest to smallest
        for (int denomination : denominations) {
            // Use as many coins of this denomination as possible
            while (remaining >= denomination) {
                coins.add(denomination);
                remaining -= denomination;
            }
        }

        return coins;
    }

    public static void main(String[] args) {
        LinkedList<Activity> activities = new LinkedList<Activity>();
        activities.add(new Activity(1,1, 4));
        activities.add(new Activity(2, 3, 5));
        activities.add(new Activity(3, 0, 6));
        activities.add(new Activity(4, 5, 7));
        activities.add(new Activity(5, 3, 8));
        activities.add(new Activity(6, 5, 9));
        activities.add(new Activity(7, 6, 10));
        activities.add(new Activity(8, 8, 11));
        activities.add(new Activity(9, 8, 12));
        activities.add(new Activity(10, 2, 13));
        activities.add(new Activity(11, 12, 14));
        activitySelection(activities).forEach(a -> a.print());

        System.out.println();
        makeChange(1234, new int[] { 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 }).forEach(i -> System.out.println(i));
    }
}
