package dubbo.api;


import dubbo.entity.UserDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @Description:
 * @author: zhoum
 * @Date: 2019-06-26
 * @Time: 9:44
 */

public interface UserService {

    UserDTO getUserById( String id);
}
