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
package org.witpool.rest.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.witpool.common.enums.WitCode;
import org.witpool.common.model.bean.WitEntity;
import org.witpool.common.model.po.WitAccount;
import org.witpool.persist.dao.IBaseDao;
import org.witpool.persist.dao.impl.BaseDaoImpl;
import org.witpool.rest.IWitAccount;

/** 
 * @ClassName: WitAccountImpl 
 * @Description: Account service 
 * @author Dom Wang 
 * @date 2017-10-25 AM 11:21:55 
 * @version 1.0 
 */
public class WitAccountImpl implements IWitAccount
{
    private static Logger log = LogManager.getLogger(WitAccountImpl.class);

    public WitEntity<WitAccount> addAccount(WitAccount account)
    {
        WitEntity<WitAccount> witEnty = new WitEntity<WitAccount>();
        if (null == account)
        {
            log.error("Input account is null.");
            witEnty.setErrCode(WitCode.WIT_ERR_NULL_PARAM);
            return witEnty;
        }

        IBaseDao<WitAccount> baseDao = (IBaseDao<WitAccount>) BaseDaoImpl.getInstance();
        if (null == baseDao)
        {
            log.error("Get base dao is null.");
            witEnty.setErrCode(WitCode.WIT_ERR_INNER);
            return witEnty;
        }

        try
        {
            List<WitAccount> accounts = baseDao.query(account);
            if (!CollectionUtils.isEmpty(accounts))
            {
                log.error("This user is existed.");
                witEnty.setErrCode(WitCode.WIT_ERR_USER_EXIST);
                return witEnty;
            }
            
            baseDao.add(account);
            witEnty.setInstance(account);
        }
        catch(Exception e)
        {
            log.error("Get account from db failed.", e);
            witEnty.setErrCode(WitCode.WIT_ERR_DB_ADD);
        }

        return witEnty;
    }

    public WitEntity<WitAccount> updateAccount(WitAccount account)
    {
        WitEntity<WitAccount> witEnty = new WitEntity<WitAccount>();
        if (null == account)
        {
            log.error("Input account is null.");
            witEnty.setErrCode(WitCode.WIT_ERR_NULL_PARAM);
            return witEnty;
        }

        IBaseDao<WitAccount> baseDao = (IBaseDao<WitAccount>) BaseDaoImpl.getInstance();
        if (null == baseDao)
        {
            log.error("Get base dao is null.");
            witEnty.setErrCode(WitCode.WIT_ERR_INNER);
            return witEnty;
        }

        try
        {
            WitAccount accdb = baseDao.query(WitAccount.class, account.getUserId());
            if (null == accdb)
            {
                log.error("This user does not exist.");
                witEnty.setErrCode(WitCode.WIT_ERR_USER_EXIST);
                return witEnty;
            }
            
            accdb.update(account);
            baseDao.update(accdb);
            witEnty.setInstance(accdb);
        }
        catch(Exception e)
        {
            log.error("Get account from db failed.", e);
            witEnty.setErrCode(WitCode.WIT_ERR_DB_UPDATE);
        }

        return witEnty;
    }
    
    public WitEntity<WitAccount> delAccount(Integer userId)
    {
        WitEntity<WitAccount> witEnty = new WitEntity<WitAccount>();
        if (null == userId)
        {
            log.error("Input user id is empty.");
            witEnty.setErrCode(WitCode.WIT_ERR_NULL_PARAM);
            return witEnty;
        }

        IBaseDao<WitAccount> baseDao = (IBaseDao<WitAccount>) BaseDaoImpl.getInstance();
        if (null == baseDao)
        {
            log.error("Get base dao is null.");
            witEnty.setErrCode(WitCode.WIT_ERR_INNER);
            return witEnty;
        }

        try
        {
            WitAccount account  = new WitAccount(userId);
            List<WitAccount> accounts = baseDao.query(account);
            if (CollectionUtils.isEmpty(accounts))
            {
                log.error("This user is not exist.");
                witEnty.setErrCode(WitCode.WIT_ERR_USER_NOT_EXIST);
                return witEnty;
            }
            
            baseDao.delete(WitAccount.class, userId);
            witEnty.setInstance(account);
        }
        catch(Exception e)
        {
            log.error("Delete account from db failed.", e);
            witEnty.setErrCode(WitCode.WIT_ERR_DB_DEL);
        }

        return witEnty;
    }

    public WitEntity<WitAccount> getAccount(Integer userId)
    {
        WitEntity<WitAccount> witEnty = new WitEntity<WitAccount>();
        if (null == userId)
        {
            log.error("Input user id is empty.");
            witEnty.setErrCode(WitCode.WIT_ERR_NULL_PARAM);
            return witEnty;
        }

        IBaseDao<WitAccount> baseDao = (IBaseDao<WitAccount>) BaseDaoImpl.getInstance();
        if (null == baseDao)
        {
            log.error("Get base dao is null.");
            witEnty.setErrCode(WitCode.WIT_ERR_INNER);
            return witEnty;
        }

        try
        {
            WitAccount account = baseDao.query(WitAccount.class, userId);
            witEnty.setInstance(account);
        }
        catch(Exception e)
        {
            log.error("Get account from db failed.", e);
            witEnty.setErrCode(WitCode.WIT_ERR_DB_GET);
        }

        return witEnty;
    }

    public WitEntity<WitAccount> getAccounts()
    {
        WitEntity<WitAccount> witEnty = new WitEntity<WitAccount>();
        IBaseDao<WitAccount> baseDao = (IBaseDao<WitAccount>) BaseDaoImpl.getInstance();
        if (null == baseDao)
        {
            log.error("Get base dao is null.");
            witEnty.setErrCode(WitCode.WIT_ERR_INNER);
            return witEnty;
        }

        try
        {
            List<WitAccount> accounts = baseDao.query(new WitAccount());
            witEnty.setInstances(accounts);
        }
        catch(Exception e)
        {
            log.error("Get account from db failed.", e);
            witEnty.setErrCode(WitCode.WIT_ERR_DB_GET);
        }

        return witEnty;
    }

}
