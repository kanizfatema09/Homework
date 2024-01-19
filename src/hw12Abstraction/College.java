package hw12Abstraction;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {
		System.out.println("Staying in the college dormitory.");
	}

	public static void studyRoom() {
		System.out.println("Using the college study room for academic work.");
	}
}
