//ITI1121 Assignment 4
//Mirage Mohammad
//300080185
//July 24th 2019
public interface List<T extends Comparable<T>>{
    //abstract methods
    public abstract int size();
    public abstract T get(int i);
    public abstract int indexOf(Object item);
    public abstract void add(int i, T item);
    public abstract T remove(int i);
    public abstract T min();
    public abstract T minR();
    public abstract T max();
    public abstract T maxR();
    public abstract boolean Empty();
    public abstract void addAtHead(T item);
    public abstract void addAtEnd(T item);
    public abstract void replace(T first, T second);
    public abstract List<T> duplicate(T item);
    public abstract void reverse();
    public abstract List <T> countGreaterThan(T threshold);
    public abstract boolean equals(Object other);
    public abstract void removeEven();




}
