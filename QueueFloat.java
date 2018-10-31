import java.util.ArrayList;

public class QueueFloat {
	ArrayList<Float> nomor = new ArrayList<Float>();
	int akhir = -1;
	
	public void insert(Float value){
		akhir++; //=akhir + 1;
		nomor.add(akhir, value);
	}
	
	public Float get(){
		Float value = 0.0f;
		if(!nomor.isEmpty()){
		value = nomor.get(0);
		nomor.remove(0);
		akhir--;
		}
		return value;
		
	}
	public void cetak(){
		System.out.println("Akhir :" +akhir+" NOMOR : "+nomor.toString());
	}
}
