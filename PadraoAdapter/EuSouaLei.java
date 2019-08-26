
public class EuSouaLei {
	
	public static void main(String[] args) {
		EntradaUSB usb = new EntradaUSB();
		TvDigital lg = new TvDigital();
		
		AdaptadorHDMItoUSB comida = new AdaptadorHDMItoUSB(usb);
		
		lg.Inserir(comida);
		
	}

}
