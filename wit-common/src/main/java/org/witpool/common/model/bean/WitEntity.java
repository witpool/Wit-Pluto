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
package org.witpool.common.model.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.witpool.common.enums.WitCode;

/** 
 * @ClassName: WitEntity 
 * @Description: Entity class 
 * @author Dom Wang 
 * @date 2017-10-26 PM 3:46:14 
 * @version 1.0 
 */
public class WitEntity<T> implements Serializable
{
    private static final long serialVersionUID = -6313651335351889170L;

    /** Instance */
    @JsonInclude(Include.NON_NULL)
    private T instance;

    /** Instances */
    @JsonInclude(Include.NON_NULL)
    private List<T> instances;

    /** Error code */
    private Integer code;

    /** Error message */
    private String message;

    public WitEntity()
    {
        this.setErrCode(WitCode.WIT_OK);
    }

    public WitEntity(WitCode code)
    {
        this.setErrCode(code);
    }

    public WitEntity(Integer code, String msg)
    {
        this.code = code;
        this.message = msg;
    }

    public WitEntity(T instance)
    {
        this.instance = instance;
    }

    public WitEntity(List<T> instances)
    {
        this.instances = instances;
    }

    public T getInstance()
    {
        return instance;
    }

    public void setInstance(T instance)
    {
        this.instance = instance;
    }

    public List<T> getInstances()
    {
        return instances;
    }

    public void setInstances(List<T> instances)
    {
        this.instances = instances;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public void setErrCode(WitCode code)
    {
        this.code = code.getCode();
        this.message = code.getMessage();
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("WitEntity [instance=");
        builder.append(instance);
        builder.append(", instances=");
        builder.append(instances);
        builder.append(", code=");
        builder.append(code);
        builder.append(", message=");
        builder.append(message);
        builder.append("]");
        return builder.toString();
    }

}
