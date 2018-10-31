import java.util.ArrayList;

public class ArrayListObject {
	public static void main(String[] args){
		
		ArrayList<Integer> arl1 = new ArrayList<Integer>();
		ArrayList<String> nama = new ArrayList<String>();
		ArrayList<Double> tinggiBadan = new ArrayList<Double>();
		ArrayList<Float> beratBadan = new ArrayList<Float>();
		
		arl1.add(9);
		nama.add("Wira");
		tinggiBadan.add(183.4);
		beratBadan.add((float)82.2);
		
		ArrayList<Integer> arl2= (ArrayList<Integer>)arl1.clone();
		ArrayList<String> nama2= (ArrayList<String>)nama.clone();
		ArrayList<Double> tinggiBadan2= (ArrayList<Double>)tinggiBadan.clone();
		ArrayList<Float> beratBadan2= (ArrayList<Float>)beratBadan.clone();
		
		arl2.add(3);
		nama2.add("Annisa");
		tinggiBadan2.add(168.6);
		beratBadan2.add((float)53.2);
		
		System.out.println("ANGKA" +arl1);
		System.out.println("ANGKA" +arl2);
		System.out.println("NAMA" +nama);
		System.out.println("NAMA" +nama2);
		System.out.println("TINGGI BADAN" +tinggiBadan);
		System.out.println("TINGGI BADAN" +tinggiBadan2);
		System.out.println("BERAT BADAN" +beratBadan);
		System.out.println("BERAT BADAN" +beratBadan2);
		
		System.out.println("ANDIANG:" + arl1.isEmpty());
		if (arl1.contains(26))
			System.out.println(" ANGKA 26");
		else{
			System.out.println("ANGKA 26");
		}
		System.out.println("ANDIANG:" + nama.isEmpty());
		if (nama.contains("GAZALI"))
			System.out.println(" ADA GAZALI");
		else{
			System.out.println("TIDAK ADA GAZALI");
		}
		System.out.println("ANDIANG:" + beratBadan.isEmpty());
		if (arl1.contains("56.5"))
			System.out.println("ADA 56.5");
		else{
			System.out.println("TIDAK ADA 56.5");
		}
		System.out.println("ANDIANG:" + tinggiBadan.isEmpty());
		if (arl1.contains("176.2"))
			System.out.println("ADA 176.2 ");
		else{
			System.out.println("TIDAK ADA 176.2");
		}
		System.out.println("ANGKA" +arl1);
		System.out.println("ANGKA" +arl2);
		System.out.println("NAMA" +nama);
		System.out.println("NAMA" +nama2);
		System.out.println("TINGGI BADAN" +tinggiBadan);
		System.out.println("TINGGI BADAN" +tinggiBadan2);
		System.out.println("BERAT BADAN" +beratBadan);
		System.out.println("BERAT BADAN" +beratBadan2);
		System.out.println("LIST-LISTNYA");
		
	}
}
