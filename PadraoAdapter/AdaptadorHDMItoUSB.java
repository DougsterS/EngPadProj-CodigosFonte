
public class AdaptadorHDMItoUSB extends EntradaHDMI{
	
	private EntradaUSB adaptar;
	
	public AdaptadorHDMItoUSB(EntradaUSB adaptar){
		this.adaptar = adaptar;
	}
	
	public void conectarHDMI(){
		adaptar.conectarUSB();
		System.out.println("Em uma entrada HDMI!!");
	}

}
