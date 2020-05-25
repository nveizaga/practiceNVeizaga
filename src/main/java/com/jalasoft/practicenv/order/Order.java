/*
 *  Copyright (c) 2020 Jalasoft.
 *
 *   This software is the confidential and proprietary information of Jalasoft.
 *   ("Confidential Information"). You shall not disclose such Confidential
 *   Information and shall use it only in accordance with the terms of the
 *   license agreement you entered into with Jalasoft.
 */

package com.jalasoft.practicenv.order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neida Veizaga
 * @version 1.1
 */
public class Order {
    String codOrder;
    String orderType;
    String client;
    String dateOrder;
    List<Detail> detailsOrder = new ArrayList<Detail>();

    /**
     * Order construct for define order object
     * @param codOrder order code , type: String
     * @param orderType type order, type: String
     * @param client  client to made the order, type: String
     * @param dateOrder order date, type:String
     * @param detailsOrder list details order, type:List<Detail>
     */
    public Order(String codOrder,String orderType,String client,String dateOrder,List<Detail> detailsOrder) {
        this.codOrder = codOrder;
        this.orderType = orderType;
        this.client = client;
        this.dateOrder = dateOrder;
        this.detailsOrder = detailsOrder;
    }
    /**
     * Get client of order
     * @return client value
     */
    public String getClient() {
        return client;
    }
    /**
     * get order type
     * @return orderType value
     */
    public String getOrderType() {
        return orderType;
    }
    /**
     * get order code
     * @return order code value
     */
    public String getCodOrder() {
        return codOrder;
    }
    /**
     * get order code
     * @return order code value
     */
    public String getDateOrder() {
        return dateOrder;
    }

    /**
     * retur details of order
     * @return a list with details order
     */
    public List<Detail> getDetailsOrder() {
        return  detailsOrder;
    }

    }
