package Default;


public class insertComand {

	public static void main(String[] args) {
		Customer os = new Customer();
		CustomerDAO dao = new CustomerDAO();
		
        os.setCompanyName("Somativa");
		os.setContactName("Empresa");
		os.setContactTitle("Telefone ");
		os.setAddress("Av. ");
		os.setCity("Ribeir�o Preto");
		os.setRegion("S�o Paulo");
		os.setPostalCode("14100-010");
		os.setCountry("Brasil");
		os.setPhone("(16) 7070-7070");
		os.setFax("N�o tem");
		
		
		
		dao.insert(os);
	}

}