public class Insert_node_at_the_beginning_of_a_SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
     public void insertFirst(int value)    
    {
        ListNode newNode= new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public void display()
    {
        ListNode current = head;
        while (current!=null)
        {
            System.out.print(current.data + "-->");
            current=current.next;

        }
        System.out.print("null");
    }
    public void length()
    {
        int count=0;
        ListNode current = head;
        while (current!=null)
        {

            current=current.next;
            count++;

        }
        System.out.println(" ");
        System.out.print("Total counts:" +count);
    }
   
    public static void main(String[] args) {
       Insert_node_at_the_beginning_of_a_SinglyLinkedList sll = new Insert_node_at_the_beginning_of_a_SinglyLinkedList();

       // sll.head = new ListNode(10);

       // ListNode second = new ListNode(1);
       // ListNode third = new ListNode(8);
       // ListNode fourth = new ListNode(11);

        //sll.head.next = second;
        //second.next = third;
       // third.next = fourth;
        sll.insertFirst(11); // Passing our values
        sll.insertFirst(58);
        sll.insertFirst(18);
        sll.display();
        //sll.length();
    }
        
}
