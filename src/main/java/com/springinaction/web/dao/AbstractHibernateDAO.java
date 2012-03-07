/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.web.dao;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
@Transactional
public abstract class AbstractHibernateDAO< T extends Serializable >{
    
    protected final Class< T > clazz;
   
    @Autowired
    SessionFactory sessionFactory;

    
    public AbstractHibernateDAO(final Class< T > clazzToSet) {
        this.clazz = clazzToSet;
    }
   
   
    public T getById( final Long id ){
        Preconditions.checkArgument( id != null );
        return (T) getCurrentSession().get( clazz, id );
    }
   
    public List< T > getAll(){
        return getCurrentSession()
              .createQuery( "from " + clazz.getName() ).list();
    }
   
    public void save( final T entity ){
        Preconditions.checkNotNull( entity );
        getCurrentSession().persist( entity );
    }
   
    public void update( final T entity ){
        Preconditions.checkNotNull( entity );
        getCurrentSession().merge( entity );
    }
   
    public void delete( final T entity ){
        Preconditions.checkNotNull( entity );
        getCurrentSession().delete( entity );
    }
    
    public void deleteById( final Long entityId ){
        final T entity = getById( entityId );
        Preconditions.checkState( entity != null );
        delete( entity );
   }
   
   protected final Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
   }
}