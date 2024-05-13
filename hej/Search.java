

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class Search<E> {
	private int randomIndex;
	private Random rand = new Random();
	private int size;
	
	public Search(int length) {
		randomIndex = rand.nextInt(length);
		 size = length;
	}
	
	public long treeSearch(TreeSet t){
		int[] save = new int[randomIndex];
		int e;
		long t1 = System.nanoTime();
			for(int i = 0; i < randomIndex; i++) {
				save[i]=(int) t.pollFirst();	
			}
			 e = (int) t.pollFirst();
			 
		
		
		for(int i = 0; i<randomIndex;i++) {
			t.add(save[i]);
		}
		t.add(e);
		long t2 = System.nanoTime();
		return t2-t1;
	}
	
	
	public long linkedSearch(LinkedList L){
		long t1 = System.nanoTime();
		Object e = L.get(randomIndex);
		
		
		long t2 = System.nanoTime();
		return t2-t1;
	}
	
	public long listSearch(List L){
		long t1 = System.nanoTime();
		Object e = L.get(randomIndex);
		long t2 = System.nanoTime();
		randomIndex = rand.nextInt(size);
		return t2-t1;
		
	}
	
	
	
}
