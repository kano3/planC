package com.kano.plan_c.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kano.plan_c.server.entity.OrderInInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderInMapper extends BaseMapper<OrderInInfo> {


    List<OrderInInfo> queryIn(@Param("itemCode") String itemCode);

}
