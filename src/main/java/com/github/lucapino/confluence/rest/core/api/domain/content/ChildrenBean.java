/**
 * Copyright 2016 Micromata GmbH
 * Modifications Copyright 2017 Luca Tagliani
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

import java.io.Serializable;

/**
 * @author Christian Schulze (c.schulze@micromata.de)
 */
public class ChildrenBean implements Serializable {

    @Expose
    private CommentBean comment;

    @Expose
    private AttachmentResultsBean attachment;

    public CommentBean getComment() {
        return comment;
    }

    public void setComment(CommentBean comment) {
        this.comment = comment;
    }

    public AttachmentResultsBean getAttachment() {
        return attachment;
    }

    public void setAttachment(AttachmentResultsBean attachment) {
        this.attachment = attachment;
    }
}
