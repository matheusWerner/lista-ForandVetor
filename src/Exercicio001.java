import javax.swing.JOptionPane;

public class Exercicio001 {

	public static void main(String[] args) {
		
		String[] armazena = new String[25];
		String resultado = "";
		
		for(int i = 0; i <= 24; i++){
			
			
			armazena[i] = JOptionPane.showInputDialog("Insira seu nome");
		}
		
		for(int i = 0; i <= 24; i++){
			
			
			resultado = resultado + " " + armazena[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, "Os nomes armazenados são: " + resultado);
		
		
		
		

	}

}
