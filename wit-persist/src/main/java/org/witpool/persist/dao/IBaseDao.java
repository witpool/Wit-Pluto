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
package org.witpool.persist.dao;

import java.util.List;

/**
 * @ClassName: IBaseDao
 * @Description: General DAO API
 * @author Dom Wang 
 * @date 2017-10-25 PM 2:50:27 
 * @version 1.0
 */
public interface IBaseDao<T>
{
    /**
     * @Title: add
     * @Description: Insert one record
     * @param @param instance 
     * @return void 
     * @throws
     */
    void add(T instance);

    /**
    *
    * @Title: delete 
    * @Description: Delete by ID 
    * @param @param id    ID
    * @param @param id    class
    * @return void     
    * @throws
     */
    void delete(Class<T> clas, Integer id);
    
    /**
     * @Title: update
     * @Description: Update by instance properties
     * @param @param instance 
     * @return void 
     * @throws
     */
    void update(T instance);

    /**
     * 
     * @Title: query
     * @Description: Query record
     * @param @param instance
     * @param @return 
     * @return List<T> 
     * @throws
     */
    List<T> query(T instance);
    
    /**
    *
    * @Title: query 
    * @Description: Query by ID 
    * @param @param id
    * @param @param clas
    * @param @return     
    * @return T     
    * @throws
     */
    T query(Class<T> clas, Integer id);
}
