package com.sohu.bp.roast.util;


import com.sohu.bp.roast.enums.ResultEnum;
import com.sohu.bp.roast.model.WebResult;

/**
 * Created by Ambitous on 2017/11/27.
 */
public class ResultUtil {

    public static WebResult success(Object object) {
        WebResult result = new WebResult(ResultEnum.SUCCESS);
        result.setData(object);
        return result;
    }

    public static WebResult success() {
        return success(null);
    }

    public static WebResult error(ResultEnum resultEnum) {
        WebResult result = new WebResult(resultEnum);
        return result;
    }
}
