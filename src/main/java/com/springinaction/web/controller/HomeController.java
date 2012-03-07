/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.web.controller;


import com.springinaction.web.model.Stock;
import com.springinaction.web.service.StockService;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
@Controller
public class HomeController {
    
    private static final int DEFAULT_ITEMS_PER_SIZE = 25;
    
//    @Autowired
    private StockService stockService;

    public HomeController() {
    }
    
    @Autowired
    public HomeController(StockService stockService) {
        this.stockService = stockService;
    }
    
    
    
    @RequestMapping(value={"", "/", "/home"}, method= RequestMethod.GET)
    public String showHomePage(Map<String, Object> model) {
        System.out.println("home");
        
        List<Stock> stocks = stockService.getAll();        
        model.put("stocks", stocks);
        
        return "home";
    }
    
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String showTestPage(Map<String, Object> model) {
        
        List<Stock> stocks = stockService.getAll();        
        System.out.println(stocks);
        
        model.put("stocks", stocks);
        
        return "test";
    }
            
}
