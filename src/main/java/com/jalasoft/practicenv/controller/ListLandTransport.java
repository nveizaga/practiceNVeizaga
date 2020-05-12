/*
 *  Copyright (c) 2020 Jalasoft.
 *
 *   This software is the confidential and proprietary information of Jalasoft.
 *   ("Confidential Information"). You shall not disclose such Confidential
 *   Information and shall use it only in accordance with the terms of the
 *   license agreement you entered into with Jalasoft.
 */

package com.jalasoft.practicenv.controller;
import com.jalasoft.practicenv.transport.Land;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neida Veizaga
 * @version 1.1
 */
public class ListLandTransport {
    public List<Land> landTrans=new ArrayList<Land>();

    /**
     * method for add a new land transport
     * @param land land transport
     */
    public  void addLand(Land land){
        landTrans.add(land);
    }

    /**
     * Method for print all data for each land transport in landTrans list
     */
    public void display(){

        landTrans.stream().forEach(value-> System.out.println(value.displayData()));
    }


}
