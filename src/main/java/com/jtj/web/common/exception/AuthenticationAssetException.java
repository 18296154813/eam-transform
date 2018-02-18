package com.jtj.web.common.exception;

import com.jtj.web.common.ResultDto;
import org.apache.shiro.authc.AuthenticationException;

public class AuthenticationAssetException extends AuthenticationException implements ResultInterf {

    private ResultDto<Object> result;

    public AuthenticationAssetException(ResultDto<Object> result){
        super(result.toString());
        this.result = result;
    }

    @Override
    public ResultDto<Object> getResult() {
        return result;
    }
}
