package PlayLista;

public class Test {

	public static void main(String[] args) {
		
		Track song1 = new Track ("Rolling Stones", "Brown Sugar");
		Track song2 = new Track ("Pink Floyd", "Hey you");
		Track song3 = new Track ("Republika", "Biała flaga");
		Track song4 = new Track ("Pink Floyd", "One of These Days");
		Track movie1 = new Track("Casablanca");
		Track movie2 = new Track("Terminator I");

		PlayList subPL = new PlayList("sub1");
		subPL.addElement(movie2);
		subPL.addElement(song2);
		subPL.addElement(song3);
		
		PlayList pl = new PlayList("moja1");
		pl.addElement(song1);
		pl.addElement(subPL);
		pl.addElement(movie1);
		
		pl.playP("");
	}

}
