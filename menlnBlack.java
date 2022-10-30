package versionB;

public class menlnBlack  {
	
	int Score;
	AlienPack alianpack;
	
	menlnBlack(AlienPack obj) {
		 Score = 0;
		 alianpack = obj;
	}
	
	
	public void kill() {
		Alien arr[] = alianpack.getAlien();
		for(int i =0 ; i< arr.length; i++ ) {
			this.Score = this.Score + arr[i].getScore();
		}
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public AlienPack getAlianpack() {
		return alianpack;
	}

	public void setAlianpack(AlienPack alianpack) {
		this.alianpack = alianpack;
	}
	
	
}
