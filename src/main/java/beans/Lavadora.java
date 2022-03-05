package beans;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Lavadora {

	private String fecha;
	private String hora;
	
	private List<Prenda> prendas;

	public Lavadora() {
		super();
	}

	public Lavadora(String fecha, String hora, List<Prenda> prendas) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.prendas = prendas;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	@XmlElementWrapper(name = "cesto")
	public List<Prenda> getCarga() {
		return prendas;
	}

	@XmlElement(name="prenda")
	public void setCarga(List<Prenda> prendas) {
		this.prendas = prendas;
	}

	@Override
	public String toString() {
		return "Lavadora [fecha=" + fecha + ", hora=" + hora + ", carga=" + prendas + "]";
	}



}
