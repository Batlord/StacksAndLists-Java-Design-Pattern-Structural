package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface List<E> {

	public void add(int pos, E elmt);
	
	public E remove(int pos);
	
	public E get(int pos);
	
	public int size();
}
