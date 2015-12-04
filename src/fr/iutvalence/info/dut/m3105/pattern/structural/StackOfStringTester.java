package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackOfStringTester {
	
	private final Stack<String> stack; 

	public StackOfStringTester(Stack<String> stack) {
		this.stack = stack;
	}

	public void testStack(){
		System.out.println(stack.size());
		stack.push("a");
		System.out.println(stack.size());
		stack.push("b");
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
	}
}
