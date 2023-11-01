import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val; //T variable stands for type 
  Node<T> next; //Represent node "next" of list

  public Node(T val) { //Class that represents node object
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    List<String> values = new ArrayList<>(); //Create a new array list of type String called "values"
    while (head != null){   //While loop that reads head of linked list input and exits once there is no more head values.
      values.add(head.val);
      head = head.next;
    }
    return values;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    System.out.println(Solution.linkedListValues(a)); 
    // -> [ "a", "b", "c", "d" ]
  }
}
