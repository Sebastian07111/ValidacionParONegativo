
	import javax.swing.JOptionPane;



	class Numeros {
		int numero;
		int i,neg=0,par=0;
		public void entrada() {
			for (i = 0; i < 5; i++) {
				numero=ingresarDatos("digite 1 numero");
				if(numero%2==0) {
					par++;
				}
				if(numero<0){
					neg++;
				}		
			}
			
			JOptionPane.showMessageDialog(null,"numeros pares"+par+"\n"+
			"numeros negativos " + neg);
		}
		
		public static int ingresarDatos(String mensaje) {
			String cadena;
			int valor;
			cadena=JOptionPane.showInputDialog(null,mensaje);
			valor=Integer.parseInt(cadena);
			return valor;
		}
	}
	
	

