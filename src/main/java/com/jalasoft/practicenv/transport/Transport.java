/*
 *  Copyright (c) 2020 Jalasoft.
 *
 *   This software is the confidential and proprietary information of Jalasoft.
 *   ("Confidential Information"). You shall not disclose such Confidential
 *   Information and shall use it only in accordance with the terms of the
 *   license agreement you entered into with Jalasoft.
 */

package com.jalasoft.practicenv.transport;

/**
 * @author Neida Veizaga
 * @version 1.1
 */
public class Transport {
    String name;
    int price;

    /**
     * Constructor of Transport object
     * @param name name of transport
     * @param price price of transport
     */
    public Transport(String name,int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * get name of transport
     * @return name
     */
    public String getName() {
        return  name;
    }

    /**
     * get price of transport
     * @return price
     */
    public int getPrice() {
        return  price;
    }
}
