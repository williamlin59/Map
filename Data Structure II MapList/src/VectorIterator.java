public class VectorIterator<E> implements Iterator<E> {
	private int index;
	private Vector<E> vector;

	public VectorIterator(Vector<E> vector) {
		this.vector = vector;
		index = 0;
	}

	public boolean hasNext() {
	  return index < vector.size();
	}

	public E next() {
     return vector.elemAtRank(index++);
   }
}

