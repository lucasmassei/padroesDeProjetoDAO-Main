package Default;

import javax.swing.JOptionPane;

public class App {

        public static void main
        (String[] args) {
        	Customer os = new Customer();
        	CustomerDAO dao = new CustomerDAO();
  		
			int op=0;
		
			
			do{
				
				op=Integer.parseInt(JOptionPane.showInputDialog( "1-Inserir" + '\n' +
				                                                 "2-Listar Dados" + '\n'+
				                                                 "3-Mostrar Cliente" + '\n'+
				                                                 "4-Editar"+ '\n'+
				                                                 "5-Deletar \n"+
				                                                 "6-Sair" +'\n'));
				
				switch(op){
					case 1:
						   dao.insert(os);
					       break;
					case 2:
						   dao.selectAll();
				           break;
					case 3:
						   dao.selectId();
						   break;
					case 4:dao.update(os);
						   break;
					case 5:
						   dao.delete(os);
					       break;
			}}while(op!=6);
			
			System.exit(0);	
	}
}