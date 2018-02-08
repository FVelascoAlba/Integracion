
public class Coche {
	private String marca, modelo, color, año;
	private double precio;
	private int stock;

	public Coche(String marca, String modelo, String color, String año, double precio, int stock) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.año = año;
		this.precio = precio;
		this.stock = stock;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
