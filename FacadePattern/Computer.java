
public class Computer {
	
	private CPU proc = new CPU();
	private Memory memoria = new Memory();
	private HD dr = new HD();
	
	public void usarProc() {
		this.proc.usarCPU();
	}
	
	public void usarM() {
		this.memoria.usarMemoria();
	}
	
	public void usarH() {
		this.dr.usarHD();
	}
	

}
