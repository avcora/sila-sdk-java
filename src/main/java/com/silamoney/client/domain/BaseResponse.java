package com.silamoney.client.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Response used for the majority of endpoints.
 *
 * @author Karlo Lorenzana
 */
public class BaseResponse {

    @Getter
    @Setter
    private String reference;

    @Getter
    @Setter
    private String message;

    @Getter
    @Setter
    private String status;

    @Getter
    @Setter
    private Boolean success;
   

    @Override
    public String toString() {
        return "BaseResponse{" + "reference=" + reference + ", message=" + message + ", status=" + status + '}';
    }
}
