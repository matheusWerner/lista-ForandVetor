import javax.swing.JOptionPane;

public class Exercicio003 {

	public static void main(String[] args) {
		
		
		int qtdRegistros = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de registros"));
		double[] preco = new double[qtdRegistros];
		double precoTotal = 0;
		String texto = "";
		
			
		for(int i = 0; i < qtdRegistros; i++){
			
			preco[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite os pre�os"));
		
		}   
		
		for(int i = 0; i < preco.length; i++){
			
			texto += String.valueOf(preco[i]) + "\n" + "R$ ";
			precoTotal = precoTotal + preco[i];
			
		}
		
		JOptionPane.showMessageDialog(null , "Os pre�os informados s�o: " + "\nR$ " + texto + "O pre�o total dos pre�os �: " + "\nR$ " + precoTotal);

	}

}
