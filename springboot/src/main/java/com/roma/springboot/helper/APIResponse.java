package com.roma.springboot.helper;

/**
 * Created by roma on 21/04/2017.
 */
public final class APIResponse {

    private String message;
    private boolean success;
    private Object data;

    public APIResponse(boolean success, Object data, String message) {
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public APIResponse(boolean success, Object data) {
        this(success, data, null);
    }

    public APIResponse(boolean success, String message) {
        this(success, null, message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
