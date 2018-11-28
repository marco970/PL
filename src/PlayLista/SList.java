package PlayLista;

import java.util.ArrayList;

public class SList {
	
	private ArrayList<Track> sList;
	private String playWayS = "sekwencyjnie";
	private int SNo;
	
	public SList(int no) {
		SNo = no;
	}
	public SList() {
		sList = new ArrayList<Track>();
	}		//?
	
	
	public void addTrack(Track t)	{
		sList.add(t);
	}
	public void playS()	{
		
		
		for (Track el: sList)	{
			System.out.println("odtwarzam: "+el.toString());
		}
	}
	public String getPlayWayS()	{
		return playWayS;
	}
	
	public Track getTrack(int i)	{		//?
		return sList.get(i);
	}
	
	public ArrayList<Track> getSList()	{
		return sList;
	}
	
	public void setPlayWayS(String playWay){
		playWayS = playWay;
	}
	

	
	//metody - co będzie potrzebne?
	
	
	
	
	

}
