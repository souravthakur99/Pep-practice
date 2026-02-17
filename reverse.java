package linlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;

    }

}
public class reverse {
    public static void main(String args[]){
    int[]arr={10,20,30,40,50,60};
    int i=0;
    Node head=null;
    Node tail=null;
    while(i<arr.length){
        Node newNode= new Node(arr[i]);
        if(head==null) {head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        i++;
    }
    //reverse the list
    Node prev=null;
    Node curr=head;
    while(curr!=null){
        Node next=curr.next;
        curr.next=prev;
        //update the nodes
        prev=curr;
        curr=next;
    }
    
    head=prev;
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
}
}