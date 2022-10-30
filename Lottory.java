package versionA;

import java.util.Random;


public class Lottory {
	
	int lotteryNumber[] = new int[5] ;
	int personsLottery[] = {4,2,7,9,3};
    

	public Lottory() {
		super();
		Random rand = new Random();
		
		 for (int i = 0; i < lotteryNumber.length; i++) {
			 lotteryNumber[i] = rand.nextInt(0,9);
		
	}
		
}
	
	 public void checkLottory() {
		 
		int count = 0; 
		String s = "";
		for(int i =0; i < lotteryNumber.length; i++) {
			
			for(int j = 0; j < personsLottery.length; j++) {
				if(lotteryNumber[i] == personsLottery[j]) {
				    String s1 = Integer.toString(lotteryNumber[i]);
				    s = s+s1;
					count = count +1;
				}
			}
		}
		
		 System.out.println("Number of matching digits :"+count);
		 System.out.println("Matching Digits :"+s);
	 }
	 

}