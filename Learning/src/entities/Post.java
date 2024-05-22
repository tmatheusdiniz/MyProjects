package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {

	
	LocalDate moment;
	String title;
	String content;
	Integer likes;

	List<Comment> listComments = new ArrayList<>();

	public Post(LocalDate moment, String title, String content, Integer likes) {

		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public void addList(String text) {
		
		Comment comment = new Comment(text);

		listComments.add(comment);
	}

	public void removeComment(Comment com) {
		listComments.remove(com);

	}

	public List<Comment> getListComments() {
		return listComments;
	}

	public LocalDate getMoment() {
		return moment;
	}

	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
  	             sb.append(title).append("\n")
  		         .append(likes).append(" Likes").append(" - ")
  		         .append(moment).append("\n")
  		         .append(content).append("\n")
  		         .append("Comments: \n");   
  	             
  	           for (Comment comment : listComments) {
  	             sb.append(comment.getText()).append("\n");
  	         }
		
		return sb.toString();
		
		
	}

}

