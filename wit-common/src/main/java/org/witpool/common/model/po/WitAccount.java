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
package org.witpool.common.model.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/** 
 * @ClassName: WitAccount 
 * @Description: Account persistent object 
 * @author Dom Wang 
 * @date 2017-10-25 PM 2:50:27 
 * @version 1.0 
 */
@Entity
@Table(name = "t_wit_account", catalog = "witpool")
public class WitAccount implements Serializable
{
    private static final long serialVersionUID = 4863350501932957436L;
    
    /**
     * Key
     */
    @Id
    @GenericGenerator(name = "hibernateUuid", strategy = "increment")
    @GeneratedValue(generator = "hibernateUuid")
    @Column(name="user_id", nullable = false)
    private Integer userId;
    
    @Column(name="user_name")
    private String userName;
    
    @Column(name="password")
    private String password;
    
    @Column(name="token_id")
    private String tokenId;

    @Column(name="cell_phone")
    private String cellPhone;
    
    @Column(name="email")
    private String email;
    
    private String time;
    
    public WitAccount()
    {
    }

    public WitAccount(Integer userId)
    {
        this.userId = userId;
    }

    public WitAccount(Integer userId, String tokenId)
    {
        this.userId = userId;
        this.tokenId = tokenId;
    }

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getTokenId()
    {
        return tokenId;
    }

    public void setTokenId(String tokenId)
    {
        this.tokenId = tokenId;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public String getCellPhone()
    {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone)
    {
        this.cellPhone = cellPhone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("WitAccount [userId=");
        builder.append(userId);
        builder.append(", userName=");
        builder.append(userName);
        builder.append(", password=");
        builder.append(password);
        builder.append(", tokenId=");
        builder.append(tokenId);
        builder.append(", cellPhone=");
        builder.append(cellPhone);
        builder.append(", email=");
        builder.append(email);
        builder.append(", time=");
        builder.append(time);
        builder.append("]");
        return builder.toString();
    }

    public void update(WitAccount acc)
    {
        if (null == acc)
        {
            return;
        }
        
        if (null != acc.getCellPhone())
        {
            this.setCellPhone(acc.getCellPhone());
        }
        
        if (null != acc.getEmail())
        {
            this.setEmail(acc.getEmail());
        }
        
        if (null != acc.getPassword())
        {
            this.setPassword(acc.getPassword());
        }
        
        if (null != acc.getTime())
        {
            this.setTime(acc.getTime());
        }
        
        if (null != acc.getTokenId())
        {
            this.setTokenId(acc.getTokenId());
        }
        
        if (null != acc.getUserId())
        {
            this.setUserId(acc.getUserId());
        }
        
        if (null != acc.getUserName())
        {
            this.setUserName(acc.getUserName());
        }
    }
}
