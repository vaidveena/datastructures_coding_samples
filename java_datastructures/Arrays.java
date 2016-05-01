package datastructure_coding;

import java.util.List;

/**
 * @author vvaidyanathan
 *
 */
public class Arrays {
    public int maxSubArray(final List<Integer> a) {
        int result = a.get(0), currSum = a.get(0);
        for (int i=1; i < a.size(); i++)
        {
            currSum = Math.max(a.get(i), currSum + a.get(i));
            result = Math.max(currSum, result);
            
        }
            return result;
        }
}
