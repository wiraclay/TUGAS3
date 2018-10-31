
public class MainQueueGeneric {
	public static void main(String[] args){
		QueueGeneric QGT = new QueueGeneric();
	    QGT.insert("SATU");
	    QGT.insert("DUA");
	    QGT.insert("TIGA");
	    
	    System.out.println("HASIL QUEUE TIPE GENERIC :");
	    System.out.println(QGT.remove());
	    System.out.println(QGT.remove());
	    System.out.println(QGT.remove());
	    System.out.println(QGT.remove());
	}
}
