import java.util.ArrayList;

public class StackFloat {
	ArrayList<Float> nomor = new ArrayList<Float>();
	int top = -1;
	
	public void push(Float value){
		top = top + 1;
		nomor.add(top, value);
	}
	
	public Float pop(){
		Float value = 0.0f;
		if(!nomor.isEmpty()){
			value = nomor.get(top);
			nomor.remove(top);
			top = top - 1;
			
		}
		return value;
	}
	
	public void cetak(){
		System.out.println("TOP :" +top+" # NOMOR: "+ nomor.toString());
	}
}
