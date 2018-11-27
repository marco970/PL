package PlayLista;

import java.io.File;
import java.util.List;

public class Track  {
	
	String author;
	String title;
	String kind;
	File file;
	
	public Track(String author, String title)	{
		
		//, String kind, File file - to dodać do konstruktora
		
		
		this.author=author;
		this.title=title;
		this.kind=kind;
		this.file=file;
		
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

	public String getKind() {
		return kind;
	}

	public File getFile() {
		return file;
	}
	
	public String toString()	{
		return "Autor: "+author+" tytuł: "+title;
	}
	

}
