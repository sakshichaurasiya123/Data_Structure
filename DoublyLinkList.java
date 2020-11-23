import java.util.*;
public class DoublyLinkList{
    static class LinkedListNode{
        public LinkedListNode next, pre;
       public  int data;
        public LinkedListNode(int data){
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }
    static class LinkedList{
        public LinkedListNode head;
        public LinkedList(){
            this.head = null;
        }
    }
    // ******************************** Insert at begning ************************************************
    public static LinkedListNode insartAtBegning(int data, LinkedListNode ll_head){
        LinkedListNode node = new LinkedListNode(data);
        if(ll_head == null){
            ll_head = node;
        }else{
            node.next = ll_head;
            ll_head.pre = node;
            ll_head = node;
        }
        return ll_head;
    }
    // ******************************** Insert at last *****************************************************
      static LinkedListNode temp;
      public static  LinkedListNode insertAtLast(int data,LinkedListNode ll_head){
            LinkedListNode node = new LinkedListNode(data);
            if(ll_head == null)
                ll_head = temp = node;
            else{
                temp.next = node;
                node.pre = temp;
                temp = node;
            }
            return ll_head;
        }
        public static void display(LinkedListNode ll_head){
            System.out.println(" ");
            if(ll_head == null)
                System.out.println("Empty List !");
            else{
                while(ll_head!=null){
                    System.out.print(ll_head.data+" ");
                    ll_head = ll_head.next;
                }
            }
            System.out.println(" ");
        }
// ********************************* Insert at specific position ****************************************************
    public static LinkedListNode insertAtSpecificPosission(int data,LinkedListNode ll_head,int pos){
        LinkedListNode node = new LinkedListNode(data);
        LinkedListNode temp = ll_head;
        LinkedListNode ttemp;
        int count=0;
        while(temp!=null){
            count++;
            if(pos-1 == count)
                break;
            temp = temp.next;
        }
        ttemp = temp.next;
        node.next = ttemp;
        ttemp.pre = node;
        temp.next = node;
        node.pre = temp;
        return ll_head;
    }
    // **************************** Delete element at begning ************************************
    public static LinkedListNode deleteElementAtBegining(LinkedListNode ll_head){
        if(ll_head == null)
            ll_head =  null;
        else{
            ll_head.next.pre = null;
            ll_head = ll_head.next;
        }
        return ll_head;
    }
    // ***************************** Delete at last ************************************************
    public static void deleteAtLast(LinkedListNode ll_head){
        LinkedListNode temp = ll_head;
        while(temp.next.next!=null)
            temp = temp.next;
            temp.next = null;
    }
    // ****************************** Delete At Specific Posission *********************************
    public static LinkedListNode deleteAtSpecificPosission(int pos,LinkedListNode ll_head){
        LinkedListNode temp;
        int count =0;
        temp = ll_head;
        while(temp!=null){
            count++;
            if(count == pos-1)
                break;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.pre = temp;
        return ll_head;
    }
    // **************************** Reverse Linked List ***********************************************************
    public static void reverse(LinkedListNode ll_head){
        if(ll_head.next != null)
            reverse(ll_head.next);
        System.out.print(ll_head.data+" ");
    }

    //*************************Remove Duplicate********************************* */

    public static LinkedListNode removeDuplicate(LinkedListNode ll_head ){
        LinkedListNode temp;
        temp=ll_head;
        LinkedListNode nx;
        nx=null;
        while(temp!=null){
            nx=temp.next;
            while(nx!=null){
                if(temp.data==nx.data)
                    temp.next=nx.next;
                    nx=nx.next;
            }
            temp=temp.next;
        }
       
        return ll_head;
    }

    // ****************************** Sort Linked list********************************************
        public static LinkedListNode sortList(LinkedListNode ll_head){
            LinkedListNode temp;
            temp = ll_head;
            LinkedListNode nx;
            while(temp!=null){
                nx = temp.next;
                while(nx!=null){
                if(temp.data > nx.data){
                    int tt = temp.data;
                    temp.data = nx.data;
                    nx.data = tt;
                  }
                nx=nx.next;
            }
                temp = temp.next;
            
            }
            return ll_head;

        }
    public static void main(String args[]){
      try{  
            LinkedList list = new LinkedList();
            Scanner scan = new Scanner(System.in);
            int n,data,pos,value;
            System.out.println("Enter the list size ");
            n = scan.nextInt();
            System.out.println("Enter list element ");
            LinkedListNode ll;
            while(n-- > 0 ){
                data = scan.nextInt();
               ll = insertAtLast(data,list.head);
            // LinkedListNode ll =  insartAtBegning(data,list.head);
               list.head = ll;
            }
            display(list.head);
            System.out.print("Enter the position for more element = ");
            pos = scan.nextInt();
             System.out.print("Enter the data = ");
            value = scan.nextInt();
             ll = insertAtSpecificPosission(value,list.head,pos);
             list.head = ll;
             System.out.println("Inserted at given position : ");
             display(list.head);
             ll = deleteElementAtBegining(list.head);
            list.head = ll;
            System.out.println("Deleted data from beginning : ");
            display(list.head);
            deleteAtLast(list.head);
            System.out.println("Daleted data from last : ");
             display(list.head);
             System.out.print("Enter the delete element position = ");
             int dpos;
             dpos = scan.nextInt();
             System.out.println("Deleted data from specific position : ");
             ll = deleteAtSpecificPosission(dpos,list.head);
             list.head = ll;
             display(list.head);
             System.out.println("Reverse List by recursion");
             reverse(list.head);
            System.out.println();
           System.out.println("Sort List ");
           sortList(list.head);
           display(list.head);
            System.out.println("Removed Duplicate element from list : ");
            removeDuplicate(list.head);
            display(list.head);           
            scan.close();
       } catch (Exception e) {
        
     }
        
    }
}