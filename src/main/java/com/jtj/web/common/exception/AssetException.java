package com.jtj.web.common.exception;

import com.jtj.web.common.ResultDto;


public class AssetException extends Exception implements ResultInterf {

    private ResultDto<Object> result;

    public AssetException(ResultDto<Object> result){
        super(result.toString());
        this.result = result;
    }

    @Override
    public ResultDto<Object> getResult() {
        return result;
    }
}
