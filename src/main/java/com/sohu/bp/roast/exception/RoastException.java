package com.sohu.bp.roast.exception;

import com.sohu.bp.roast.enums.ResultEnum;

/**
 * Created by Ambitous on 2017/11/27.
 */
public class RoastException extends RuntimeException {

    private Integer code;

    public RoastException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
