package javaPackage;

public class Loop2 {

	public static void main(String[] args) {
		int i[] = {1,2,3};
		String b[] = {"gf","fvrst","dgr"};
		Object a[]= {"Java", 3,5, "x", 10>5};
		boolean v []= {5>6, 7<=8};
		System.out.println(i[0]);
		System.out.println(b[1]);
		System.out.println("   " +v[1]);
		
		//printing an array using for each loop OR traversing an array ***ForEechLoop***
		//for(dataType var: arrayref) {
		//executable code
		//}
		for (Object o: a) {
			System.out.println(o);
		}
		for(String s:b) {
			System.out.println(s);
		}
		for(int u:i) {
			System.out.println(u);
		}

}
}