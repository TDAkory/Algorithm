package ch01;

import java.util.Iterator;
import java.util.LinkedList;

public class ResizingArrayStack<T> implements Iterable<T> {
	
	@SuppressWarnings("unchecked")
	private T[] a = (T[]) new Object[1];
	private int N =0;
	
	public int size(){return N;}
	public boolean isEmpty(){return(N==0);}
	
	private void resize(int max){
		@SuppressWarnings("unchecked")
		T[] temp=(T[]) new Object[max];
		for(int i =0;i<N;i++)
			temp[i]=a[i];
		a=temp;
	}
	
	public void push(T item){
		if(N==a.length) resize(2*a.length);
		a[N++]=item;
	}
	
	public T pop(){
		T item=a[--N];
		a[N]=null;
		if(N>0&&N==a.length/4)
			resize(a.length/2);
		return item;
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ReverseArrayIterator();
	}
	
	private class ReverseArrayIterator implements Iterator<T>{
		private int i=N;
		public boolean hasNext(){return i>0;}
		public T next(){
			return a[--i];
		}
		public void remove(){
			throw new UnsupportedOperationException();
		}
	}
	
	LinkedList<T> l = new LinkedList<T>();
	
}
