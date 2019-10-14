package com.spring.boot.Controller;

import com.spring.boot.Mapper.UserMapper;
import com.spring.boot.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @Autowired
    private UserMapper usermapper;

    @GetMapping("/")
    public String index(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie:cookies){
            if (cookie.getName().equals("token")){
                String token=cookie.getValue();
               User user=usermapper.findByToken(token);
                if (user != null) {
                    request.getSession().setAttribute("user",user);
                }
               break;
            }
        }
        return "index";
    }
}
