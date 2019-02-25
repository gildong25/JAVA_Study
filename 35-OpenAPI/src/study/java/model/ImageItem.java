package study.java.model;


public class ImageItem {
	private String title = null;
	private String link = null;
	private String thumbnail = null;
	private int width = 0;
	private int height = 0;
	private String pubDate = null;

	public ImageItem(String title, String link, String thumbnail, int width,
			int height, String pubDate) {
		super();
		this.title = title;
		this.link = link;
		this.thumbnail = thumbnail;
		this.width = width;
		this.height = height;
		this.pubDate = pubDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	@Override
	public String toString() {
		return "ImageItem [title=" + title + ", link=" + link + ", thumbnail="
				+ thumbnail + ", width=" + width + ", height=" + height
				+ ", pubDate=" + pubDate + "]";
	}

}
