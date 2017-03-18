package common_test;

public class UrlInfo {
	private String url;
	private String translator;

	public UrlInfo() {
		this("");
	}

	public UrlInfo(String url) {
		this(url, "none");
	}

	public UrlInfo(String url, String translator) {
		this.url = url;
		this.translator = translator;
	}

	public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}