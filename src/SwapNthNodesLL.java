public class SwapNthNodesLL {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node swapNthNodesLL(Node head, int n){
        int jump1 = n-1;
        Node start = head;
        while(jump1>0){
            jump1 --;
            start = start.next;
        }
        int size = 0;
        Node current = head;
        while(current != null){
            size ++;
            current = current.next;
        }
        int jump2= size - n;
        Node end = head;
        while(jump2 > 0){
            jump2--;
            end = end.next;
        }
        int temp = start.data;
        start.data = end.data;
        end.data = temp;
        return head;
    }
    public static void main(String[] args) {


    }
}
