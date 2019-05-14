/*
 * Tyler Shatley
 * csce 146
 */
public class LinkedListQueue <T>{
	
	private class ListNode
	{
		private T data;
		private ListNode link; 
		
		public ListNode(T xData, ListNode xLink) 
		{
			data = xData;
			link = xLink;
		}
	}
		
		private ListNode head; 
		private ListNode tail; 
		
		public LinkedListQueue()
		{
			head = tail = null;
		}
		public LinkedListQueue(T data)
		{
			enqueue(data);
		}
		
		public void enqueue(T aData) 
		{
			ListNode newNode = new ListNode(aData, null);
			if(head == null)
			{
				head = tail = newNode;
			}
			else
			{
				tail.link = newNode;
				tail = newNode; 
			}
		}
		
		public T dequeue() 
		{
			if(head == null)
				return null;
			else
			{
				T ret = head.data; 
				head = head.link;
				return ret;
			}
		}
		
		public T peek()
		{
			if(head == null)
				return null;
			else
				return head.data;
		}
		
		public void print() 
		{
			ListNode temp = head;
			while(temp != null)
			{
				System.out.println(temp.data);
				temp = temp.link;
			}
		}
}