package naruto;

public class NarutoMain {
	public static void main(String[] args) {
		NarutoDao nd = new NarutoDao();
		SbDao sd = new SbDao();
		ScoreDao sc = new ScoreDao();
		
		nd.bunsin("나루토");
		
		System.out.println("====================SB요구사항=========================");
		sd.SB("◎");
		
		System.out.println("\n====================채점 결과=========================");
		sc.jumsu("은호",9);
		
		System.out.println("git pull 실험");
		System.out.println("git pull 실험2");
		
		System.out.println("git pull 실험 계~~~~~~~~~~~~~~~~~~~~~~~~속");
		System.out.println("Why 2 files changed?");
		
		System.out.println("이번엔 merge를 했어 다시 이제 수정했어");
		System.out.println("한줄더 써봤어");
		System.out.println("한줄더 써봤어");
		
	}
	
}
