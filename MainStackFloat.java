
public class MainStackFloat {
	public static void main(String[] args) {
		StackFloat Float = new StackFloat();
		Float.cetak();
		
		Float.push(3.63f);
		Float.cetak();
		
		Float.push(6.3f);
		Float.cetak();
		
		Float.push(9.3f);
		Float.cetak();
		
		Float out = Float.pop();
		System.out.println(out);
		Float.cetak();
		
		Float out1 = Float.pop();
		System.out.println(out1);
		Float.cetak();
		
		Float out2 = Float.pop();
		System.out.println(out2);
		Float.cetak();
		
	}
}
