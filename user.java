
/**
 * user는 책을 대출할 수 있는 도서관 이용자 클래스이다.
 *
 * @author (Team 7)
 * @version Iteration 1 (2026-11-03)
 */
public class user {
 
    private String userID;   // 학번
    private String name;
 
    loan loan; 
     /**
     * user class constructor
     *
     * @param  userID  이용자의 학번
     * @param  name    이용자의 이름
     */
    public user(String userID, String name) {
        this.userID = userID;
        this.name = name;
    }
 
    /**
     * 대출가능한 이용자인지 여부를 체크한다.
     *
     * @return  현재 대출이 없으면 true, 있으면 false
     */
    public Boolean checkUser() {
        return loan == null;
    }
 
    /**
     * 이용자의 정보(이름, 학번)를 화면에 출력한다.
     *
     */
    public void display() {
        System.out.println("이용자: " + name + " (학번: " + userID + ")");
    }
}