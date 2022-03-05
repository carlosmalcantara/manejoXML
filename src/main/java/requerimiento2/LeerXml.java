package requerimiento2;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import beans.Lavadora;
import beans.Prenda;

public class LeerXml {

	public static void main(String[] args) {

		try {
			JAXBContext contexto;

			contexto = JAXBContext.newInstance(Lavadora.class);

			Unmarshaller u;
			u = contexto.createUnmarshaller();

			File fichero = new File("lavadora.xml");
			if (fichero.exists()) {
				Lavadora lavadora;
				lavadora = (Lavadora) u.unmarshal(fichero);

				System.out.println(lavadora.getFecha());
				System.out.println(lavadora.getHora());
				for (Prenda p : lavadora.getCarga()) {
					System.out.println(p.toString());
				}
			}

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
