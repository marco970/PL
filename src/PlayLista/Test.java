package PlayLista;

public class Test {

	public static void main(String[] args) {
		
		Track song1 = new Track ("Rolling Stones", "Brown Sugar");
		Track song2 = new Track ("Pink Floyd", "Hey you");
		Track song3 = new Track ("Republika", "Biała flaga");
		Track song4 = new Track ("Pink Floyd", "One of These Days");
		Track movie1 = new Track("Casablanca");
		Track movie2 = new Track("Terminator I");
		
		PlayList subList = new PlayList("urodziny Cioci Wiesi");
		subList.addEl(song2);
		subList.addEl(song3);
		subList.addEl(song4);
		subList.addEl(movie2);
		
		PlayList pl1 = new PlayList("imieniny");
		pl1.addEl(song1);
		pl1.addEl(song2);
		pl1.play("sekwencyjnie");
		//pl1.addEl(subList);
		
		/*
		System.out.println(song1.getClass());
		System.out.println(subList.getClass());
		if ((subList.getClass().toString()).equals("class PlayLista.PlayList"))	{
			System.out.println("hello");
		}
		*/
		

	}

}
