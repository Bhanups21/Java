public class CricketScores {
	public static void main(String[] args) {
		int scores[]= {281, 344, 265, 272, 236, 324, 287};
		int aboveAverage=0;
		int equalToAverage=0;
		int belowAverage=0;
		int average=0;
		for(int score:scores) {
			average+=score;
		}
		average/=scores.length;
		for(int score:scores) {
			if(score<average) {
				belowAverage++;
			}
			else if(score==average) {
				equalToAverage++;
			}
			else {
				aboveAverage++;
			}
		}
		System.out.println("The average score of the team is "+average+" runs\r\n"
				+ "No. of matches having a score above average is "+aboveAverage+"\r\n"
				+ "No. of matches having a score equal to average is "+equalToAverage+"\r\n"
				+ "No. of matches having score below average is "+belowAverage);
	}

}
