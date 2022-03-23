package Default;


public class selectComand {

	public static void main(String[] args) {
		CustomerDAO dao = new CustomerDAO();
		System.out.println(" **************************** RODANDO SELECT ALL ****************************\n");
		dao.selectAll();
		System.out.println("\n **************************** RODANDO SELECT ID ****************************\n");
		dao.selectId();
		System.out.println("\n **************************** RODANDO SELECT LIKE ****************************\n");
		dao.selectLike();
	}
}