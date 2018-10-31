
public class MainStackDouble {
	public static void main(String[] args) {
		StackDouble Double = new StackDouble();
		Double.cetak();
		
		Double.push(3.363d);
		Double.cetak();
		
		Double.push(4.455678d);
		Double.cetak();
		
		Double.push(56.6767755d);
		Double.cetak();
		
		Double D1 = Double.pop();
		System.out.println(D1);
		Double.cetak();
		
		Double D2 = Double.pop();
		System.out.println(D2);
		Double.cetak();
		
		Double D3 = Double.pop();
		System.out.println(D3);
		Double.cetak();
		
		Double D4 = Double.pop();
		System.out.println(D4);
		Double.cetak();
		
	}
}
