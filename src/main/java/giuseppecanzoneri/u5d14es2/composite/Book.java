package giuseppecanzoneri.u5d14es2.composite;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private List<String> authors;
	private double price;
	private List<Page> pages;
	private List<Section> sections;

	public Book(String title, List<String> authors, double price) {
		this.title = title;
		this.authors = authors;
		this.price = price;
		this.pages = new ArrayList<>();
		this.sections = new ArrayList<>();
	}

	public void addPage(Page page) {
		pages.add(page);
	}

	public void removePage(Page page) {
		pages.remove(page);
	}

	public void addSection(Section section) {
		sections.add(section);
	}

	public void removeSection(Section section) {
		sections.remove(section);
	}

	public List<String> getAuthors() {
		return authors;
	}

	public double getPrice() {
		return price;
	}

	public int getTotalPages() {
		int total = 0;
		for (Page page : pages) {
			total += page.getPageCount();
		}
		for (Section section : sections) {
			total += section.getTotalPages();
		}
		return total;
	}

	public String getTitle() {
		return title;
	}

	public void printPage(Page page) {
		System.out.println("Printing page: " + page.getPageContent());
	}

	public void printBook() {
		System.out.println("Printing book: " + title);
		for (Page page : pages) {
			System.out.println("Printing page: " + page.getPageContent());
		}
		for (Section section : sections) {
			printSection(section);
		}
	}

	private void printSection(Section section) {
		System.out.println("Printing section: " + section.getSectionTitle());
		List<Page> sectionPages = section.getPages();
		for (Page page : sectionPages) {
			System.out.println("Printing page: " + page.getPageContent());
		}
		List<Section> subsections = section.getSubsections();
		for (Section subsection : subsections) {
			printSection(subsection);
		}
	}
}
