package hu.kalee.math.controller;

import hu.kalee.math.lib.IntegerFibonacciNumberCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Moondancer83 on 2016.05.31..
 */
@RestController
public class FibonacciController {
    @Autowired
    private IntegerFibonacciNumberCalculator calculator;

    @RequestMapping(value = "/math/fibonacci/info", method = RequestMethod.GET)
    public String info() {
        return "hu.kalee.math.fibonacci";
    }

    @RequestMapping(value = "/math/fibonacci/{index}", method = RequestMethod.GET)
    public Integer getNthNumber(@PathVariable(value="index") int index) {
        return calculator.calculateNthNumber(index);
    }

    @RequestMapping(value = "/math/fibonacci/list/{index}", method = RequestMethod.GET)
    public List<Integer> getFirstNthNumber(@PathVariable(value="index") int index) {
        return calculator.calculateFirstNNumbers(index);
    }
}
