
public class ReverseLinkedList {
	    public ListNode reverseList(ListNode head) {
	        
	        if(head == null)
	            return null;
	        else if(head.next == null)
	            return head;
	    
	            ListNode second = head.next;
	            ListNode reverse = reverseList(second);
	            second.next = head;
	            head.next = null;
	        
	            return reverse;
	    }
	    
	     public class ListNode {
	    	     int val;
	    	     ListNode next;
	    	     ListNode(int x) { val = x; }
	    	  }
	
}
