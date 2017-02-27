package org.ssh.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.ssh.pageModel.Json;
import org.ssh.pageModel.User;
import org.ssh.service.UserServiceI;

/**
 * Created by hyl on 17/2/25.
 */
@RequestMapping("/userController")
@Controller("userController")
public class UserController {
    @Autowired
    private UserServiceI userService;
    @RequestMapping("/login")
    @ResponseBody
    public Json login(User user){
        Json json=new Json();
        User u=new User();
        try {
            u=userService.login(user);
            if (u!=null){
                json.setObj(u);
                json.setSuccess(true);
            }else{
                json.setSuccess(false);
                json.setMsg("获取数据异常");
            }
        }catch (Exception e){
            json.setSuccess(false);
            json.setMsg("异常:"+e.toString());
        }
        return json;
    }
}
