package giuseppecanzoneri.u5d14es2.main;

import java.util.ArrayList;
import java.util.List;

import giuseppecanzoneri.u5d14es2.composite.Book;
import giuseppecanzoneri.u5d14es2.composite.Page;
import giuseppecanzoneri.u5d14es2.composite.Section;

public class Main {
	public static void main(String[] args) {
		// Creazione di un libro con due autori e prezzo 19.99
		List<String> authors = new ArrayList<>();
		authors.add("Autore1");
		authors.add("Autore2");
		Book book = new Book("Il mio libro", authors, 19.99);

		// Creazione di alcune pagine con contenuto
		Page page1 = new Page(10,
				"Al calar della notte, nell'ombrosa dimora sussurra un'intrigante storia di passione,"
						+ " segreti e destini intrecciati, mentre"
						+ " l'amore nasce tra i protagonisti, spinti dalla forza del coraggio e dell'avventura.");
		Page page2 = new Page(15,
				"Nel buio della notte, l'amore e il mistero si fondono, svelando segreti nascosti e cambiando destini.");
		Page page3 = new Page(8,
				"Nell'abisso dell'anima, si celano segreti che plasmano il destino, mentre l'amore brucia come fiamma eterna.");

		// Creazione di una sezione e aggiunta di pagine
		Section section1 = new Section("Sezione 1");
		section1.addPage(page1);
		section1.addPage(page2);

		// Creazione di un'altra sezione e aggiunta di pagine
		Section section2 = new Section("Sezione 2");
		section2.addPage(page3);

		// Aggiunta delle sezioni al libro
		book.addSection(section1);
		book.addSection(section2);

		// Stampa il numero totale di pagine del libro
		System.out.println("Numero totale di pagine del libro: " + book.getTotalPages());

		// Stampa il libro intero
		book.printBook();

		// Stampa una singola pagina
//		book.printPage(page2);
	}
}
