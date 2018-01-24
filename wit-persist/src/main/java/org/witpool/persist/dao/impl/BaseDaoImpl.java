/* 
 * Copyright 2016-2017 WitPool.org All Rights Reserved.
 * 
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
   
 *  http://www.witpool.org/licenses
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.witpool.persist.dao.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import org.witpool.persist.dao.IBaseDao;

/**
 * @ClassName: BaseDaoImpl
 * @Description: General DAO implementation
 * @author Dom Wang 
 * @date 2017-10-25 PM 2:50:27 
 * @version 1.0
 */
public class BaseDaoImpl<T> extends HibernateDaoSupport implements IBaseDao<T>
{
    private static Logger log = LogManager.getLogger(BaseDaoImpl.class);

    /** DAO entity */
    private static IBaseDao<?> baseDao;

    public synchronized static IBaseDao<?> getInstance()
    {
        return baseDao;
    }

    public void setBaseDao(IBaseDao<T> dao)
    {
        baseDao = dao;
        log.info("base dao: " + baseDao);
    }

    public void add(T instance)
    {
        super.getHibernateTemplate().save(instance);
    }

    public void delete(Class<T> clas, Integer id)
    {
        T instance = super.getHibernateTemplate().get(clas, id);
        super.getHibernateTemplate().delete(instance);
    }

    public void update(T instance)
    {
        super.getHibernateTemplate().update(instance);
    }

    public List<T> query(T instance)
    {
        return super.getHibernateTemplate().findByExample(instance);
    }

    public T query(Class<T> clas, Integer id)
    {
        return super.getHibernateTemplate().get(clas, id);
    }

}
