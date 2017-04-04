package br.com.atech.test.pojo;

import org.springframework.http.HttpStatus;

public class ResponseTestPojo {
    private Integer status;
    private String message;

    public ResponseTestPojo(HttpStatus status) {
        this.status = status.value();
        this.message = status.getReasonPhrase();
    }

    public ResponseTestPojo(HttpStatus status, String message) {
        this.status = status.value();
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
