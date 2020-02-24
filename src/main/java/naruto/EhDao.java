package naruto;

public class EhDao {
	public void request1() {
		System.out.println("#(메인 페이지 하단) - 추천!! 가볼만한곳 ");
		System.out.println("그 달의 가볼 만한 여행지를 추천 (계절에 맞는 먹거리 또는 취미활동)\r\n" + 
				"   해시태그로 여행의 주제를 정하면 여행지 추천해줌");
	}
	
	public void request2() {
		System.out.println(" #(ALL여행지)");
		System.out.println("\nT-map 추천 2월 인기 여행지 Top 11 \r\n" + 
				"  (티맵 빅데이터를 활용한 월별 방문율 증가 여행지 소개)");
		System.out.println("\nSNS 인기 여행지 Top 11\r\n" + 
				"  (인스타그램 추천 여행지 소개)");
	}
	
	public void request3() {
		System.out.println(" #(코스)");
		System.out.println("  코스에 담기 기능 (코스여행으로 등록된 여행지만 코스에 담을 수 있음)\r\n" + 
				"     - > 자신이 원하는 여행지라면 코스여행의 여행지가 아니어도 코스에 담을 수 있어야함.");
	}
	
	public void request4() {
		System.out.println(" #(축제)");
		System.out.println("  그 달에 열리는 전국 모든 축제들을 한 눈에 볼 수 있도록");
	}
	
	public void request5() {
		System.out.println(" **(#해시태그기능)");
		System.out.println(" **(일정, 동선, 예상 금액 등 여행 계획을 간략하게 저장 할 수 있는 나만의 스케줄러(달력) - sns로 공유 가능)");
	}
}
