/*
 * Bean Testing.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package info.novatec.beantest.demo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Demo entity that contains database constraints.
 * 
 * @author Carlos Barragan (carlos.barragan@novatec-gmbh.de)
 */
@Entity
public class MyEntityWithConstraints implements Serializable{
    
    @Id
    @GeneratedValue
    private long id;
    
    @Column(unique = true)
    private String uniqueValue;
    
    /**
     * Constructor for JPA
     */
    protected MyEntityWithConstraints() {}

    public MyEntityWithConstraints(String uniqueValue) {
        this.uniqueValue = uniqueValue;
    }

    public String getUniqueValue() {
        return uniqueValue;
    }

    public void setUniqueValue(String uniqueValue) {
        this.uniqueValue = uniqueValue;
    }

    public long getId() {
        return id;
    }
    
    
    
    
    
}