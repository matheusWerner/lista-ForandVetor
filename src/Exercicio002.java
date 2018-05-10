import javax.swing.JOptionPane;

public class Exercicio002 {

	public static void main(String[] args) {
		

           int[] idades = new int[7];
           String apresenta = "";
           
           for(int i = 0; i <= 6; i++){
        	   
        	  idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        	  
        	  
           }
           
           for(int i = 0; i <= 6; i++){
        	   
        	   apresenta += String.valueOf(idades[i]) + "\n";
           }
           
           JOptionPane.showMessageDialog(null, apresenta);
           
           
		
		
		
	}

}
