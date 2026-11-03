import java.util.*;
/**
 * LoanDB는 대출DB 클래스이다.
 *
 * @author (Team 7)
 * @version Iteration 1 (2026-11-03)
 */

 
public class LoanDB {
 
    ArrayList<loan> loans = new ArrayList<loan>();  
    /**
     * 새로운 대출을 대출DB에 저장한다.
     *
     * @param  loan  저장할 대출 객체
     */
    public void save(loan loan) {
        loans.add(loan);
    }
}