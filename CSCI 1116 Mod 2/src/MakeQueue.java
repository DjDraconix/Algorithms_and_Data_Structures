import java.util.LinkedList;

public class MakeQueue<E> extends LinkedList<E> {
	private static final long serialVersionUID = 1L;
	private LinkedList<E> list = new LinkedList<>();
	
	MakeQueue() {
	}
	
	MakeQueue(E[] objects) {
		for (E e : objects)
			add(e);
	}

	public void enqueue(E e) {
		list.addLast(e);
	}
	
	public E dequeue() {
		return list.removeFirst();
	}
	
	public int getSize() {
		return list.size();
	}
	
	public String toString() {
		return "Queue: " + list.toString();
	}
}
