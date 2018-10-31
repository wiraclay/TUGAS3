
public class MainQueueDouble {
	public static void main(String[] args) {
		QueueDouble nomor = new QueueDouble();
		nomor.cetak();
		
		nomor.insert(5.666666666d);
		nomor.cetak();
		
		nomor.insert(4.777777777d);
		nomor.cetak();
		
		nomor.insert(6.999999d);
		nomor.cetak(); 
		
		Double n1 = nomor.get();
		System.out.println(n1);
		nomor.cetak();
		
		Double n2 = nomor.get();
		System.out.println(n2);
		nomor.cetak();
		
		Double n3 = nomor.get();
		System.out.println(n3);
		nomor.cetak();
		
		Double n4 = nomor.get();
		System.out.println(n4);
		nomor.cetak();
	}
}
