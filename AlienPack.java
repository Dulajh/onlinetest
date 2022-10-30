package versionB;

public class AlienPack {

	
    Alien arr[];
	
	public AlienPack(int x) {
		arr = new Alien[x];
	}
	
	
	public void addAlien(Alien obj,int y) {
		 arr[y] = obj;
		 
	}
	
	
	    Alien[] getAlien(){
//		int i = this.getAlien(x);
		return arr;
		};
		
		
		
		
}
