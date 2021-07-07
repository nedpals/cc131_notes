class Node{
    int data;
    Node next;

    //constructor (initialize)
    Node(int d, Node n) {
        data = d;
        next = n;
    }
}

public class SLLOps {
    Node head;
    Node tail;

    // constructor - creates new linked list. (partial)
    SLLOps(){
        head = tail = null;
    }

    SLLOps(Node h, Node t){
        head = h;
        tail = t;
    }

    @Override
    public String toString(){
        String str = "[";
        Node curr = head;
        while(curr!=null){
            str = str + curr.data;
            curr = curr.next;
            if(curr!=null) str += ", ";
        }
        str = str + "]";
        return str;
    }

    public boolean isEmpty(){
        return head == null && tail == null;
    }

    public void addBeforeNode(SLLOps list, int beforeData, int data) {
        Node curr = list.head;

        // use addToHead if the first curr node matches.
        // this assumes that the first `curr` node is always
        // the head.
        if (curr.data == beforeData) {
            addToHead(list, data);
            return;
        }

        // linked list traversal. stop if curr is null.
        while (curr != null) {
            // if the ptr of curr (curr.next) is not null or empty
            // and the value of it is equal to beforeData...
            if (curr.next != null && curr.next.data == beforeData) {
                // ...make a new Node with data as data and
                // curr.next as the ptr
                Node newNode = new Node(data, curr.next);
                
                // set the new value of curr.next to the newNode
                curr.next = newNode;
                
                // Expected Output
                // addBeforeNode(list, 10, 9)
                // where:
                //  list -> 6, 7, 8, 10 - linked list
                //  beforeData -> 10 - data to observe/watch
                //  data -> 9 - data to be inserted
                // output: 6, 7, 8, 9, 10
                
                // stop the loop and function
                return;
            }

            curr = curr.next;
        }
    }

    public void addAfterNode(SLLOps list, int afterData, int data) {
        // set the curr to head as starting point for traversal
        Node curr = list.head;
        
        // traverse the list and stop if the curr is null
        while (curr != null) {
            // if the content of curr is equal to the afterData
            if (curr.data == afterData) {
                // ...make a new Node with data as data
                // and curr.next as next/ptr
                Node newNode = new Node(data, curr.next);
                
                // addAfterNode inserts the node after
                // the curr, so set the new value of
                // curr.next to the newNode
                curr.next = newNode;

                // Expected Output
                // addAfterNode(list, 10, 9)
                // where:
                //  list -> 6, 7, 8, 10 - linked list
                //  afterData -> 10 - data to observe/watch
                //  data -> 9 - data to be inserted
                // output: 6, 7, 8, 10, 9
                
                // stop the loop and function
                return;
            }
    
            // if not matched, change the value of curr
            // to curr.next (curr's ptr)
            curr = curr.next;
        }
    }

    public void addToHead(SLLOps list, int data) {
        Node tmp = new Node(data, null);
        if (list.isEmpty()) {
            // set head and tail if list is empty
            list.head = tmp;
            list.tail = tmp;
        } else {
            // set the ptr of tmp first to the current head...
            tmp.next = list.head;
            
            // ...then set the new value of head to the tmp variable
            list.head = tmp;

            // Expected Output
            // addToHead(list, 10)
            // where:
            //  list -> 6, 7, 8, 10 - linked list
            //  data -> 9 - data to be inserted
            // output: 9, 6, 7, 8, 10
        }
    }

    public void addToTail(SLLOps list, int data) {
        Node tmp = new Node(data,null);
        if(list.isEmpty()) {
            list.head = tmp;
            list.tail = tmp;
        }
        else{
            list.tail = tmp;
            Node curr = list.head;
            
            while(curr!=null){
                if(curr.next==null){
                    curr.next = tmp;
                    break;
                }
                curr = curr.next;
            }
        }
    }

}

class SLLOpsTest{
    public static void main(String[] args) {
        /* 3. Implementation */

        Node n1 = new Node(10,null);
        Node n2 = new Node(20,null);
        Node n3 = new Node(30,null);

        n1.next = n2;
        n2.next = n3;

        SLLOps slla = new SLLOps(n1,n3);
        //System.out.printf("%s\n",slla.toString());
        //System.out.printf("Is linked list empty? : %b\n", slla.isEmpty());
        // [10, 20, 30]

        SLLOps sllb = new SLLOps();
        // addToTail
        System.out.printf("%s\n",sllb.toString());
        
        sllb.addToTail(sllb, 10);
        System.out.printf("%s\n",sllb.toString());
        
        sllb.addToTail(sllb, 20);
        System.out.printf("%s\n",sllb.toString());
        
        sllb.addToTail(sllb, 30);
        System.out.printf("%s\n",sllb.toString());
        
        sllb.addToTail(sllb, 40);
        System.out.printf("%s\n",sllb.toString());
        
        // addToHead
        sllb.addToHead(sllb, 1);
        System.out.printf("%s\n",sllb.toString());
        
        // addBeforeNode
        sllb.addBeforeNode(sllb, 30, 25);
        System.out.printf("%s\n",sllb.toString());
        
        // addAfterNode
        sllb.addAfterNode(sllb, 1, 45);
        System.out.printf("%s\n",sllb.toString());
    }
}
