package app.models;

@javax.persistence.Entity
public class Post extends Entity {
	
	private String title;
	private String body;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public String getBody() {
		return body;
	}
	
}
