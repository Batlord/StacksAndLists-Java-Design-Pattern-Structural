package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<E> implements Stack<E> {
	
	E[] stack;
	public static final int SIZE = 10;
	public int index = 0;
	
	public ArrayStack() {
		super();
		this.stack = (E[]) new Object[SIZE];
	}

	@Override
	public void push(E elmt) {
		this.stack[this.index] = elmt;
		this.index = this.index + 1;
	}

	@Override
	public E pop() {
		this.index = this.index - 1;
		return this.stack[this.index];
	}

	@Override
	public E peek() {
		return this.stack[this.index-1];
	}

	@Override
	public int size() {
		return this.index;
	}
	

}
