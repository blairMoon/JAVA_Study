package Class;

public class MovieReviewMain1 {

    public static void main(String[] args) {
      MovieReview movieReview1 = new MovieReview();
      movieReview1.title = "인셉션";
      movieReview1.review = "인생은 무한 루프";
      MovieReview movieReview2 = new MovieReview();
      movieReview2.title = "어바웃타임";
      movieReview2.review = "인생 시간 영화!";

      MovieReview[] movieReviews = {movieReview1,movieReview2};
      // for문으로 돌리기
      for (int i = 0 ; i < movieReviews.length ; i++ ){
          System.out.println("영화제목"+ movieReviews[i].title + ", 리뷰" + movieReviews[i].review);

      }
        //foreach문으로 돌리기
        for (MovieReview m : movieReviews) {
            //MovieReview는 타입을 나타내는 것 , m은 변수 , movieReviews는 array

            System.out.println("영화제목"+ m.title + ", 리뷰" + m.review);

        }

    }


}
