
import java.util.*;

public class recommended {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter your interest (movie / book / music): ");
	        String interest = sc.nextLine().toLowerCase();

	        System.out.println("Recommended items:");

	        if (interest.equals("movie")) {
	            System.out.println("• aromaley");
	            System.out.println("• mariyaan");
	            System.out.println("• 96");
	        } 
	        else if (interest.equals("book")) {
	            System.out.println("• Atomic Habits");
	            System.out.println("• Rich Dad Poor Dad");
	            System.out.println("• Harry Potter");
	        } 
	        else if (interest.equals("music")) {
	            System.out.println("• Classical Music");
	            System.out.println("• AR Rahman Songs");
	            System.out.println("• Jazz Music");
	        } 
	        else {
	            System.out.println("No recommendations available");
	        }
	    }
	}



