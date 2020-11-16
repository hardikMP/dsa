package xyz.hardikprajapati.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hardikprajapati on 16/11/20
 */
public class DesignOrderedStream {

    public static void main(String[] args) {
        OrderedStream os = new OrderedStream(5);
        System.out.println(os.insert(3, "ccccc")); // Inserts (3, "ccccc"), returns [].
        System.out.println(os.insert(1, "aaaaa")); // Inserts (1, "aaaaa"), returns ["aaaaa"].
        System.out.println(os.insert(2, "bbbbb")); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
        System.out.println(os.insert(5, "eeeee")); // Inserts (5, "eeeee"), returns [].
        System.out.println(os.insert(4, "ddddd")); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].
    }
}

class OrderedStream {
    int currPtr = 0;
    String[] orderedStream;
    public OrderedStream(int n) {
        orderedStream = new String[n];
    }

    public List<String> insert(int id, String value) {
        List<String> result = new ArrayList<>();
        orderedStream[id-1] = value;
        if(id-1 == currPtr) {
            result.add(orderedStream[id-1]);
            for (int i = id; i < orderedStream.length; i++) {
                if(orderedStream[i] != null && !orderedStream[i].isEmpty()) {
                    result.add(orderedStream[i]);
                } else {
                    currPtr = i;
                    return result;
                }
            }
        }
        return result;
    }
}

//Best Solution on leetcode
//class OrderedStream {
//    String[] arr;
//    int pos;
//
//    public OrderedStream(int n) {
//        arr = new String[n];
//        pos = 0;
//    }
//
//    public List<String> insert(int id, String value) {
//        arr[id-1] = value;
//        List<String> list = new ArrayList<>();
//        if (id-1 == pos) {
//            while (pos != arr.length && arr[pos] != null) {
//                list.add(arr[pos]);
//                pos++;
//            }
//        }
//        return list;
//    }
//}
