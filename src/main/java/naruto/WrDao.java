package naruto;

public class WrDao {

	public void survey(String survey) {
		System.out.println("여행스타일 파악하여 추천하기 기능(설문조사)");
		System.out.println("-사람마다 여행 스타일이 다름");
		System.out.println("-놀러가서 그냥 풍경모며 쉬고싶은사람");
		System.out.println("-관광명소 돌아다니며 사진찍고 싶은사람");
		System.out.println("-맛있는거 먹으러 돌아다니는 사람 등등");
	}

	public void up() {
		System.out.println("survey()를 토대로 메인에 나의 스타일에 맞게 추천 여행지 보여주기");
	}

	public void nDaysAndnNight() {
		System.out.println("N박N일 코스 짜주기,추천하기, 사용자 유형에 맞춰서 또는 사용자 설정에 맞춰서");
	}
}
