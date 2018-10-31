import java.util.ArrayList;

public class MainStackString {
	ArrayList<String> Kageunsin = new ArrayList<String>();
	int top = -1;
	
	public void push(String value){
		top = top + 1;
		Kageunsin.add(top, value);
	}
	
	public String pop(){
		String value = "ANDIANG MO LAENNA";
		if(!Kageunsin.isEmpty()){
			value = Kageunsin.get(top);
			Kageunsin.remove(top);
			top = top - 1;
			
		}
		return value;
	}
	
	public void cetak(){
		System.out.println("TOP :" +top+" # KAGEBUNSIN : "+Kageunsin.toString());
	}
}
