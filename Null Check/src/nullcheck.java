
public class nullcheck {
public static void main(String[] arg) {
	 
	nullcheck n=new nullcheck();
	n.m((Object)null);
}
	
	void m(Object obj) {
		
		System.out.println("222");
	}
    void m(String str) {
		
		System.out.println("111");
	}
	

}
