package beans;

import javax.xml.bind.annotation.XmlType;

@XmlType (propOrder = {"entrada", "grupo"})
public class Participante {

	private String entrada;
	private String grupo;
	
	public Participante() {
		super();
	}
	public Participante(String entrada, String grupo) {
		super();
		this.entrada = entrada;
		this.grupo = grupo;
	}
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	@Override
	public String toString() {
		return "Participante [entrada=" + entrada + ", grupo=" + grupo + "]";
	}
	
	
}
