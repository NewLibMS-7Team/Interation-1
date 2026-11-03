
/**
 * New 도서관관리시스템
 *
 * @author (Team 7)
 * @version Iteration 1 (2026-11-03)
 */
public class NewLibMS {
    private String name;
 
    UserDB userDB = new UserDB();
    LoanDB loanDB = new LoanDB();   
    BookDB bookDB = new BookDB();  
 
    /**
     * 새로운 이용자를 등록한다
     *
     * @param  userID  이용자의 학번 
     * @param  name    이용자의 이름
     */
    public void registerBorrower(String userID, String name) {
        user newUser = new user(userID, name);
        userDB.save(newUser);
    }
 
    /**
     * 새로운 책을 등록한다
     *
     * @param  bookID  책의 등록번호
     * @param  title   책의 제목
     * @param  author  책의 저자
     */
    public void input(String bookID, String title, String author) {
        book newBook = new book(bookID, title, author);
        bookDB.save(newBook);
    }
}
 