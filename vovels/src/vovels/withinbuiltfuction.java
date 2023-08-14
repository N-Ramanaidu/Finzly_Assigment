package vovels;

public class withinbuiltfuction {
	public static void main(String[] args) {
		String str = "gffg";
		str = str.toLowerCase();
		if(str.contains("a")&&str.contains("e")&&str.contains("i")&&str.contains("o")&&str.contains("u")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
