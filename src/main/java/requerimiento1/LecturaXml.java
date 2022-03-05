package requerimiento1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LecturaXml {

	public static void main(String[] args) {
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		DocumentBuilder analizador;
		Document doc;
		Node raiz;

		try {
			analizador = fabrica.newDocumentBuilder();
			doc = analizador.parse("concierto.xml");
			raiz = doc.getDocumentElement();
			recorrerNodos(raiz);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void recorrerNodos(Node raiz) {

		NodeList nodos = raiz.getChildNodes();

		System.out.println("Elementos en el nodo ra�z: " + nodos.getLength());
		System.out.println("---------------");

		Node fecha = nodos.item(0);
		Node hora = nodos.item(1);
		System.out.println("Fecha y hora del concierto: " + fecha.getTextContent() + " " + hora.getTextContent());

		Node participantes = nodos.item(2);
		System.out.println("Participan los siguientes grupos: ");
		recorrerParticipantes(participantes);
	}

	private static void recorrerParticipantes(Node participantes) {

		NodeList nodos = participantes.getChildNodes();

		for (int i = 0; i < nodos.getLength(); i++) {
			Node participante = nodos.item(i);
			Node entrada = participante.getChildNodes().item(0);
			Node grupo = participante.getChildNodes().item(1);
			System.out.println("	" + entrada.getTextContent() + " " + grupo.getTextContent());
		}
	}
}
