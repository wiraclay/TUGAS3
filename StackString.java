
public class StackString {
	public static void main(String[] args) {
		MainStackString st = new MainStackString();
		st.cetak();
		
		st.push("Wira");
		st.cetak();
		
		st.push("Rusman");
		st.cetak();
		
		st.push("Gazali");
		st.cetak();
		
		String d1 = st.pop();
		System.out.println(d1);
		st.cetak();
		
		String d2 = st.pop();
		System.out.println(d2);
		st.cetak();
		
		String d3 = st.pop();
		System.out.println(d3);
		st.cetak();
		
		String d500 = st.pop();
		System.out.println(d500);
		st.cetak();
	}
}
