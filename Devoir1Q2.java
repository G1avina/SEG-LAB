import java.util.*;

public class Devoir1Q2 {

	
	public static void main(String args[]) {
		
		//x est le nombre d'�l�ment dans chaque list.
		int x = 100000000;
		
	//LinkedList	
	//Prend le temps initial de la l'initialisation du LInkedList.
	long start1 = System.currentTimeMillis();
	LinkedList<Character> list1 = new LinkedList<Character>();
	
	//Rajoute les x �l�ment au LInkedList.
	for (int i=1;i<x;i++) {
		list1.add('a');
		
		}
	
	//Prend le temps fianl de l'initialisation du LInkedList.
	long end1 = System.currentTimeMillis();
	//Calcule le temps en milliseconde que sa prend pour initialiser le LInkedList. 
	long time1 = end1 - start1;
	//Print le r�sultat.
	System.out.println("LinkedList = " + time1);
	
	
	
	
	
	//ArrayList	
	//Prend le temps initial de la l'initialisation du ArrayList.
	long start2 = System.currentTimeMillis();
	ArrayList<Character> list2 = new ArrayList<Character>();
	
	//Rajoute les x �l�ment au ArrayList.
	for (int i=1;i<x;i++) {
		list2.add('a');
		
		}
	//Prend le temps fianl de l'initialisation du ArrayList.
	long end2 = System.currentTimeMillis();
	//Calcule le temps en milliseconde que sa prend pour initialiser le ArrayList. 
	long time2 = end2 - start2;
	//Print le r�sultat.
	System.out.println("ArrayList = " + time2);
	
	
	//Tableau	
	//Prend le temps initial de la l'initialisation du Tableau.
		long start3 = System.currentTimeMillis();
		Character Tableau[] = new Character[x];
		
		//Rajoute les x �l�ment au tableau.
		for (int i=1;i<x;i++) {
			Tableau [i] = 'a';
			
			}
		//Prend le temps fianl de l'initialisation du Tableau.
		long end3 = System.currentTimeMillis();
		//Calcule le temps en milliseconde que sa prend pour initialiser le tableau. 
		long time3 = end3 - start3;
		//Print le r�sultat.
		System.out.println("Tableau = " + time3);
	
	
}

}
