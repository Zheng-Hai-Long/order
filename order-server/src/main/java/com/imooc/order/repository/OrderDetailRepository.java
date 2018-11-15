package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ZHL on 2018/11/10.
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
}
