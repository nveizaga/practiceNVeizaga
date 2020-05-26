/*
 *  Copyright (c) 2020 Jalasoft.
 *
 *   This software is the confidential and proprietary information of Jalasoft.
 *   ("Confidential Information"). You shall not disclose such Confidential
 *   Information and shall use it only in accordance with the terms of the
 *   license agreement you entered into with Jalasoft.
 */

package com.jalasoft.practicenv.order;

/**
 * @author Neida Veizaga
 * @version 1.1
 */
public class Detail {
    private String codDetail;
    private String product;
    private int quantity;
    private int price;
    private int discount;
    private int total;
    private String codeOrder;

    /**
     * Constructor of detail for order
     * @param codDetail Detail code
     * @param product   product name
     * @param quantity quantity of product
     * @param price price of product
     * @param discount discount for product
     * @param total total product order
     * @param codeOrder Order Code reference
     */
    public Detail(String codDetail,String product,int quantity,int price,int discount,int total,String codeOrder) {
        this.codDetail = codDetail;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.total = total;
        this.codeOrder = codeOrder;
    }

    /**
     * Return order code
     * @return order code value
     */
    public String getCodeOrder() {
        return codeOrder;
    }

    /**
     * return product value
     * @return product value
     */
    public String getProduct() {
        return product;
    }

    /**
     * return quantity required of product
     * @return quantity value
     */
    public int getQuantity() {
        return quantity;
    }

}
