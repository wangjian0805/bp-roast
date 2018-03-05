package com.sohu.bp.roast.service.impl;


import com.sohu.bp.roast.dao.mapper.BpRoastMapper;
import com.sohu.bp.roast.model.BpRoast;
import com.sohu.bp.roast.model.BpRoastExample;
import com.sohu.bp.roast.service.BpRoastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Ambitous on 2018/3/2.
 */
@Service
public class BpRoastServiceImpl implements BpRoastService {

    private static final HashMap<String, String> orderMap = new HashMap<>();
    static {
        orderMap.put("THUMB_UP_MOST","thumb_up desc");
        orderMap.put("THUMB_UP_LEAST","thumb_up asc");
        orderMap.put("PUBLISH_TIME_LATEST","publish_time desc");
        orderMap.put("PUBLISH_TIME_EARLIEST","publish_time asc");
    }

    @Autowired
    private BpRoastMapper bpRoastMapper;

    @Override
    public List<BpRoast> getBpRoastList(String orderType) {
        BpRoastExample example = new BpRoastExample();
        example.setOrderByClause(orderMap.get(orderType));
        return bpRoastMapper.selectByExample(new BpRoastExample());
    }

    @Override
    public Integer addBpRoast(BpRoast bpRoast) {
        return bpRoastMapper.insertSelective(bpRoast);
    }

    @Override
    public Integer updateThumbUP(Long articleId) {
        BpRoastExample bpRoastExample = new BpRoastExample();
        BpRoast bpRoast = bpRoastMapper.selectByPrimaryKey(articleId);
        bpRoast.setThumbUp(bpRoast.getThumbUp()+1);
        return bpRoastMapper.updateByPrimaryKeySelective(bpRoast);
    }


}
