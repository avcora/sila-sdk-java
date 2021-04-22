package com.silamoney.client.api;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Karlo Lorenzana
 */
public class ApiResponse {

    private final int statusCode;

    private final Map<String, List<String>> headers;
    
    private final String body;

    private final Object data;

    private final boolean success;

    /**
     * Constructor for ApiResponse.
     *
     * @param statusCode
     * @param headers
     * @param data
     */
    public ApiResponse(int statusCode, Map<String, List<String>> headers, final String body, Object data, boolean success) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.body = body;
        this.data = data;
        this.success = success;
    }

    /**
     * Gets the response status code.
     * @return status code.
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Gets the response headers.
     * @return
     */
    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    /**
     * Gets the response body.
     * @return
     */
    public String getBody() {
        return body;
    }

    /**
     * Gets the response data.
     * @return
     */
    public Object getData() {
        return data;
    }

    /**
     * Gets the success response.
     * @return
     */    
    public boolean getSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return "ApiResponse{" + "statusCode=" + statusCode + ", data=" + data + ", success=" + success + ", body=" + body + ", headers=" + headers + '}';
    }
}
