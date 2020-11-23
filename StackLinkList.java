import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import java.io.*;
import java.util.*;
public class StackLinkList {
     
    static class StackNode{
        int val;
        StackNode next;
        public StackNode(int val){
            this.val=val;
            this.next=null;
        
        }
    }
   static StackNode head;     
   Scanner in=new Scanner(System.in);
       
    public static void  push(){
        StackNode ptr;
        ptr=head;
        if(ptr==null)
            System.out.println("You cannot pushed ");
        else{
            int val=in.nextInt();
            if(head==null){
                ptr.val=val;
                ptr.next=null;
                head=ptr;
            }
            else{
                ptr.val=val;
                ptr.next=head;
                head=ptr;
            }
            System.out.println("Item Pushed ");
        }
    }
    public static void main(String arg[]){
        System.out.println("Item pushing ");
            push();

    }

}