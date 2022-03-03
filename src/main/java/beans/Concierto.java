package beans;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Concierto {

	private String fecha;
	private String hora;
	
	private List<Participante> participantes;

	public Concierto() {
		super();
	}

	public Concierto(String fecha, String hora, List<Participante> participantes) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.participantes = participantes;
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

	public List<Participante> getParticipantes() {
		return participantes;
	}

	@XmlElement(name="participante")
	public void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}

	@Override
	public String toString() {
		return "Concierto [fecha=" + fecha + ", hora=" + hora + ", participantes=" + participantes + "]";
	}
	
	
}
