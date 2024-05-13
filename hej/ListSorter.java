package hej;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class ListSorter {
	
	
	public ListSorter() {
	}
	
	public long TreeSort(TreeSet t) {
		
		long t1 = System.nanoTime();
		
		
		long t2 = System.nanoTime();
		return t2-t1;
	}
	
	public long LinkedSort(LinkedList L) {
		long t1 = System.nanoTime();
		Collections.sort(L);
		
		
		long t2 = System.nanoTime();
		return t2-t1;
	}
	
	public long ListMergeSort(List L) {
		long t1 = System.nanoTime();
		Collections.sort(L);
		
		
		long t2 = System.nanoTime();
		return t2-t1;
	}
	
	
}
