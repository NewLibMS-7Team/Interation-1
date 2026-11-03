import java.util.*;
/**
 * BookDB는 책DB 클래스이다.
 *
 * @author (Team 7)
 * @version Iteration 1 (2026-11-03)
 */
public class BookDB {
 
    ArrayList<book> books = new ArrayList<book>();   
     /**
     * 주어진 등록번호를 가진 책을 검색한다.
     *
     * @param  bookID  검색할 책의 등록번호
     * @return  등록번호가 일치하는 책 객체, 없으면 null
     */
    public book search(String bookID) {
        for (book b : books) {
            if (b.bookID.equals(bookID)) {
                return b;
            }
        }
        return null;
    }
    
     /**
     * 새로운 책을 책DB에 저장한다.
     *
     * @param  book  저장할 책 객체
     */
    public void save(book book) {
        books.add(book);
    }
}