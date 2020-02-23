package naruto;

public class NarutoMain {
	public static void main(String[] args) {
		NarutoDao nd = new NarutoDao();
		SbDao sd = new SbDao();
		nd.bunsin("나루토");
		System.out.println("====================SB요구사항=========================");
		sd.SB("◎");

	}
	
}
