package week05;

import java.util.NoSuchElementException;

public class SList <E extends Comparable<E>>{
	protected Node0 head;  // ���� ����Ʈ�� ù ��� ����Ŵ
	private   int  size;
	public Node0 getHead() { return head; }
	public void setHead(Node0 n) { head= n;}
	public SList(){       // ���� ����Ʈ ������
		head = null;
		size = 0;
	}
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }

	public void insertFront(E newItem){ // ���Ḯ��Ʈ �� �տ� �� ��� ����
		head = new Node0(newItem, head);
		size++;
	}
	
	public void insertAfter(E newItem, Node0 p){ // ��� p �ٷ� ������ �� ��� ����
		p.setNext(new Node0(newItem, p.getNext()));
		size++;
	}
	public void deleteFront(){       // ����Ʈ�� ù ��� ����
		if (isEmpty()) throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}
	
	public void deleteAfter(Node0 p){ // p�� ����Ű�� ����� ���� ��带 ����
		if (p == null) throw new NoSuchElementException();
		Node0 t = p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);
		size--;
	}

	 public int search(E target) {   // target�� Ž��  
		 Node0 p = head;
		 for (int  k = 0; k < size ;k++){
			 if (target == p.getItem()) return k;
			 p = p.getNext(); 
		 }
		 return -1; // Ž���� ������ ��� -1 ����
	 }
	 public void print(){  // ���� ����Ʈ ������ �׸���� ���ʷ� ���
			for (Node0 p = head; p != null; p = p.getNext()) 
				System.out.print(p.getItem()+"\t ");
			System.out.println();
		}
}