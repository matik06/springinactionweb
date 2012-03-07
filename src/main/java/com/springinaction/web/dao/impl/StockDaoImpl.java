/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.web.dao.impl;

import com.springinaction.web.dao.AbstractHibernateDAO;
import com.springinaction.web.dao.StockDao;
import com.springinaction.web.model.Stock;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
@Repository
public class StockDaoImpl extends AbstractHibernateDAO<Stock> implements StockDao {

    public StockDaoImpl() {
        super(Stock.class);
        System.out.println("Inicjalizacja obiektu stockdaoimpl");
    }

    @Override
    public Stock getByStockCode(String stockCode) {
        return (Stock)getCurrentSession().createQuery("from " + clazz.getName() + " stock"
                + " where stock.stockCode = " + stockCode).setMaxResults(1).uniqueResult();
    }
    
    
}
