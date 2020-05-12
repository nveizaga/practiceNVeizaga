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
public class Land extends Transport{
    boolean hasMotor;

    /**
     * Constructor of Land Transport
     * @param name name of land transport
     * @param price price of land transport
     * @param hasMotor boolean to use for define if land transport has or not motor
     */
    public Land(String name, int price, boolean hasMotor) {
        super(name, price);
        this.hasMotor = hasMotor;
    }

    /**
     * return data of land transport
     * @return data or land transport
     */
    public String displayData() {
        return "name = " + getName() +", price = " + getPrice() + ", hasMotor = " + hasMotor;
    }
}
