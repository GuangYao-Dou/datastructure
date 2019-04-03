package InBit;

import java.util.List;

/**
 * Auther:vincent-Dou
 */
public class MySingleList implements ILinked {
    class Node{
        private  int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public MySingleList(){
        this.head = null;
    }
    @Override
    public void addFirst(int data) {
        //头插法
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
        }else {
            node.next = head;
            this.head = node;
        }
    }

    @Override
    public void addLast(int data) {
        //尾插法
        Node node = new Node(data);
        if(head == null){
            this.head = node;
            return;
        }
        Node temp;
        for(temp = head; temp.next != null; temp = temp.next){
        }
        temp.next = node;
    }

    @Override
    public boolean addindex(int index, int data) {
        //任意位置插入,第一个数据节点为0号下标
        if(index > listLength(head) || index < 0){
            return false;
        }
        if(index == listLength(this.head)){
            addLast(data);
            return true;
        }
        Node inserNode = new Node(data);
        Node temp = new Node(-1);
        Node temp2 = new Node(0);
        int count = 0;
        for(temp.next = head; count < index; temp = temp.next){
            count++;
        }
        temp2 = temp.next;
        temp.next = inserNode;
        inserNode.next = temp2;
        return true;
    }
    private int listLength(Node head){
        if(head == null){
            return 0;
        }
        Node temp = new Node(-1);
        int count = 1;
        for(temp.next = head; temp.next != null; temp = temp.next){
            count++;
        }
        return count;
    }

//    private void  checkIndex(int index){
//        if(index < 0 || index > getLength()){
//            throw new IndexOutOfBoundsException();
//        }
//    }

    @Override
    public boolean contains(int key) {
        //是否存在key值；
        Node temp = new Node(0);
        for(temp.next = head; temp.next != null; temp = temp.next){
            if(temp.next.data == key){
                return true;
            }
        }
        return false;
    }

    @Override
    public int remove(int key) {
        //删除第一次出现关键字为key的节点
        Node temp = new Node(-1);
        int count = 0;
        for(temp.next = head; temp.next != null; temp = temp.next){
            count++;
            //如果是最后一个，在此处删除
            if(temp.next.data == key && count == listLength(head)){
                temp.next = null;
                return count;
            }
            if(temp.next.data == key){
                Node cur = temp.next.next;
                temp.next = null;
                temp.next = cur;
                return count;
            }
        }
        return -1;
    }

    @Override
    public void removeAllKey(int key) {
        Node temp = new Node(0);
        int count = 0;
        for(temp.next = head; temp.next != null; temp = temp.next){
//            if(temp.next.data == key && count == listLength(head)){
//                remove(key);
//                return;
//            }
            if(temp.next.data == key){
                remove(key);
            }
            count++;
            if(count == listLength(head)){
                return;
            }
        }
    }

    @Override
    public int getLength() {
        if(head == null){
            return 0;
        }
        //返回结点个数
        Node temp = new Node(-1);
        int count = 0;
        for(temp.next = head; temp.next != null; count++, temp = temp.next){
        }
        return count;
    }

    @Override
    public void display() {
        //打印链表
        if(head == null){
            return;
        }
        Node temp = new Node(-1);
        for(temp.next = head; temp.next != null; temp = temp.next){
            System.out.print(temp.next.data+"->");
        }
    }

    @Override
    public void clear() {
        //清空链表
        if(head == null){
            return ;
        }
        head.next = null;
        head = null;
    }
}
