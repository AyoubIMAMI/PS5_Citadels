package fr.unice.polytech.citadelle;

public class StatsBot implements Comparable {
	private final String botName;
	private int numberOfGamePlayed = 0;
	private int numberOfGameWon = 0;

	/**
	 * Initialize a new StatsBot with no game played.
	 * @param botName The name of the bot.
	 */
	public StatsBot(String botName) {
		this.botName = botName;
	}

	/**
	 * Initialize a StatsBot with a name, and its current statistics.
	 * If the bot never play a game, please refer to the other StatsBot constructor.
	 * @param botName The name of the bot
	 * @param numberOfGamePlayed The number of game played by the bot.
	 * @param numberOfGameWon The number of game won by the bot.
	 */
	public StatsBot(String botName, int numberOfGamePlayed, int numberOfGameWon) {
		this.botName = botName;
		this.numberOfGamePlayed = numberOfGamePlayed;
		this.numberOfGameWon = numberOfGameWon;
	}

	public String getName() {
		return botName;
	}

	public double getWinrate() {
		return numberOfGamePlayed == 0 ? 0 : (numberOfGameWon / (float) numberOfGamePlayed) * 100;
	}

	public void increaseNumberOfGamePlay() {
		this.numberOfGamePlayed++;
	}

	public void increaseNumberOfGameWin() {
		this.numberOfGameWon++;
	}

	@Override
	public int compareTo(Object o) {
		return (int) (((StatsBot) o).getWinrate() * 100 - getWinrate() * 100);
	}
}
