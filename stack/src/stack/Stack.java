package stack;

public interface Stack<E> {

	void push(E e);
	
	E top();
	
	E pop();
	
	int getSize();
	
	boolean isEmpty();
	
	
	
}
