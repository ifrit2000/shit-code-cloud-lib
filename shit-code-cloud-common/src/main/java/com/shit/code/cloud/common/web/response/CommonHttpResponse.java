package com.shit.code.cloud.common.web.response;

import com.shit.code.cloud.common.exception.ShitCodeExceptionEnum;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author anthonychen
 * @date 2020/10/15
 **/
@Slf4j
@NoArgsConstructor
public class CommonHttpResponse extends GeneralHttpResponse<Object> {


    public CommonHttpResponse(HttpResponse httpResponse) {
        super(httpResponse);
    }

    public CommonHttpResponse(Object data) {
        super(data);
        setCode(ShitCodeExceptionEnum.OK.getCode());
        setMsg(ShitCodeExceptionEnum.OK.getMsg());
    }
}