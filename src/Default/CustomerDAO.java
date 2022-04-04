package Default;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CustomerDAO {
	private Connection conexao;
	
	public CustomerDAO() {
		this.conexao = new ConnectionFactory().getConnection();
	}
	
	public void insert (Customer os) {

			String sql = "insert into customer ( CompanyName, ContactName, ContactTitle, Address, City, Region, PostalCode, Country, "
					+ "Phone, Fax) values (?,?,?,?,?,?,?,?,?,?)";
	
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, JOptionPane.showInputDialog("Digite o Nome do Cliente: "));
			stmt.setString(2, JOptionPane.showInputDialog("Digite o Local de Trabalho: "));
			stmt.setString(3, JOptionPane.showInputDialog("Digite o um Nome de Contato: "));
			stmt.setString(4, JOptionPane.showInputDialog("Digite o Endereco: "));
			stmt.setString(5, JOptionPane.showInputDialog("Digite a Cidade: "));
			stmt.setString(6, JOptionPane.showInputDialog("Digite o Bairro: "));
			stmt.setString(7, JOptionPane.showInputDialog("Digite o CEP: "));
			stmt.setString(8, JOptionPane.showInputDialog("Digite o Pais: "));
			stmt.setString(9, JOptionPane.showInputDialog("Digite o Telefone: "));
			stmt.setString(10, JOptionPane.showInputDialog("Digite o Fax: "));
					
			stmt.execute();
			stmt.close();
			
		}
		catch(SQLException e) {
			e.getMessage();
		}
	}

	public void delete (Customer os) {

			String sql = "delete from customer where CustomerID =  (?)";
	
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, JOptionPane.showInputDialog("Digite o Código do Cliente que deseja deletar: "));
			stmt.execute();
			stmt.close();
			
		}
		catch(SQLException e) {
			e.getMessage();
		}
	}

	public void update (Customer os) {

		String sql = "UPDATE customer SET PostalCode = (?) where CustomerID = (?)";
		

	try {
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(2, JOptionPane.showInputDialog("Digite o ID do Cliente que deseja Alterar o CEP: "));
		stmt.setString(1, JOptionPane.showInputDialog("Digite o novo CEP do Cliente: "));
		
		stmt.execute();
		stmt.close();
		
	}
	catch(SQLException e) {
		e.getMessage();
	}
}
	
	public void selectAll() {
		String sql = "select * from customer";
		
		List<Customer> lista = new ArrayList<Customer>();
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				 int    CustomerID  = rs.getInt("CustomerID");
			     String CompanyName = rs.getString("CompanyName");
				 String ContactName = rs.getString("ContactName");
				 String ContactTitle = rs.getString("ContactTitle");
				 String Address = rs.getString("Address");
				 String City = rs.getString("City");
				 String Region = rs.getString("Region");
				 String PostalCode = rs.getString("PostalCode");
				 String Country = rs.getString("Country");
				 String Phone = rs.getString("Phone");
				 String Fax = rs.getString("Fax");
				
				Customer os = new Customer();
				
				os.setCustomerID(CustomerID);
				os.setCompanyName(CompanyName);
				os.setContactName(ContactName);
				os.setContactTitle(ContactTitle);
				os.setAddress(Address);
				os.setCity(City);
				os.setRegion(Region);
				os.setPostalCode(PostalCode);
				os.setCountry(Country);
				os.setPhone(Phone);
				os.setFax(Fax);
				
				lista.add(os);
			}
			
			rs.close();
			stmt.close();
			
			//imprimir a lista
			for (Customer status : lista) {
				
				System.out.println(
					    "CustomerID: " + status.getCustomerID()+ " "+
		                "CompanyName: "+ status.getCompanyName()+ " "+
					    "ContactName: "+ status.getContactName()+ " "+
					    "ContactTitle: "+status.getContactTitle()+ " "+
					    "Address: "+ status.getAddress()+ " "+
					    "City: "+ status.getCity()+ " "+
					    "Region: "+ status.getRegion()+ " "+
					    "PostalCode: "+ status.getPostalCode()+ " "+
					    "Country: "+ status.getCountry()+ " "+
					    "Phone: "+ status.getPhone()+ " "+
					    "Fax: "+ status.getFax());

			}
						
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void selectId() {
		String numero;
		int number;
		
		numero = JOptionPane.showInputDialog("Digite o ID do Cliente: ");
		number = Integer.parseInt(numero);
		String sql = "select * from customer where CustomerID = " + number;
		
		
		List<Customer> lista = new ArrayList<Customer>();
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				 int    CustomerID  = rs.getInt("CustomerID");
			     String CompanyName = rs.getString("CompanyName");
				 String ContactName = rs.getString("ContactName");
				 String ContactTitle = rs.getString("ContactTitle");
				 String Address = rs.getString("Address");
				 String City = rs.getString("City");
				 String Region = rs.getString("Region");
				 String PostalCode = rs.getString("PostalCode");
				 String Country = rs.getString("Country");
				 String Phone = rs.getString("Phone");
				 String Fax = rs.getString("Fax");
				
				Customer os = new Customer();
				
				os.setCustomerID(CustomerID);
				os.setCompanyName(CompanyName);
				os.setContactName(ContactName);
				os.setContactTitle(ContactTitle);
				os.setAddress(Address);
				os.setCity(City);
				os.setRegion(Region);
				os.setPostalCode(PostalCode);
				os.setCountry(Country);
				os.setPhone(Phone);
				os.setFax(Fax);
				
				lista.add(os);
			}
			
			rs.close();
			stmt.close();
			
			//imprimir a lista
			for (Customer status : lista) {
				
				System.out.println(
			            "CustomerID: " + status.getCustomerID()+ " "+
		                "CompanyName: "+ status.getCompanyName()+ " "+
					    "ContactName: "+ status.getContactName()+ " "+
					    "ContactTitle: "+status.getContactTitle()+ " "+
					    "Address: "+ status.getAddress()+ " "+
					    "City: "+ status.getCity()+ " "+
					    "Region: "+ status.getRegion()+ " "+
					    "PostalCode: "+ status.getPostalCode()+ " "+
					    "Country: "+ status.getCountry()+ " "+
					    "Phone: "+ status.getPhone()+ " "+
					    "Fax: "+ status.getFax());

			}
						
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void selectLike() {
		String sql = "select * from customer where CompanyName LIKE '%SOMA%'";
		
		List<Customer> lista = new ArrayList<Customer>();
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				 int    CustomerID  = rs.getInt("CustomerID");
			     String CompanyName = rs.getString("CompanyName");
				 String ContactName = rs.getString("ContactName");
				 String ContactTitle = rs.getString("ContactTitle");
				 String Address = rs.getString("Address");
				 String City = rs.getString("City");
				 String Region = rs.getString("Region");
				 String PostalCode = rs.getString("PostalCode");
				 String Country = rs.getString("Country");
				 String Phone = rs.getString("Phone");
				 String Fax = rs.getString("Fax");
				
				Customer os = new Customer();
				
				os.setCustomerID(CustomerID);
				os.setCompanyName(CompanyName);
				os.setContactName(ContactName);
				os.setContactTitle(ContactTitle);
				os.setAddress(Address);
				os.setCity(City);
				os.setRegion(Region);
				os.setPostalCode(PostalCode);
				os.setCountry(Country);
				os.setPhone(Phone);
				os.setFax(Fax);
				
				lista.add(os);
			}
			
			rs.close();
			stmt.close();
			
			//imprimir a lista
			for (Customer status : lista) {
				
				System.out.println(
			            "CustomerID: " + status.getCustomerID()+ " "+
		                "CompanyName: "+ status.getCompanyName()+ " "+
					    "ContactName: "+ status.getContactName()+ " "+
					    "ContactTitle: "+status.getContactTitle()+ " "+
					    "Address: "+ status.getAddress()+ " "+
					    "City: "+ status.getCity()+ " "+
					    "Region: "+ status.getRegion()+ " "+
					    "PostalCode: "+ status.getPostalCode()+ " "+
					    "Country: "+ status.getCountry()+ " "+
					    "Phone: "+ status.getPhone()+ " "+
					    "Fax: "+ status.getFax());

			}
						
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}