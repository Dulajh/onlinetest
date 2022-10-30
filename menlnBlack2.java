package versionB;


import java.util.Random;


public class menlnBlack2 extends menlnBlack{

	menlnBlack2(AlienPack obj) {
		super(obj);
		Score = 0;
	}
	public void kill() {
		Alien arr[] = alianpack.getAlien();
		
		for(int i =0 ; i< arr.length; i++ ) {
			
			Random rand = new Random();
			this.Score = this.Score + arr[i].getScore();
			
			if(rand.nextInt()%2 ==1) {
				this.Score = this.Score - 2;
			}
		}
	}
	

}
