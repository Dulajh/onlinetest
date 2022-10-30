package versionB;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		AlienPack Al = new AlienPack(5);
		Al.addAlien(new MarshmelloAlien(), 0);
		Al.addAlien(new OgreAlien(), 1);
		Al.addAlien(new OgreAlien(), 2);
		Al.addAlien(new SnakeAlien(), 3);
		Al.addAlien(new MarshmelloAlien(), 4);
		
		menlnBlack AgentK = new menlnBlack(Al);
		AgentK.kill();
		System.out.println("Your score is "+ AgentK.getScore());
	}

}
