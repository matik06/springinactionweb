package com.springinaction.web.service.impl;

import com.springinaction.web.dao.StockDao;
import com.springinaction.web.model.Stock;
import com.springinaction.web.service.StockService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//określa, że wszystkie metody wewnątrz klasy będą wspierały transakcyjność
//@Transactional(propagation= Propagation.SUPPORTS, readOnly=true)
@Service("stockBo")
public class StockServiceImpl implements StockService{
	
    @Autowired
    StockDao stockDao;

    public StockServiceImpl() {
        System.out.println("implementacja StockServiceImpl()");
    }
        
        
        
    public void setStockDao(StockDao stockDao) {
            this.stockDao = stockDao;
    }

    public void save(Stock stock){
            stockDao.save(stock);
    }

    public void update(final Stock stock){
        stockDao.update(stock);
    }

    //określa, że dana metoda będzie wspierała transakcyjność
//    @Transactional(propagation= Propagation.REQUIRED, readOnly=false)
    public void delete(Stock stock){
            stockDao.delete(stock);
    }

    public Stock findByStockCode(String stockCode){
            return stockDao.getByStockCode(stockCode);
    }

    @Override
    public List<Stock> getAll() {
        return stockDao.getAll();
    }
        
        
}
