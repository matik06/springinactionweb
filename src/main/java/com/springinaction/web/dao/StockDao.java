package com.springinaction.web.dao;

import com.springinaction.web.model.Stock;
import java.util.List;

public interface StockDao {
	
	void save(Stock stock);
	
	void update(Stock stock);
	
	void delete(Stock stock);
        
        Stock getById(Long id);
	
	Stock getByStockCode(String stockCode);
        
        List<Stock> getAll();

}
