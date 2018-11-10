package com.imooc.order.repository;

import com.imooc.order.OrderApplicationTests;
import com.imooc.order.dataobject.OrderMaster;
import com.imooc.order.enums.OrderStatusEnum;
import com.imooc.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * Created by ZHL on 2018/11/10.
 */
public class OrderMasterRepositoryTest extends OrderApplicationTests{

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave() throws Exception{

        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setBuyerAddress("海南创智天地");
        orderMaster.setBuyerName("战三");
        orderMaster.setBuyerOpenid("mk123456");
        orderMaster.setBuyerPhone("13288888888");
        orderMaster.setOrderId("1312312323456");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        OrderMaster master = orderMasterRepository.save(orderMaster);
        Assert.assertTrue(master != null);

    }

}