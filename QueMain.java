//import Queue;
public class QueMain{
    public static void main(String arg[]) {
        Queue<E> mq=new Queue<>();
        mq.enqueue(19);
        mq.enqueue(10);
        mq.enqueue(30);
        System.out.println(mq.dequeue());
    }
}