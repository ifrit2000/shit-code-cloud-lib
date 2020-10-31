package com.shit.code.cloud.common.web.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Anthony
 * @date 11/1/20
 **/
@Data
@NoArgsConstructor
public abstract class AbstractHttpResponse implements HttpResponse {
    private String code;
    private String msg;
    private String traceId;

    public AbstractHttpResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public AbstractHttpResponse(HttpResponse httpResponse) {
        this(httpResponse.getCode(), httpResponse.getMsg());
    }


}