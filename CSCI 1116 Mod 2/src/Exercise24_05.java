
public class Exercise24_05 {

	public static void main(String[] args) {
		MakeQueue<Integer> queue = new MakeQueue<>();
		queue.enqueue(7);
		queue.enqueue(13);
		System.out.println("First Enqueue");
		System.out.println(queue.toString());
		
		queue.enqueue(5);
		queue.enqueue(24);
		System.out.println("Second Enqueue");
		System.out.println(queue.toString());
		
		queue.dequeue();
		queue.dequeue();
		System.out.println("The Dequeue");
		System.out.println(queue.toString());
		
	}

}
