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

        //so its number of jumps i need to reach my  nth node from the head node
        int jump1 = n-1;
        Node start = head;
        //after this loop my start node is at nth node from beginning
        while(jump1>0){
            jump1 --;
            start = start.next;
        }

        //now lets get the size of the list
        int size = 0;
        Node current = head;
        while(current != null){
            size ++;
            current = current.next;
        }

        // size - n is the measurement to get the nth node from the end by traversing from the beginning
        int jump2= size - n;
        Node end = head;
        while(jump2 > 0){
            jump2--;
            end = end.next;
        }
        //once i get start and end node i just swap them and return head
        int temp = start.data;
        start.data = end.data;
        end.data = temp;
        return head;
    }
    public static void main(String[] args) {


    }
}
