//ITI1121 Assignment 4
//Mirage Mohammad
//300080185
//July 24th 2019


public class SinglyLinkedList<T extends Comparable<T>> implements List<T> {
    private static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    //constructor
    public SinglyLinkedList(Node<T> h, Node<T> t) {
        head = h;
        tail = t;
    }
    //recrusive method size returns the size of the list
    public int size() {
        if (head == null)
            return 0;
        else
            return size(head);
    }

    private int size(Node<T> p) {
        if (p.next == null)
            return 1;
        else
            return 1 + size(p.next);
    }
    //recursive method get returns the element at the declared position
    public T get(int i) throws IndexOutOfBoundsException {

        if ((i < 0) || (i > size() - 1)) {
            throw new IndexOutOfBoundsException("Enter a valid index");

        } else if (head == null) {
            return null;
        } else {
            return get(i, head, 0);
        }
    }

    private T get(int i, Node<T> p, int pos) {

        if (p.next == null) {
            if (pos == i)
                return p.value;

            else
                return null;
        } else {
            if (pos == i) {
                return p.value;
            } else {
                pos++;
                return get(i, p.next, pos);

            }


        }

    }
    //recursive method indexOf returns the position of the item
    public int indexOf(Object item) {
        if (item == null) {
            return -1;
        } else {
            return indexOf(item, head, 0);
        }
    }

    private int indexOf(Object item, Node<T> p, int pos) {
        if (p.next == null) {
            if (p.value.compareTo((T) item) == 0) {
                return pos;
            } else
                return -1;
        } else {
            if (p.value.compareTo((T) item) == 0) {
                return pos;
            } else {

                pos++;
                return indexOf(item, p.next, pos);

            }

        }
    }
    //method add adds an item at the position declared
    public void add(int i, T item) throws IndexOutOfBoundsException {

        Node<T> q;
        Node<T> temp;
        Node<T> prev;
        int count = 0;

        if ((i < 0) || (i > size()))
            throw new IndexOutOfBoundsException("Enter a valid index");
        if (head == null) {

            if (i == 0) {
                q = new Node<T>(item, null);
                tail = q;
                head = q;
            }

        } else if (i == 0) {
            temp = new Node<T>(item, null);
            temp.next = head;
            head = temp;

        } else {

            q = head;
            prev = null;
            count = 0;


            while (q != null) {


                if (count == i) {
                    temp = new Node<T>(item, null);
                    temp.next = q;
                    prev.next = temp;


                    break;
                }
                count++;
                prev = q;
                q = q.next;
            }

        }

    }
    //method remove, removes an item at declared position
    public T remove(int i) throws IndexOutOfBoundsException {
        Node<T> q;
        Node<T> prev = null;
        Node<T> temp;
        T saved = null;
        int count = 0;
        if ((i < 0) || (i > size() - 1))
            throw new IndexOutOfBoundsException("Enter a valid index");
        if (head == null) {
            return null;
        } else {
            q = head;
            while (q != null) {

                if (i == 0) {
                    saved = q.value;
                    q = q.next;
                    head = q;
                    break;
                } else {
                    if (count == i) {
                        saved = q.value;
                        prev.next = q.next;
                        q = null;
                        break;
                    }
                    prev = q;
                    q = q.next;
                    count++;

                }
            }
        }
        return saved;
    }
    //method min returns the minimum value in the list
    public T min() {
        Node<T> q;
        T mini;
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head.value;
        } else {
            q = head;
            mini = q.value;

            q = q.next;
            while (q != null) {
                if (q.value.compareTo(mini) < 0)
                    mini = q.value;


                q = q.next;

            }
        }

