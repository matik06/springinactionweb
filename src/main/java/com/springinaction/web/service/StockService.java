package com.springinaction.web.service;

import com.springinaction.web.model.Stock;
import java.util.List;

public interface StockService {
	
	void save(Stock stock);
	
	void update(Stock stock);
	
	void delete(Stock stock);
	
	Stock findByStockCode(String stockCode);

        public List<Stock> getAll();
}
