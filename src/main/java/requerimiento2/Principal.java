package requerimiento2;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import beans.Concierto;
import beans.Participante;

public class Principal {

	public static void main(String[] args) {
		CrearXml();
	}

	public static void CrearXml() {

		List<Participante> participantes = new ArrayList<Participante>();

		Participante participante = new Participante();
		participante.setEntrada("21:30");
		participante.setGrupo("Las ardillas de Dakota");

		participantes.add(participante);

		participante = new Participante();
		participante.setEntrada("22:15");
		participante.setGrupo("Fito y Fitipaldis");

		participantes.add(participante);

		participante = new Participante();
		participante.setEntrada("23:00");
		participante.setGrupo("Coldplay");

		participantes.add(participante);

		Concierto concierto = new Concierto();
		concierto.setFecha("20-oct-2018");
		concierto.setHora("21:30");
		concierto.setParticipantes(participantes);

		try {
			JAXBContext ctx = JAXBContext.newInstance(Concierto.class);
			Marshaller ms = ctx.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			ms.marshal(concierto, new File("concierto.xml"));
			System.out.println("Archivo XML creado. Yipi ka yei.");
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
