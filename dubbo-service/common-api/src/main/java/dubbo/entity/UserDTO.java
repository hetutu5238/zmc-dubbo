package dubbo.entity;

import java.io.Serializable;

/**
 * @Description:
 * @author: zhoum
 * @Date: 2019-06-26
 * @Time: 9:43
 */

public class UserDTO implements Serializable {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
