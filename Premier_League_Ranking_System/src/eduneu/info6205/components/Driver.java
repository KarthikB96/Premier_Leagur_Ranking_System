package eduneu.info6205.components;

import fileParser.FileUtil;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Poisson.demo();

		//Simulate a particular match
//		RankingSystem rankingSystem = new RankingSystem();
//		rankingSystem.Initilize();
//		rankingSystem.predict("Man United", "Man City");
		

		SimulatePremierLeague league = new SimulatePremierLeague();
		league.initialize();
		league.simulate();
	}

}
