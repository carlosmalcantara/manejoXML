package requerimiento2;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import beans.Concierto;
import beans.Participante;

public class LeerXml {

	public static void main(String[] args) {

		try {
			JAXBContext contexto = JAXBContext.newInstance(Concierto.class);
			Unmarshaller u = contexto.createUnmarshaller();
			File fichero = new File("concierto.xml");
			if (fichero.exists()) {
				Concierto c = (Concierto) u.unmarshal(fichero);
				System.out.println(c.getFecha());
				System.out.println(c.getHora());
				for (Participante p: c.getParticipantes()) {
					System.out.println(p.toString());
				}
			} else {
				System.out.println("Fichero XML concierto.xml no encontrado");
			}

		} catch (JAXBException e) {
			System.out.println(e.getMessage());
		}
	}
}


	
