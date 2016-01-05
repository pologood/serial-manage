package com.hotpot.service;

import com.hotpot.domain.Order;
import com.hotpot.domain.ValueCard;
import com.hotpot.searcher.OrderSearcher;

import java.util.List;
import java.util.Map;

/**
 * Created by zoupeng on 15/12/26.
 */
public interface OrderService {
    void createOrder(Order order);

    List<Order> getOrdersByStoreId(Integer storeId);

    List<Order> getUnsettleOrderByStoreId(Integer storeId);

    Map<String,List<Integer>> settleOrders(List<Integer> orderIds);

    ValueCard payByCard(Order order, String cardId, String cardUuid);

    Order pay(Order order);

    List<Order> getOrdersBySearcher(OrderSearcher searcher);
}
