import java.util.ArrayList;

public class StackDouble {
	ArrayList<Double> Double= new ArrayList<Double>();
	int atas = -1;
	
	public void push(Double value){
		atas = atas + 1;
		Double.add(atas, value);
	}
	
	public Double pop(){
		Double value = 0.0d;
		if(!Double.isEmpty()){
			value = Double.get(atas);
			Double.remove(atas);
			atas= atas - 1;
			
		}
		return value;
	}
	
	public void cetak(){
		System.out.println("TOP :" +atas+" # DOUBLE KELAS: "+ Double.toString());
	}
}
