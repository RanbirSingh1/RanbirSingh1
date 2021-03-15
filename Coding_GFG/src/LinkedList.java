class LinkedList {
    static Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    static void removeDuplicates(){
        Node curr = head;
        while(curr.next != null){
            if(curr.data==curr.next.data) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
    }


    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);
        llist.push(11);

        System.out.println("List before removal of duplicates");
        llist.printList();

        llist.removeDuplicates();

        System.out.println("List after removal of elements");
        llist.printList();
    }
}