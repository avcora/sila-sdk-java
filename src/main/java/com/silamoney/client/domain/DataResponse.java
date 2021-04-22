/*
 * Copyright 2020 stano.
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
package com.silamoney.client.domain;

import lombok.ToString;

/**
 *
 * @author stano
 */
@ToString
public class DataResponse extends BaseResponse {
    
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
    public void setReference(String reference) {
        super.setReference(reference);
    }

    public void setMessage(String message) {
        super.setMessage(message);
    }

    public void setStatus(String status) {
        super.setStatus(status);
    }
    
}
