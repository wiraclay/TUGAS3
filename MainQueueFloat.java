
public class MainQueueFloat {
	public static void main(String[] args) {
		QueueFloat nomor = new QueueFloat();
		nomor.cetak();
		
		nomor.insert(3.63f);
		nomor.cetak();
		
		nomor.insert(6.3f);
		nomor.cetak();
		
		nomor.insert(9.6f);
		nomor.cetak(); 
		
		Float F1 = nomor.get();
		System.out.println(F1);
		nomor.cetak();
		
		Float F2 = nomor.get();
		System.out.println(F2);
		nomor.cetak();
		
		Float F3 = nomor.get();
		System.out.println(F3);
		nomor.cetak();
		
		Float F4 = nomor.get();
		System.out.println(F4);
		nomor.cetak();
	}
}
