package com.kano.plan_c.server.service;

import com.kano.plan_c.server.entity.InvLocInfo;
import com.kano.plan_c.server.mapper.ItemLocMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: kano33
 * @Create: 2025-09-04 11:55
 **/

@Service
public class InvLocService {


    @Resource
    private ItemLocMapper itemLocmapper;


    public List<InvLocInfo> queryInvLocInfo(String itemCode) {

        return itemLocmapper.queryInvByItemCode(itemCode);
    }


}
