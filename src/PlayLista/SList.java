package PlayLista;

import java.util.ArrayList;
import java.util.Random;

public class SList {
	
	private ArrayList<Track> sList;
	private String playWayS = "sekwencyjnie";
	//private int SNo;
	
	public SList() {
		sList = new ArrayList<Track>();
	}		
	
	public void addTrack(Track t)	{
		sList.add(t);
	}
	public void playS()	{
		if (playWayS.equals("zapetlenie"))	{
			do	{
				for (Track el: sList)	{
					System.out.println(el.toString());
				}
			}
			while(true);
		}
		else if(playWayS.equals("losowo"))	{
			ArrayList<Track> rList = new ArrayList<Track>();
			rList  = sList;
			Random rand = new Random();
			int sListSize = sList.size();
			
			for (int i=1; i<=sListSize; i++)	{
				int rIndx = rand.nextInt(rList.size());
				System.out.println(rList.get(rIndx).toString());
				rList.remove(rIndx);
			}
		}
		else	{		
			for (Track el: sList)	{
				System.out.println(el.toString());
			}
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
