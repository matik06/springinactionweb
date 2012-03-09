/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.web.controller;


import com.springinaction.web.model.Stock;
import com.springinaction.web.service.StockService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
@Controller

//@RequestMapping("/root")  //root url path
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
    public String showHomePage(Model model) {
        System.out.println("home");
        
        List<Stock> stocks = stockService.getAll();        
        model.addAttribute("stocks", stocks);
        
        return "home";
    }
    
    //handle request: http://localhost:8084/test?stock=!!!!!!!!!!!!!!!!
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String showTestPage(@RequestParam(value="stock", required=false) String code, Model model) {
        //@RequestParam - oznacza parametr przyesłny getem (czyli w adresie strony: ?a=test
        
        List<Stock> stocks = stockService.getAll();        
        System.out.println(stocks);
        
        model.addAttribute("stocks", stocks);
        
//        
        System.out.println(code);
        
        return "test";
    }
            
}
