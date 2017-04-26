/**
 * Created by jackbrashier on 4/25/17.
 */
public class SortClass {
    public static void swap(int oneNum, int otherNum, int [] numArr) {
        int saveIdx = numArr[oneNum];
        numArr[oneNum] = numArr[otherNum];
        numArr[otherNum] = saveIdx;
    }
    public static void sort(int [] numArr) {
        for(int i = 0; i < numArr.length; i++) {
            for(int x = i; x > 0; x--) {
                if(numArr[x] < numArr[x-1]) {
                    SortClass.swap(x, x-1, numArr);
                }
            }
        }
    }
    public static String displayArr(int [] numArr) {
        String output = "";
        for(int i = 0; i < numArr.length; i++) {
            output = output + Integer.toString(numArr[i]) + ", ";
        }
        return output;
    }
}
