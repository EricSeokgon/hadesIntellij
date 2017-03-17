package tk.hadeslee.web;

/**
 * Project: hadesIntellij
 * FileName: User
 * Date: 2017-03-17
 * Time: 오후 3:22
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private String userId;
    private String password;
    private String name;
    private String email;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
