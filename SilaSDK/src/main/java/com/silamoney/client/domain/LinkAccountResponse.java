package com.silamoney.client.domain;

/**
 * Object used to map Link Account response.
 *
 * @author Karlo Lorenzana
 */
public class LinkAccountResponse {

    private String status;
    private String message;

    /**
     * Gets the response status.
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "LinkAccountResponse{" + "status=" + status + ", message=" + message + '}';
    }
}
