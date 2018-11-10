package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ZHL on 2018/11/10.
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