        return mini;
    }
    //recursive method minR returns the minimum value in a list
    public T minR() {
        if (head == null)
            return null;
        else
            return minR(head, head.value);
    }


    private T minR(Node<T> p, T mini) {
        if (p.next == null) {
            if (p.value.compareTo(mini) < 0) {
                mini = p.value;
                return mini;
            } else
                return mini;

        } else if (p.value.compareTo(mini) < 0) {
            mini = p.value;
        }
        return minR(p.next, mini);

    }
    //method max returns the maximum value in a list
    public T max(){
        Node<T> p = head;
        T maxi;
        if(head==null){
            return null;}
        else{
            maxi=p.value;
            while(p!=null) {
                if (p.value.compareTo(maxi) == 1) {
                    maxi = p.value;
                    p=p.next;
                } else {
                    p = p.next;
                }
            }
            return maxi;
        }
    }
    //recursive method maxR returns the maximum value in a list
    public T maxR(){
        if(head==null){
            return null;
        }
        else{
            return maxR(head,head.value);
        }
    }
    private T maxR(Node<T> p, T maxi){
        if(p.next==null){
            if(p.value.compareTo(maxi)==1){
                maxi=p.value;
                return maxi;}
            else
                return maxi;
        }
        else if(p.value.compareTo(maxi)==1){
            maxi=p.value;

        }
        return maxR(p.next,maxi);
    }


    //method Empty returns true if empty otherwise false
    public boolean Empty() {
        return head == null;
    }
    //method addAtHead adds a node at the head
    public void addAtHead(T item) {
        Node<T> p;

        if (head == null) {
            p = new Node<T>(item, null);
            head = p;
            tail = p;

        } else {
            p = new Node<T>(item, head);
            head = p;

        }
    }
    //method addAtEnd adds a node at the end
    public void addAtEnd(T item) {
        Node<T> q;
        if (head == null) {
            q = new Node<T>(item, null);
            head = q;
            tail = q;
        } else {
            q = new Node<T>(item, null);
            tail.next = q;
            tail = q;
        }
    }
    //method replace, replaces the first value with the second value
    public void replace(T first, T second) throws NullPointerException {
        Node<T> q;
        if (head == null)
            throw new NullPointerException("List is Empty");
        q = head;
        while (q != null) {
            if (q.value.compareTo(first) == 0) {
                q.value = second;
            }

            q = q.next;
        }

    }
    //recursive method duplicate, copy's the same node again and adds it next to the node
    //otherwise if the node is not in the list it returns the same list
    public List<T> duplicate(T item) {
        List<T> lis = new SinglyLinkedList<T>(null, null);
        if (head == null) {
            return lis;
        } else
            return duplicate(head, item, lis);

    }

    private List<T> duplicate(Node<T> p, T item, List<T> lis) {
        if (p.next == null) {
            if (p.value.compareTo(item) == 0) {
                lis.addAtEnd(p.value);
                lis.addAtEnd(p.value);
                return lis;

            } else {
                lis.addAtEnd(p.value);
                return lis;

            }
        } else {
            if (p.value.compareTo(item) == 0) {
                lis.addAtEnd(p.value);
                lis.addAtEnd(p.value);
            } else {
                lis.addAtEnd(p.value);
            }
            return duplicate(p.next, item, lis);


        }

    }
    //method reverse, reverses the entire list
    public void reverse() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            reverse(head);
        }
    }

    private void reverse(Node<T> p) {
        String str="";
        if (p == null) {
            return;
        } else {
            if(p!=null){
                if(p.next!=null){
                    reverse(p.next);
                System.out.print(", "+p.value);}
                else{
                    reverse(p.next);
                    System.out.print(""+p.value);}}

            else{
                System.out.print(p.value+", ");};
        }
    }

    //method toString  returns the string representation of the elements
    public String toString() {
        Node<T> p = head;
        String str = "";
        while (p != null) {
            if (p.next == null) {
                str += (p.value) + " ";
            } else {
                str += (p.value) + ", ";
            }
            p = p.next;
        }
        return str;
    }
    //recursive countGreaterThan returns a list containing all the elements in a list
    //that are larger than the declared threshold
    public List<T> countGreaterThan(T threshold) {
        List<T> lis = new SinglyLinkedList<T>(null, null);
        if (head == null)
            return lis;
        else {
            countGreaterThan(head, threshold, lis);
            return lis;
        }
    }

    private void countGreaterThan(Node<T> p, T threshold, List<T> lis) {
        if (p.next == null) {
            if (p.value.compareTo(threshold) > 0)
                lis.addAtEnd(p.value);
        } else {
            if (p.value.compareTo(threshold) > 0) {
                lis.addAtEnd(p.value);
            }

            countGreaterThan(p.next, threshold, lis);


        }

    }
    //recursive method returns true if the other list is the same order and element as the list
    //otherwise false
    public boolean equals(Object other) {


        SinglyLinkedList<T> lis = (SinglyLinkedList<T>) other;
        if (this.size() != lis.size()) {
            return false;
        } else {
            return equals(this.head, lis.head, lis);
        }
    }

    private boolean equals(Node<T> p, Node<T> q, SinglyLinkedList<T> lis) {
        if ((p.next == null) && (q.next == null)) {
            if (p.value.compareTo(q.value) == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (p.value.compareTo(q.value) == 0) {
                return equals(p.next, q.next, lis);
            } else {
                return false;
            }
        }
    }
    //returns a new list that has all the elements in the list sorted in an ascending order
    public  List<T> inorder( )
    {   Node<T> p;
        SinglyLinkedList<T> myList;
        myList = new SinglyLinkedList<>(null,null);
        if (head==null)
            return myList;

        else

        {
            p= head;
           while (p!=null)
           {
               myList.addAtEnd(p.value);
               p = p.next;
           }

           sort(myList);
        return myList;
        }


    }

    public void sort(SinglyLinkedList<T> newList) {

        //Node current will point to head
        Node<T> current = newList.head;
        Node <T>   index = null;
        T temp;

        if(newList.head == null) {
            return;
        }
        else {
            while(current != null) {
                //Node index will point to node next to current
                index = current.next;

                while(index != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if(current.value.compareTo(index.value)>0)
                    {
                        temp = current.value;
                        current.value = index.value;
                        index.value = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    //method removeEven() removes all the elements at the even position of the list
    public void removeEven() throws NullPointerException{
        Node<T> p;
        Node<T> q;
        Node<T> temp;

        int count=0;

        if(head==null){
            throw new NullPointerException("List is Empty");
        }
        if(head.next==null){
            head=null;
            tail=null;
        }
        else
        {
            p= head;
            q=null;


            if(count==0){
                temp=p;
                p=p.next;
                head=p;
                temp.value=null;
                temp.next=null;
                count++;

            }

          //  q=p;
          //  p= p.next;

            while(p!=null){

                    if (count % 2 == 0) {
                        temp = p;
                        q.next = p.next;
                        p = p.next;
                       // p=q;
                        count++;

                        temp.value = null;
                        temp.next = null;
                        continue;

                    }
                    count++;
                    q=p;
                    p= p.next;
                }

            }

        }

    }









