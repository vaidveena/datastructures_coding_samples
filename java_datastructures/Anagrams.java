import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * @author vvaidyanathan
 *
 */
public class Anagrams {
public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        HashMap<String, ArrayList<Integer>> hm = new HashMap<String, ArrayList<Integer>>();
        int i =1;
        for (String str : a)
        {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            
            String sorted = new String(arr);
            

            if (hm.containsKey(sorted))
            {
                ArrayList<Integer> list = hm.get(sorted);
                list.add(i);
                hm.put(sorted, list);
                
            }
            else
            {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i);
                hm.put(sorted, list);
            }
            i++;
        }
        
        //from hash to result
       for (Map.Entry<String, ArrayList<Integer>> entrySet : hm.entrySet()) {
            result.add(entrySet.getValue());
        }
        
        return result;
    }
}
