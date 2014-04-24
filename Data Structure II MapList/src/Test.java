import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		listTest();
//		vectorTest();
		
//		java.util.List<String> myList = new java.util.ArrayList<String>();
//		myList.add("rem");
//		myList.add("bob");
//		for(String x : myList) {
//			System.out.println(x);
//		}
//		
//		java.util.Iterator it = myList.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
	}
	
	public static void listTest() {
		List<String> list = new LinkedList<String>();
		Position<String> p = list.insertFirst("rem");
		System.out.println(list);

		list.insertBefore(p, "joe");
		System.out.println(list);

		list.insertAfter(p, "fred");
		System.out.println(list);
		
		list.remove(p);
		System.out.println(list);

//		Position<String> c = list.first();
//		while (!c.equals(list.last())) {
//			System.out.println(c.element());
//			c = list.next(c);
//		}
//		System.out.println(c.element());
		
//		Iterator<String> it = new ListIterator<String>(list);
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void vectorTest() {
		Vector<String> vector = new ArrayVector<String>();

		vector.insertAtRank(0, "rem");
		System.out.println(vector);
		
		vector.insertAtRank(0, "joe");
		System.out.println(vector);

		vector.insertAtRank(2, "fred");
		System.out.println(vector);
		
		vector.removeAtRank(1);
		System.out.println(vector);

//		for (int i=0; i < vector.size(); i++) {
//			System.out.println(vector.elemAtRank(i));
//		}
		
		Iterator<String> it = new VectorIterator<String>(vector);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
