package week05;

public class Node0  <E extends Comparable<E>>{
		private E    item;
		private Node0 next;
		
		public Node0(E newItem, Node0<E> p){ // »ý¼ºÀÚ
			item  = newItem;
			next  = p;
		}
		// get ¸Þ¼Òµå¿Í set ¸Þ¼Òµå
		public E    getItem() { return item;}
	    public Node0 getNext() { return next;}
	    public void setItem(E newItem)  { item = newItem;}
	    public void setNext(Node0 n) 	{ next = n;}
	}