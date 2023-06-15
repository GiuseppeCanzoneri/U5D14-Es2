package giuseppecanzoneri.u5d14es2.composite;

import java.util.ArrayList;
import java.util.List;

public class Section {
	private String sectionTitle;
	private List<Page> pages;
	private List<Section> subsections;

	public Section(String sectionTitle) {
		this.sectionTitle = sectionTitle;
		this.pages = new ArrayList<>();
		this.subsections = new ArrayList<>();
	}

	public void addPage(Page page) {
		pages.add(page);
	}

	public void removePage(Page page) {
		pages.remove(page);
	}

	public void addSubsection(Section subsection) {
		subsections.add(subsection);
	}

	public void removeSubsection(Section subsection) {
		subsections.remove(subsection);
	}

	public int getTotalPages() {
		int total = 0;
		for (Page page : pages) {
			total += page.getPageCount();
		}
		for (Section subsection : subsections) {
			total += subsection.getTotalPages();
		}
		return total;
	}

	public String getSectionTitle() {
		return sectionTitle;
	}

	public List<Page> getPages() {
		return pages;
	}

	public List<Section> getSubsections() {
		return subsections;
	}
}
