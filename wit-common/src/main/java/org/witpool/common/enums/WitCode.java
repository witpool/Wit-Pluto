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
package org.witpool.common.enums;

/** 
 * @ClassName: WitCode 
 * @Description: Wit error code
 * @author Dom Wang 
 * @date 2016-5-2 PM 3:38:22 
 * @version 1.0 
 */
public enum WitCode
{
    WIT_OK(0, "success"),
    
    WIT_ERR_BASE(1000, "error"),
    
    WIT_ERR_DB_BASE(1001, "The operation of db occurs error"),
    
    WIT_ERR_DB_ADD(1002, "Insert record into db failed"),
    
    WIT_ERR_DB_DEL(1003, "Delete record from db failed"),
    
    WIT_ERR_DB_GET(1004, "Get record from db failed"),
    
    WIT_ERR_DB_UPDATE(1005, "Update record to db failed"),
    
    WIT_ERR_INNER(1006, "System inner error"),
    
    WIT_ERR_NULL_PARAM(1007, "Null parameter"),
    
    WIT_ERR_AUTH_FAILED(1008, "Invalid user name or password"),
    
    WIT_ERR_NOT_LOGON(1009, "This user is not logon"),
    
    WIT_ERR_USER_EXIST(1010, "This user is exist"),
    
    WIT_ERR_USER_NOT_EXIST(1011, "This user is not exist"),
    
    WIT_ERR_EMPTY_USER(1013, "Please input user name or password");
    
    private int code;
    
    private String message;

    private WitCode(int code, String msg)
    {
        this.code = code;
        this.message = msg;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String msg)
    {
        this.message = msg;
    }
}
