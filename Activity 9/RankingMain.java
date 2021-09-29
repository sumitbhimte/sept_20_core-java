package Pack;
import java.util.*; 


public class RankingMain {   
	public static void main(String args[]){    
		
		
	ArrayList<Ranking> al=new ArrayList<Ranking>();    
	al.add(new Ranking("Kohli",1093));    
	al.add(new Ranking("Dhoni",1135));    
	al.add(new Ranking("Ashwin",335));    
	    
	Collections.sort(al);   
	
	
	
	for (Ranking c : al) {
		System.out.println(c.getName() + " " + c.getScore());
	}


	}    
	 

}
