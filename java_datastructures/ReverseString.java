package datastructure_coding;

/**
 * @author vvaidyanathan
 * Reverse a string
 */
public class ReverseString {
    
    public String reverseWords(String s) {
        
        if (s == null || s.length() == 1)
            return s;
       
        char[] a = s.toCharArray();
        int start = 0, end = a.length-1;
        
        reverse(a, start, end);
        
        end=0;
        //reversed string a
        while (end < a.length)
        {
            if (a[end] != ' ')
            {
                start = end;
                while (end < a.length && a[end] != ' ')
                {
                    end++;
                }
                end--;
                reverse(a, start, end);    
            }
            end++;
        }
        return String.valueOf(a);
    }
    
    void reverse(char[] arr, int start, int end)
    {
         while (start <= end)
        {
            char temp = arr[start];
            arr[end] = arr[start];
            arr[start] = temp;
            
            start++;
            end--;
        }
    }
}
