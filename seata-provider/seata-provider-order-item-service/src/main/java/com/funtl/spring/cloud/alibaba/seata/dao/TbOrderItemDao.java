package com.funtl.spring.cloud.alibaba.seata.dao;

import com.funtl.spring.cloud.alibaba.seata.domain.TbOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbOrderItemDao extends JpaRepository<TbOrderItem,Long> {
}
