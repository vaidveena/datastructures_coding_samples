package datastructure_coding;

/**
 * @author vvaidyanathan
 * Given an input linked list, verify it its a palindrome.
 * find the middle of the linked list, reverse the second half, compare first and second half
 */

public class PalindromeLinkedList {
    
  public class ListNode
  {
      public int val;
      public ListNode next;
      
      ListNode(int data)
      {
          val = data;
          next = null;
      }
  }
    
  public int lPalin(ListNode A) {

        ListNode slow = A;
        ListNode fast = A;
        
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        //adjust slow pointer for odd linked list
        if (fast != null)
            slow = slow.next;
        
        //reverse linked list
        ListNode secondHalf = reverse(slow); //head of second half
        ListNode firstHalf = A;
        while (firstHalf != null && secondHalf != null)
        {
            if (firstHalf.val != secondHalf.val)
                return 0;
            
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return 1;
   }
  
   ListNode reverse(ListNode head)
   {
      ListNode prev =null;
      ListNode curr = head;
      ListNode next = null;
      while (curr != null)
      {
          next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
      }
      head = prev;
      return head;
   }
}
