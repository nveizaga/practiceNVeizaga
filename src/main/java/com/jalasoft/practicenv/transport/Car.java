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
public class Car extends Land {
    boolean useGas;

    /**
     * Constructor of Car object
     * @param name name of car transport
     * @param price price of car transport
     * @param hasMotor boolean to represent if car has motor or not
     * @param useGas boolean to represent if car use gas or not
     */
    public Car(String name, int price, boolean hasMotor,boolean useGas) {
        super(name, price, hasMotor);
        this.useGas = useGas;
    }

    /**
     * Provide data of Car transport
     * @return data of Car
     */
    @Override
    public String displayData() {
        return super.displayData() + ", useGas = " + useGas;
    }
}
