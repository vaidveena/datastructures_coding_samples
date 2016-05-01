import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/**
 * @author vvaidyanathan
 * Given a list of integers, find a pair which sums up to given input b
 */
public class TwoSum {

    public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
        
        ArrayList<Integer> result = new ArrayList<Integer>();
                
        if (a.size() < 2)
            return result;

        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i=0; i < a.size(); i++)
        {
            int diff = b - a.get(i);
            if (h.containsKey(diff))
            {
                int index = h.get(a.get(diff));
                result.add(index+1);
                result.add(i+1);
                break;
            }
            else
            {
                h.put(a.get(i), i);
            }
        }
        return result;
    }

}
