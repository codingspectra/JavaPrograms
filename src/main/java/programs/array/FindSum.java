package programs.array;

import java.util.HashMap;
import java.util.Map;

public class FindSum {
    public static void main(String args[]){
        int target = 111;
        int arr[] = {5,1,3,8,9,2};
        Map<Integer,Integer> map = new HashMap<>();
        for(int p=0; p< arr.length; p++){
            Integer currMapVal = map.get(arr[p]);
            if(currMapVal!=null && currMapVal >= 0){
                System.out.println(currMapVal+","+p);
            }else {
                int numToFind = target - arr[p];
                map.put(numToFind, p);
            }
        }
        System.out.println("Not Found");
    }
}
