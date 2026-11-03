import java.util.*;

/**
 * userDB는 이용자DB 클래스이다.
 *
 * @author (Team 7)
 * @version Iteration 1 (2026-11-03)
 */
public class UserDB {
 
    ArrayList<user> users = new ArrayList<user>(); 
     /**
     * 주어진 학번을 가진 이용자를 검색한다.
     *
     * @param  userID  검색할 학번
     * @return 학번이 일치하는 이용자 객체, 없으면 null
     */
    public user search(String userID) {
        for (user u : users) {
            if (u.userID.equals(userID)) {
                return u;
            }
        }
        return null;
    }
     /**
     * 새로운 이용자를 이용자DB에 저장한다.
     *
     * @param  user  저장할 이용자 객체
     */
    public void save(user user) {
        users.add(user);
    }
}