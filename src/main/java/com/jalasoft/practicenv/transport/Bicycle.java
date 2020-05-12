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
public class Bicycle extends Land{
    Boolean exerciseBike;

    /**
     *  This is the constructor of Bicycle object
     * @param name name of bicycle
     * @param price price of bicycle
     * @param hasMotor boolean value for represent is transport has motor or not
     * @param exerciseBike boolean value for represent the exercise Bike or not
     */
    public Bicycle(String name, int price, boolean hasMotor, boolean exerciseBike) {
        super(name, price, hasMotor);
        this.exerciseBike = exerciseBike;
    }

    /**
     * Provide data of bicycle transport
     * @return data of bicycle transport
     */
    @Override
    public String displayData() {
        return super.displayData() + ", exercise = " + exerciseBike;
    }
}
