//ITI1121 Assignment 4
//Mirage Mohammad
//300080185
//July 24th 2019
//Test File

public class Mytestclass {
    public static void main(String[] args) {
        System.out.println("# Raft Test");
        SinglyLinkedList<Integer> List1 = new SinglyLinkedList<Integer>(null, null);//new List 1
        SinglyLinkedList<Integer> List2 = new SinglyLinkedList<Integer>(null,null);// new List 2
        List1.addAtEnd(40); //adds 40 at the end
        List1.addAtEnd(6);//adds 4 at the end
        List1.addAtHead( 2);//adds 2 at the head
        List1.addAtHead( 3);//adds 3 at the head
        List1.add(0,3);//adds 3 at position 0
        List1.add(2,10);//adds 10 at position 2
        Integer i =List1.min();//minimum value
        Integer m= List1.minR();//miniumum value
        List1.replace(40,21);//replaces 40 with 21



        System.out.println("List 2");
        List2.addAtEnd(4);
        List2.addAtEnd(8);
        List2.addAtEnd(4);
        List2.addAtEnd(10);
        List1 = (SinglyLinkedList<Integer>) List2.duplicate(4);//duplicates the list

        System.out.println("List 2");
        List2.reverse();//reverses the list
        System.out.println("end of List 2");
        List1 =  (SinglyLinkedList<Integer>)List2.countGreaterThan(new Integer(5));
        boolean t = List1.equals(List2);
        System.out.println(t);
        List2= new SinglyLinkedList<>(null,null);
        List1= new SinglyLinkedList<>(null,null);
        System.out.println("Checking if List 1 and List 2 are equal");
        List2.addAtEnd(4);
        List2.addAtEnd(8);
        List2.addAtEnd(4);
        List2.addAtEnd(10);

        List1.addAtEnd(4);
        List1.addAtEnd(8);
        List1.addAtEnd(4);
        List1.addAtEnd(10);
        boolean s = List1.equals(List2);// returns true if list 1 and list 2 are equal otherwise false
        System.out.println(s);



        System.out.println(List1.toString());//prints the toString of List1
        List1= new SinglyLinkedList<>(null,null);//new list1
        List1.addAtEnd(9);
        List1.addAtEnd(8);
        List1.addAtEnd(4);
        List1.addAtEnd(21);
        List1.addAtEnd(28);
        List2= (SinglyLinkedList<Integer>) List1.inorder();//order list
        System.out.println("Prints list 2 in order");
        System.out.println(List2.toString());
        System.out.println("Removes all even position in list 2");
        List2.removeEven();
        System.out.println(List2.toString());
        System.out.println("New List 1");
        List1= new SinglyLinkedList<>(null,null);
        List2= new SinglyLinkedList<>(null,null);

        System.out.println(List1.toString()); //toString
        List1.addAtEnd(1);
        List1.addAtEnd(8);
        List1.addAtEnd(20);
        List1.addAtEnd(22);
        List1.addAtEnd(31);
        List1.addAtEnd(10);
        System.out.println(List1.toString());


        System.out.println("Minimum Value:");
        Integer z = List1.min();
        System.out.println(z);
        System.out.println("Minimum Value Recursive");
        Integer y = List1.minR();
        System.out.println(y);
        System.out.println("Maximum Value");
        Integer x = List1.max();
        System.out.println(x);

        System.out.println("Maximum Value Recursive");
        Integer w = List1.maxR();
        System.out.println(w);
        System.out.println("List 1 before duplicate");
        System.out.println(List1.toString());
        List2 = (SinglyLinkedList<Integer>) List1.duplicate(10);
        System.out.println("List 1 after duplicate");
        System.out.println(List2.toString());
        System.out.println("recursive countGreaterThan 10");
        List1= new SinglyLinkedList<>(null,null);//new list1
        List1= (SinglyLinkedList<Integer>) List2.countGreaterThan(11);
        System.out.println(List1.toString());
        System.out.println("List 1 before ordered");
        System.out.println(List2.toString());
        System.out.println("List 1 after ordered");
        List1= (SinglyLinkedList<Integer>) List2.inorder();
        System.out.println(List1.toString());
        System.out.println("List2 before removeEven position");
        System.out.println(List2.toString());
        System.out.println("List2 after removeEven position");
        List2.removeEven();
        System.out.println(List2.toString());
        System.out.println("Before Reverse");
        System.out.println(List2.toString());
        System.out.println("After Reverse");
        List2.reverse();












    }
}
