
public class testLivre {
	public static void main(String[] args) {
		Livre L0 = new Livre();
		System.out.println(L0);
		Livre L1 = new Livre("Harry Potter", 15.99f, 3);
		System.out.println(L1);
		System.out.println(L1.getName());
		System.out.println(L1.getPrice());
		System.out.println(L1.getQty());
		L1.setQty(3);
		System.out.println(L1.getQty());
	}
}
