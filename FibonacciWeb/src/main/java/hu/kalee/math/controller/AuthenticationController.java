package hu.kalee.math.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Moondancer83 on 2016.06.03..
 */
@Controller
public class AuthenticationController {

    @RequestMapping("login")
    public String login() {
        return "login";
    }
}
