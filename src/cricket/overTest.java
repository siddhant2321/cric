package cricket;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class overTest {
	over Over1,Over2,Over3,Over4,Over5;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 
	}

	@Test
	public void test() {
		 Over1=new over(0,1,2,3,4,5);
		 Over2=new over(1,2,3,5,4,2);
		 Over3=new over(2,5,3,0,2,4);
		 Over4=new over(6,4,3,2,6,3);
		 Over5=new over(5,5,3,6,2,1);
		System.out.println("---------------Welcome to IPL--------------\n");
		System.out.println("score of match as of now is "+Over1.getTotal()+"\n");
		System.out.println("---------------Scores Per Over--------------\n");
		System.out.println("score for Over 1 =: "+Over1.scoreperover());
		System.out.println("score for Over 2 =: "+Over2.scoreperover());
		System.out.println("score for Over 3 =: "+Over3.scoreperover());
		System.out.println("score for Over 4 =: "+Over4.scoreperover());
		System.out.println("score for Over 5 =: "+Over5.scoreperover());
		
		int totalscore=0;
		totalscore=Over1.scoreperover()+Over2.scoreperover()+Over3.scoreperover()+Over4.scoreperover()+Over5.scoreperover();
		
		System.out.println("\ntotal score after adding score from Over1-Over5 is "+totalscore);
	}

}
