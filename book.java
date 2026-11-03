
/**
 * book은 도서관에 등록된 책 클래스이다.
 *
 * @author (Team 7)
 * @version Iteration 1 (2026-11-03)
 */
public class book {
 
    private String bookID;  
    private String title;
    private String author;
 
    loan loan;   
    /** book class constructor
     *
     * @param  bookID  책의 등록번호 (바코드)
     * @param  title   책의 제목
     * @param  author  책의 저자
     */
    public book(String bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }
    
    /**
     * 대출가능한 책인지 여부를 체크한다.
     *
     * @return  현재 대출 중이 아니면 true, 대출 중이면 false
     */
    public Boolean checkBook() {
        return loan == null;
    }
    
    /**
     * 책의 정보(등록번호, 제목, 저자)를 화면에 출력한다.
     *
     */
    public void display() {
        System.out.println("책: [" + bookID + "] " + title + " / " + author);
    }
}