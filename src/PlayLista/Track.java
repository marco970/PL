package PlayLista;

public class Track  {
	
	String author;
	String title;
	
	public Track(String author, String title)	{
		this.author=author;
		this.title=title;	
	}
	public Track(String title)	{
		this.title=title;
		this.author="Film";
		
	}
	
	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	
	public String toString()	{		
		if (author.equals("Film"))	{
			return "Film: "+title;
		}
		else {
			return "Muzyka: "+author+", "+title;
		}
	}
}
