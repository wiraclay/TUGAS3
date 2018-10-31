import java.util.ArrayList;

public class MainQueueString {
	ArrayList<String> kagebunsin = new ArrayList<String>();
	int ecor = -1;
	
	public void insert(String value){
		ecor++; //=ecor + 1;
		kagebunsin.add(ecor, value);
	}
	
	public String get(){
		String value = "CAPPUMI";
		if(!kagebunsin.isEmpty()){
		value = kagebunsin.get(0);
		kagebunsin.remove(0);
		ecor--;
		}
		return value;
		
	}
	public void cetak(){
		System.out.println("ECOR :" +ecor+" # KAGEBUNSIN: "+kagebunsin.toString());
	}
}
