package week04;
import DS.Vertex;

public interface ListIterator implements Iterator<Vertex>{
	int index = 0;
	int numVertices;
	Vertex v[];
	public ListIterator() {
		LinkedList list = new LinkedList();
	}
	public boolean hasNext() {
		return index < numVertices;
	}
	public Vertex next() {
		return v[index++];
	}
}
