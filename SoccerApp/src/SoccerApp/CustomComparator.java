package SoccerApp;

import java.util.Comparator;

class CustomComparator implements Comparator<FootballClub> {

	@Override
	public int compare(FootballClub t, FootballClub t1) {
		int result = -1;

		if (t.getPoints() <= t1.getPoints())
			if (t.getPoints() < t1.getPoints()) {
				result = 1;
			} else {
				int goalDif = t.getScoredGoalsCount() - t.getReceivedGoalsCount();
				int goalDif1 = t1.getScoredGoalsCount() - t1.getReceivedGoalsCount();
				if (goalDif <= goalDif1)
					if (goalDif < goalDif1) {
						result = 1;
					} else {
						result = 0;
					}
			}

		return result;
	}
}
