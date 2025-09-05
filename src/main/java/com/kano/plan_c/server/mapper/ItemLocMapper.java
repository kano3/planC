package com.kano.plan_c.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kano.plan_c.server.entity.InvLocInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: kano33
 * @Create: 2025-09-04 15:28
 **/

@Mapper
public interface ItemLocMapper extends BaseMapper<InvLocInfo> {

    List<InvLocInfo> queryInvByItemCode(@Param("itemCode") String itemCode);

}
