import java.util.ArrayList;

public class ArrayListFloat {
	
	public static void main(String[] args) {
		
		System.out.println("BERAT BADAN MAHASISWA");
		System.out.println("AQIL,MUFLI,WIRA,RUSMAN");
		
		ArrayList<Float> beratBadan= new ArrayList<Float>();
		beratBadan.add((float)45.6);
		beratBadan.add((float)65.7);
		beratBadan.add((float)83.9);
		beratBadan.add((float)76.8);
		System.out.println(beratBadan);
		
		beratBadan.remove(2);
		System.out.println(beratBadan);
		
		ArrayList<Float> beratBadan2= (ArrayList<Float>)beratBadan.clone();
		beratBadan2.add((float)65.4);
		System.out.println("BERAT BADAN" +beratBadan);
		System.out.println("BERAT BADAN" +beratBadan2);
		
		System.out.println("MAWE'I DI:" + beratBadan.isEmpty());
		if (beratBadan.contains(45.6))
			System.out.println(" DIANG DI NOMOR 45.6");
		else{
			System.out.println("ANDIANG NOMOR 45.6 ");
		}
		System.out.println("BERAT BADAN" +beratBadan);
		System.out.println("BERAT BADAN" +beratBadan2);
		System.out.println("DIANGDI PALAKA");
		System.out.println("WIRA KAMENANG MAMBE'I");
			
		
	}

}


