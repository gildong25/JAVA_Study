
public class Book {
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubDate;

	public Book(String title, int price, String author, String publisher, String pubDate) {
		this.title = title;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
		this.pubDate = pubDate;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getPubDate() {
		return pubDate;
	}
}
