package stack;

import org.junit.Assert;
import org.junit.Test;


public class ArrayStackTest {

	@Test
	public void pushTest() {

		Stack<String> stack = new ArrayStack<>();
		
		Assert.assertTrue(stack.isEmpty());
		Assert.assertEquals(0, stack.getSize());

		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertFalse(stack.isEmpty());
		Assert.assertEquals(3, stack.getSize());
		
	}
	
	@Test
	public void topTest() {
		Stack<Integer> stack = new ArrayStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		Assert.assertEquals(Integer.valueOf(3), stack.top());
		Assert.assertEquals(Integer.valueOf(3), stack.top());
		Assert.assertEquals(3, stack.getSize());
	}	

	@Test
	public void popTest() {
		Stack<Integer> stack = new ArrayStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		Assert.assertEquals(Integer.valueOf(3), stack.pop());
		Assert.assertEquals(2, stack.getSize());
		Assert.assertEquals(Integer.valueOf(2), stack.pop());
		Assert.assertEquals(1, stack.getSize());
		Assert.assertEquals(Integer.valueOf(1), stack.pop());
		Assert.assertEquals(0, stack.getSize());
		Assert.assertTrue(stack.isEmpty());
	}	
	
	@Test
	public void popEmptyTest(){
		Stack<Integer> stack = new ArrayStack<>();
		Assert.assertNull(stack.pop());
		
	}
	@Test
	public void topEmptyTest(){
		Stack<Integer> stack = new ArrayStack<>();
		Assert.assertNull(stack.top());
		
	}
}
