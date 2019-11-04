package life.curry.communtiy.controller;

import life.curry.communtiy.mapper.UserMapper;
import life.curry.communtiy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 *
 * @author curry
 * @version 1.0
 * @date 2019/11/1 19:51
 */

@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public String index(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("token")){//如果用户曾经登录，就会有之前放进cookie的token
                String token = cookie.getValue();//得到token的值
                User user = userMapper.findByToken(token);//冲数据库中取出token
                if(user != null){
                    //将用户放进session中
                    request.getSession().setAttribute("user",user);
                }
                break;
            }
        }
        return "index";
    }
}
