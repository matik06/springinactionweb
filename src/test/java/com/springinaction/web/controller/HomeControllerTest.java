/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.web.controller;

import static com.springinaction.web.controller.HomeController.*;
import com.springinaction.web.model.Stock;
import com.springinaction.web.service.StockService;
import java.util.HashMap;
import static java.util.Arrays.*;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.ui.Model;


/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class HomeControllerTest {
    
    @Test
    public void shouldDisplayRecentStocks() {
//        List<Stock> expectedStocks = asList(new Stock(), new Stock(), new Stock());
//        
//        StockService stockService = mock(StockService.class);
//        when(stockService.getAll()).thenReturn(expectedStocks);
//        
//        HomeController homeController = new HomeController(stockService);
//        Model model = new Model() {}
//        String viewName = homeController.showTestPage(model);
//        
//        assertEquals("test", viewName);
//        assertSame(expectedStocks, model.get("stocks"));
//        verify(stockService).getAll();
    }
}
