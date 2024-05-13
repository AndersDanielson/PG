package hej;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Lab {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		Scanner scan = new Scanner(new File(args[0]);
		
		
		
		ArrayList<Long> treeSortTime = new ArrayList<Long>();
		ArrayList<Long> treeSearchTime = new ArrayList<Long>();
		ArrayList<Long> linkedSortTime = new ArrayList<Long>();
		ArrayList<Long> linkedSearchTime = new ArrayList<Long>();
		ArrayList<Long> listSearchTime = new ArrayList<Long>();
		ArrayList<Long> listMergeSortTime = new ArrayList<Long>();
	
		
		TreeSet<Integer> tree = new TreeSet<>();
		LinkedList<Integer> linked = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		
		
		while(scan.hasNext()) {
			int i = scan.nextInt();
			tree.add(i);
			linked.add(i);
			list.add(i);
		}
		Search s = new Search(tree.size());
		ListSorter l = new ListSorter();
		
		for(int i = 0; i < Integer.valueOf(args[2]; i++) {
			treeSortTime.add(l.TreeSort(tree));
			treeSearchTime.add(s.treeSearch(tree));
			linkedSortTime.add(l.LinkedSort(linked));
			linkedSearchTime.add(s.linkedSearch(linked));
			listSearchTime.add(s.listSearch(list));
			listMergeSortTime.add(l.ListMergeSort(list));
			
		}
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
			writer.write("Runnumbre,	TreeSortTime,       TreeSearchTime,      linkedSortTime,       linkedSearchTime,      listSearchTime,      listMergeSortTime      \n");
			for(int i = 0; i < treeSortTime.size(); i++) {
				String output =i+1 + " 	 ,      " + Long.toString(treeSortTime.get(i)) + "  	,	  " + Long.toString(treeSearchTime.get(i))
				+ " 	 ,	  " + Long.toString(linkedSortTime.get(i)) + " 	 , 	 " + Long.toString(linkedSearchTime.get(i))
				+ "	  , 	 " + Long.toString(listSearchTime.get(i)) + "	  , 	 " + Long.toString(listMergeSortTime.get(i));
				writer.write(output + "\n");
		
		
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Hej");
	}
	
	
	
	
	


}
