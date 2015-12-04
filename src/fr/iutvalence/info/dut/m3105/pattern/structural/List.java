package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface List<E> {

	public void add(int num, E elmt);
	
	public E remove(int num);
	
	public E get(int num);
	
	public int size();
}
