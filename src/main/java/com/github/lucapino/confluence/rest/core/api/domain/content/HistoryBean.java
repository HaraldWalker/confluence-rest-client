/**
 * Copyright 2017 Martin Böhmer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.lucapino.confluence.rest.core.api.domain.content;

import com.google.gson.annotations.Expose;
import com.github.lucapino.confluence.rest.core.api.domain.UserBean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Martin Böhmer
 */
public class HistoryBean implements Serializable {

    @Expose
    private boolean latest;

    @Expose
    private UserBean createdBy;

    @Expose
    private Date createdDate; // TODO fix. Not deserializable. Confluence returns: "createdDate": "2013-03-13T11:48:31.000+01:00"

    public boolean isLatest() {
        return latest;
    }

    public void setLatest(boolean latest) {
        this.latest = latest;
    }

    public UserBean getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserBean createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
