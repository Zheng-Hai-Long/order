package com.imooc.order.utils;

import com.imooc.order.vo.ResultVO;

import java.util.Map;

/**
 * Created by ZHL on 2018/11/10.
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}