package programs.array;

import java.util.HashMap;
import java.util.Map;

/**
 * There is an array of integers.
 * Return the indices of the two numbers that add up to a given target.
 * For Example : if the number array is arr = {3,5,7,9,1,6} and target is 7, then response should be 4,5
 * i.e, arr[4] + arr[5] = 7
 */
public class FindSum {
    public static void main(String[] args){
        int targetNum= 7;
        Integer[] numArray = new Integer[]{3,5,7,9,1,6};

        FindSum fs = new FindSum();
        System.out.println("findSumBruteforce = " + fs.findSumBruteforce(numArray,targetNum));
        System.out.println("findSumOptimal = "+ fs.findSumOptimal(numArray,targetNum));

    }
    public String findSumBruteforce(Integer[] numArray, int targetNum){
        String response = "Not Found";
        for(int ptr1=0; ptr1<numArray.length ; ptr1++){
            int numToFind = targetNum - numArray[ptr1];
            for(int ptr2=ptr1+1 ; ptr2<numArray.length ; ptr2++){
                if(numToFind == numArray[ptr2]){
                    response = ptr1+","+ptr2;
                }
            }
        }
        return response;
    }

    public String findSumOptimal(Integer[] arr, int target){
        String response = "Not Found";
        Map<Integer,Integer> map = new HashMap<>();
        for(int p=0; p< arr.length; p++){
            Integer currMapVal = map.get(arr[p]);
            if(currMapVal != null && currMapVal >= 0){
                response = currMapVal+","+p;
                return response;
            }else {
                int numToFind = target - arr[p];
                map.put(numToFind, p);
            }
        }
        return response;
    }
}
