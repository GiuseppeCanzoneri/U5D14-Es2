package giuseppecanzoneri.u5d14es2.composite;

public class Page {
	private int pageCount;
	private String pageContent;

	public Page(int pageCount, String pageContent) {
		this.pageCount = pageCount;
		this.pageContent = pageContent;
	}

	public int getPageCount() {
		return pageCount;
	}

	public String getPageContent() {
		return pageContent;
	}
}
