import java.util.ArrayList;

public class ArrayListInteger {
	public static void main(String[] args){
		
		ArrayList<Integer> arl1= new ArrayList<Integer>();
		arl1.add(3);
		arl1.add(6);
		arl1.add(9);
		arl1.add(12);
		System.out.println(arl1);
		
		arl1.remove(2);
		System.out.println(arl1);
		
		ArrayList<Integer> arl2= (ArrayList<Integer>)arl1.clone();
		arl2.add(15);
		System.out.println("arl1" +arl1);
		System.out.println("arl2" +arl2);
		
		System.out.println("ANDIANG:" + arl1.isEmpty());
		if (arl1.contains(12))
			System.out.println(" DIANG DI NOMOR 12");
		else{
			System.out.println("ANDIANG NOMOR 12");
		}
		System.out.println("arl1" +arl1);
		System.out.println("arl2" +arl2);
		System.out.println("DIANGDI PALAKA");
	}
}
