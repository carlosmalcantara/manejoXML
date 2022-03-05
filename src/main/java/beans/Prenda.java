package beans;

import javax.xml.bind.annotation.XmlType;

@XmlType (propOrder = {"tejido", "color"})
public class Prenda {

	private String tejido;
	private String color;
	
	public Prenda() {
		super();
	}

	public Prenda(String tejido, String color) {
		super();
		this.tejido = tejido;
		this.color = color;
	}

	public String getTejido() {
		return tejido;
	}

	public void setTejido(String tejido) {
		this.tejido = tejido;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Prenda [tejido=" + tejido + ", color=" + color + "]";
	}

	
}
