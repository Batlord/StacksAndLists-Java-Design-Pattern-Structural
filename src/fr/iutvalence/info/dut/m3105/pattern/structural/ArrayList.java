package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayList<E> implements List<E>{
	
	E[] list;
	public static final int SIZE = 10;
	public int count = 0;
	
	public ArrayList() {
		super();
		this.list = (E[]) new Object[SIZE];
	}
	
	@Override
	public void add(int pos, E elmt) {
		this.list[pos] = elmt;
		this.count = this.count + 1;
	}

	@Override
	public E remove(int pos) {
		this.count = this.count - 1;
		return this.list[pos];
	}

	@Override
	public E get(int pos) {
		return this.list[pos];
	}

	@Override
	public int size() {
		return this.count;
	}

}
