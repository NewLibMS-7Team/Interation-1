import java.time.*;
/**
 * loan은 이용자가 책을 대출한 정보를 나타내는 대출 클래스이다.
 *
 * @author (Team 7)
 * @version Iteration 1 (2026-11-03)
 */

 
public class loan {
 
    private LocalDate loanDate;  
    private LocalDate returnDate;  
 
    user user;  
    book book;  
 
    /**
     * loan class constructor     
     * 
     * @param  user  책을 대출하는 이용자
     * @param  book  대출되는 책
     */
    public loan(user user, book book) {
        this.user = user;
        this.book = book;
 
        loanDate = LocalDate.now();
        returnDate = loanDate.plusDays(14);
    }
    
     /**
     * 대출정보(이용자, 책, 대출일시, 반납기한)를 화면에 출력한다. 
     *
     */
    public void display() {
        System.out.println("[대출정보]");
        user.display();
        book.display();
        System.out.println("대출일시: " + loanDate);
        System.out.println("반납기한: " + returnDate);
    }
}