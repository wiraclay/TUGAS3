import java.util.ArrayList;

public class QueueDouble {
	ArrayList<Double> nomor = new ArrayList<Double>();
	int nomorTerakhir = -1;
	
	public void insert(Double value){
		nomorTerakhir++; 
		nomor.add(nomorTerakhir, value);
	}
	
	public Double get(){
		Double value = 0.0d;
		if(!nomor.isEmpty()){
		value = nomor.get(0);
		nomor.remove(0);
		nomorTerakhir--;
		}
		return value;
		
	}
	public void cetak(){
		System.out.println("NOMOR TERAKHIR :" +nomorTerakhir+" NOMOR: "+nomor.toString());
		
	}	
}
