import javax.swing.JOptionPane;

public class Exercicio004 {

	public static void main(String[] args) {
		
		String[] tamanho = new String[5];
		
		
		for(int i = 0; i <= 4; i++){
			
			tamanho[i] = JOptionPane.showInputDialog("Informe o tamanho da camisa");
			
		}


	}

}
