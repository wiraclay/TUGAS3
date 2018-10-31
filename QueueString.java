
public class QueueString {
	public static void main(String[] args) {
		MainQueueString q = new MainQueueString();
		q.cetak();
		
		q.insert("Wira");
		q.cetak();
		
		q.insert("Gazali");
		q.cetak();
		
		q.insert("Rusman");
		q.cetak(); 
		
		String o1 = q.get();
		System.out.println(o1);
		q.cetak();
		
		String o2 = q.get();
		System.out.println(o2);
		q.cetak();
		
		String o3 = q.get();
		System.out.println(o3);
		q.cetak();
		
		String o4 = q.get();
		System.out.println(o4);
		q.cetak();
	

	}
}
