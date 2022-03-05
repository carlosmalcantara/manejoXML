package requerimiento1;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class Principal {

	public static void main(String[] args) {

		try {

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			DOMImplementation implementation = builder.getDOMImplementation();

			Document document = implementation.createDocument(null, "concierto", null);
			document.setXmlVersion("1.0");

			Element fecha = document.createElement("fecha");
			Text textFecha = document.createTextNode("20-oct-2018");
			fecha.appendChild(textFecha);
			document.getDocumentElement().appendChild(fecha);

			Element hora = document.createElement("hora");
			Text textHora = document.createTextNode("21:30");
			hora.appendChild(textHora);
			document.getDocumentElement().appendChild(hora);
			
			Element participantes = document.createElement("participantes");
			
			Element participante = document.createElement("participante");
			
			Element entrada = document.createElement("entrada");
			Text textEntrada = document.createTextNode("21:30");
			entrada.appendChild(textEntrada);
			participante.appendChild(entrada);
			
			Element grupo = document.createElement("grupo");
			Text textGrupo = document.createTextNode("Las ardillas de Dakota");
			grupo.appendChild(textGrupo);
			participante.appendChild(grupo);
			
			participantes.appendChild(participante);
			
			participante = document.createElement("participante");
			
			entrada = document.createElement("entrada");
			textEntrada = document.createTextNode("22:15");
			entrada.appendChild(textEntrada);
			participante.appendChild(entrada);
			
			grupo = document.createElement("grupo");
			textGrupo = document.createTextNode("Fito y Fitipaldis");
			grupo.appendChild(textGrupo);
			participante.appendChild(grupo);
			
			participantes.appendChild(participante);
			
			participante = document.createElement("participante");
			
			entrada = document.createElement("entrada");
			textEntrada = document.createTextNode("23:00");
			entrada.appendChild(textEntrada);
			participante.appendChild(entrada);
			
			grupo = document.createElement("grupo");
			textGrupo = document.createTextNode("Coldplay");
			grupo.appendChild(textGrupo);
			participante.appendChild(grupo);
			
			participantes.appendChild(participante);
			
			document.getDocumentElement().appendChild(participantes);


			Source source = new DOMSource(document);
			Result result = new StreamResult(new File("concierto.xml"));

			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);
			
			System.out.println("Fichero XML creado.");

		} catch (ParserConfigurationException | TransformerException e) {
			System.out.println(e.getMessage());
		}
	}

}
