package tests;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Post;

public class ProgramInsta {

	public static void main(String[] args) {

		Scanner md = new Scanner(System.in);

		String dateString = "21/06/2018 13:05:44";

		String title = "Traveling to New Zealand";

		String content = "I'm going to visit this wonderful country!";
		
		Integer like = 12;
		
		LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		
		Post p1 = new Post(date,title,content,like);
		
		p1.addList("Have a nice trip");
		p1.addList("Wow that's awesome!");
		
		System.out.println(p1.toString());
		
		

		String dateString2 = "28/07/2018 23:14:19";

		String title2 = "Good night guys";

		String content2 = "See you tomorrow";
		
		Integer like2 = 5;
		
		LocalDate date2 = LocalDate.parse(dateString2, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		
		Post p2 = new Post(date2,title2,content2,like2);
		
		p2.addList("Good night");
		p2.addList("May the Force be with you");
		
		System.out.println(p2.toString());
		
		
		

		md.close();
	}

}
