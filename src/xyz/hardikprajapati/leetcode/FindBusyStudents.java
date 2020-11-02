package xyz.hardikprajapati.leetcode;

public class FindBusyStudents {
    public static void main(String[] args) {
        int[] startTime = {1,2,3};
        int[] endTime = {3,2,7};
        int queryTime = 4;
        System.out.println(busyStudent(startTime, endTime, queryTime));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        for (int i = 0; i < startTime.length; i++) {
            if(startTime[i] <= queryTime) {
                if(endTime[i] >= queryTime) {
                    ++result;
                }
            }
        }
        return result;
    }
}
