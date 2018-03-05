package com.sohu.bp.roast.service;

import com.sohu.bp.roast.model.BpRoast;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ambitous on 2018/3/2.
 */

public interface BpRoastService {

    List<BpRoast> getBpRoastList(String orderType);

    Integer addBpRoast(BpRoast bpRoast);

    Integer updateThumbUP(Long articleId);
}
