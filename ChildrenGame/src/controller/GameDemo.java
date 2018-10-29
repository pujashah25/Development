package controller;

import java.util.ArrayList;

import model.Child;

public class GameDemo {


    /**
     * Removes numToBeSkipped in clockwise manner and returns the sequence of
     * children as they go out.
     *
     * @param numOfChildren
     * @param numToBeSkipped
     * @return
     */

    public static int[] ChildrenGame(int numOfChildren, int numToBeSkipped) {
        ArrayList<Integer> circleList = new ArrayList<Integer>();
        int postion[] = new int[numOfChildren];

        for (int i = 0; i < numOfChildren; ++i) {
            circleList.add(i);
        }

        int childToBeRemoved = 0;
        int i = 0;
        int order = 0;

        while (circleList.size() != 0) {
            i++;
            if (i == numToBeSkipped) {
                postion[order] = circleList.get(childToBeRemoved);
                circleList.remove(childToBeRemoved);

                order++;
                childToBeRemoved--;
                i = 0;
            }

            if (order == numOfChildren - 1) {
                postion[order] = circleList.get(0);
                circleList.remove(0);
            }

            if (childToBeRemoved == circleList.size() - 1) {
                childToBeRemoved = 0;
            } else {
                childToBeRemoved++;
            }
        }

        return postion;
    }

    public static void main(String[] argv) {

        try {
            int n = 10;
            int k = 3;
            System.out.println("----------------------------START Children Ids------------------------");
            for (int i = 0; i < n; i++) {
                System.out.println("Child " + (i + 1) + " id is : " + i);
            }
            System.out.println("----------------------------END Children Ids--------------------------");

            int result[] = ChildrenGame(n, k);

            // Display the sequence of children going out.
            for (int i = 0; i < (result.length - 1); i++) {
                System.out.println("Child id who is out : " + result[i]);
            }

            System.out.println("-----------------------------------------------------------------------");

            // Last number left is the winner.
            System.out.println("Winner is:" + result[result.length - 1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
