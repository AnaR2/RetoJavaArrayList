
public class Students {

	private String nombre;
	private int carnet;
	private int creditos;
	private int valorCredito;
	private float porcentajeDescuento;
	
	

	public Students() {
		
		nombre="";
		carnet= 0;
		creditos= 0;
		valorCredito= 0;
		porcentajeDescuento= 0f;
	}


	public Students(int creditos, int valorCredito, float porcentajeDescuento) {
		super();
		this.creditos = creditos;
		this.valorCredito = valorCredito;
		this.porcentajeDescuento = porcentajeDescuento;
	}

	
	
	public Students(String nombre, int carnet, int creditos, int valorCredito, float porcentajeDescuento) {
		super();
		this.nombre = nombre;
		this.carnet = carnet;
		this.creditos = creditos;
		this.valorCredito = valorCredito;
		this.porcentajeDescuento = porcentajeDescuento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCarnet() {
		return carnet;
	}


	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}


	public int getCreditos() {
		return creditos;
	}


	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}


	public int getValorCredito() {
		return valorCredito;
	}


	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}


	public float getPorcentajeDescuento() {
		return porcentajeDescuento;
	}


	public void setPorcentajeDescuento(float porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}


	@Override
	public String toString() {
		return "Students [nombre=" + nombre + ", carnet=" + carnet + ", creditos=" + creditos + ", valorCredito="
				+ valorCredito + ", porcentajeDescuento=" + porcentajeDescuento + "]";
	}
	
	
	public int TotalPago() {
		
		float total= 0f;
		
		total= this.creditos*this.valorCredito-((this.creditos*this.valorCredito)*(this.porcentajeDescuento/100));
		return (int)total;
	}

}
