import java.util.ArrayList;

public class ArrayListDouble {

	public static void main(String[] args) {
		
		System.out.println("TINGGI BADAN MAHASISWA");
		System.out.println("WIRA,MUFLI,ALFIAN,RUSMAN");
		
		ArrayList<Double> tinggiBadan= new ArrayList<Double>();
		tinggiBadan.add(183.3);
		tinggiBadan.add(160.4);
		tinggiBadan.add(173.5);
		tinggiBadan.add(165.6);
		System.out.println(tinggiBadan);
		
		tinggiBadan.remove(2);
		System.out.println(tinggiBadan);
		
		ArrayList<Double> tinggiBadan2= (ArrayList<Double>)tinggiBadan.clone();
		tinggiBadan2.add(179.2);
		System.out.println("TINGGI BADAN" +tinggiBadan);
		System.out.println("TINGGI BADAN" +tinggiBadan2);
		
		System.out.println("ANDIANG:" + tinggiBadan2.isEmpty());
		if (tinggiBadan.contains(183.3))
			System.out.println(" ADA 183.3");
		else{
			System.out.println("TIDAK ADA 183.3");
		}
		System.out.println("TINGGI BADAN" +tinggiBadan);
		System.out.println("TINGGI BADAN" +tinggiBadan2);
		System.out.println("SIAPA PALING TINGGI");
		System.out.println("CEH I WIRA LAGI");

	}

}
