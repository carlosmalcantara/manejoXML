package requerimiento2;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import beans.Lavadora;
import beans.Prenda;

public class Principal {

	public static void main(String[] args) {
		CrearXml();
	}

	public static void CrearXml() {

		List<Prenda> cesto = new ArrayList<Prenda>();

		Prenda prenda = new Prenda();
		prenda.setTejido("algodon");
		prenda.setColor("blanco");

		cesto.add(prenda);

		prenda = new Prenda();
		prenda.setTejido("polyester");
		prenda.setColor("color");

		cesto.add(prenda);

		prenda = new Prenda();
		prenda.setTejido("algodon");
		prenda.setColor("color");

		cesto.add(prenda);

		Lavadora lavado = new Lavadora();
		lavado.setFecha("20-oct-2018");
		lavado.setHora("21:30");
		lavado.setCarga(cesto);

		try {
			JAXBContext ctx = JAXBContext.newInstance(Lavadora.class);
			Marshaller ms = ctx.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			ms.marshal(lavado, new File("lavadora.xml"));
			System.out.println("Archivo XML creado. Yipi ka yei.");
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
