package hu.kalee.math.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marci on 2016.05.31..
 */
@RestController
public class FibonacciController {
    @RequestMapping(value = "/math/fibonacci/", method = RequestMethod.GET)
    public String info() {
        return "hu.kalee.math.fibonacci";
    }

    @RequestMapping(value = "/math/fibonacci/", method = RequestMethod.GET)
    public Integer getNthNumber(int index) {
        return 0;
    }
}
