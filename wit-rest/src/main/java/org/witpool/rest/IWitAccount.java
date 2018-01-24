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
package org.witpool.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.witpool.common.model.bean.WitEntity;
import org.witpool.common.model.po.WitAccount;

/** 
 * @ClassName: IWitAccount 
 * @Description: Account service definition 
 * @author Dom Wang 
 * @date 2017-10-25 AM 11:21:55 
 * @version 1.0 
 */
@Path("/account")
public interface IWitAccount
{
    /**
    * 
    *
    * @Title: addAccount 
    * @Description: Add account
    * @param @param account
    * @param @return     
    * @return WitEntity<WitAccount>     
    * @throws
     */
    @POST
    WitEntity<WitAccount> addAccount(WitAccount account);
    
    /**
    * 
    *
    * @Title: updateAccount 
    * @Description: Update account 
    * @param @param account
    * @param @return     
    * @return WitEntity<WitAccount>     
    * @throws
     */
    @PUT
    WitEntity<WitAccount> updateAccount(WitAccount account);
    
    /**
    * 
    *
    * @Title: delAccount 
    * @Description: Delete account by user ID 
    * @param @param userId
    * @param @return     
    * @return WitEntity<WitAccount>     
    * @throws
     */
    @DELETE
    @Path("/{userId}")
    WitEntity<WitAccount> delAccount(@PathParam("userId") Integer userId);
    
    /**
    * 
    *
    * @Title: getAccount 
    * @Description: Query account by user ID 
    * @param @param userId
    * @param @return     
    * @return WitEntity<WitAccount>     
    * @throws
     */
    @GET
    @Path("/{userId}")
    WitEntity<WitAccount> getAccount(@PathParam("userId") Integer userId);
    
    /**
    * 
    *
    * @Title: getAccount 
    * @Description: Query all the accounts 
    * @param @param userId
    * @param @return     
    * @return WitEntity<WitAccount>     
    * @throws
     */
    @GET
    @Path("/all")
    WitEntity<WitAccount> getAccounts();
}
