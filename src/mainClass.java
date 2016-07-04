import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//*********************************************
		// avec des Arrays
		
//		Personne tab[] = {
//				new Personne("Vador", "Dark", 54),
//				new Personne("Negative", "Woman", -125),
//				new Personne("Zero", "Janvier", 0),
//				new Personne("DA!","YO", 999),
//				new Personne("César", "Jules", 85),
//				new Personne("Reznor", "Trent", 55),
//				new Personne("Basile", "Muller", 21),
//				new Personne("Zib", "Zoub", 62)
//				};
//		
//		Personne tab2[]=Arrays.copyOf(tab,tab.length);
//		
//		System.out.println("----\nAffichage du tableau original\n");
//		
//		for (Personne p : tab)
//			System.out.println(p);
//		
//		System.out.println("----\nTri java 8 en utilisat un Comparator directement codé dans le main\n");
//		
//		Arrays.sort(tab2,(p1,p2)->{return p1.getAge()-p2.getAge();});
//		
//		for (Personne p : tab2)
//			System.out.println(p);
//		
//		System.out.println("----\nTri java 8 en utilisat un Comparator:int STATIC codé dans la classe Personne\n");
//		
//		Arrays.sort(tab,Personne::differenceAgeAMoinsAgeBstatic);
//		
//		for (Personne p : tab)
//			System.out.println(p);
//		
//		System.out.println("----\nTri java 8 en utilisat un Comparator:int d'instance codé dans la classe Personne\n");
//		
//		Arrays.sort(tab,Personne::differenceAgeBmoinsAgeA);
//		
//		for (Personne p : tab)
//			System.out.println(p);	
	
//*********************************************
// avec des ArrayList
		
		ArrayList<Personne> list = new ArrayList<>();
		
		list.add(new Personne("Zib", "Zoyub", 67));
		list.add(new Personne("Vador", "Dark", 54));
		list.add(new Personne("Vadzoub", "Woman", -125));
		list.add(new Personne("Vador", "Janvier", 0));
		list.add(new Personne("Vad", "YO", 999));
		list.add(new Personne("Cesar", "Jules", 85));
		list.add(new Personne("Reznor", "Trent", 55));
		list.add(new Personne("Basile", "Muller", 21));
		list.add(new Personne("Zib", "Zoub", 62));
		list.add(new Personne("Zib", "Zoub", 68));
		list.add(new Personne("Vad", "bleu", 21));
		
		int test=0;
			
		ArrayList<Personne> list2 = (ArrayList<Personne>) list.clone();
		ArrayList<Personne> list3= (ArrayList<Personne>) list.clone();
		
		
		System.out.println("----\nAffichage du tableau original\n");
		
		for (Personne p : list)
			System.out.println(p);
		
		System.out.println(list2);
		
		System.out.println("----\nTri AGE java 8 en utilissant un Comparator directement codé dans le main\n");
		
		list.sort((p1,p2)->{return p1.getAge()-p2.getAge();});
		
		for (Personne p : list)
			System.out.println(p);
		
		System.out.println("----\nTri NOM java 8 en utilisant un Comparator:comparaisonAlphabetiqueNomSubString\n");
		
		list2.sort(Personne::comparaisonAlphabetiqueNomSubString);
		
		for (Personne p : list2)
			System.out.println(p);
		
		System.out.println("----\nTri NOM java 8 en utilisant un Comparator:comparaisonAlphabetiqueNomChar\n");
		
		list3.sort(Personne::comparaisonAlphabetiqueNomChar);
		
		for (Personne p : list3)
			System.out.println(p);	

				
		}
	}
