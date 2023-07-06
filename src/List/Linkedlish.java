package List;

import java.util.Date;
import java.util.Scanner;

public class Linkedlish {
    private ListNode head;
    private int size;
    public void  Addfirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void input_list(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Input Element , input -1 to end prosess : ");
        do {
            int number;
            number = sc.nextInt();
            if(number == -1){
                break;
            }
            Addfirst(number);
        }while (true);
    }
    public void output_list(){
        System.out.println("Output element : ");
        ListNode current = head;
        while (current!=null){
            System.out.println(current.val);
            current = current.next;
        }
    }
    public void swap(ListNode i,ListNode j){
        int temp = i.val;
        i.val = j.val;
        j.val =temp;
    }

    public void revome_element_in_list(int x){
        if(head == null){
            System.out.println("List is null");
        }
        // del element first list
        if(head.val == x){
            head =head.next;
            size--;
            return;
        }
        ListNode first = head;
        ListNode end = null;
        while (first!= null && first.val != x){
            end = first;
            first = first.next;
        }
        if(first != null){
            end.next = first.next;
            size--;
        }
    }
    public void sorted_list(){
        for (ListNode i = head; i != null ;i = i.next){
            for (ListNode j = i.next;j != null ;j=j.next){
                if(i.val < j.val){
                    swap(i,j);
                }
            }
        }
    }
}
