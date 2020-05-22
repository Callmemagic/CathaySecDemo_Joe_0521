package com.joe.cathaysecdemo_joe_0521.bean;

/**
 * author: Joe Cheng
 */
public class BondItem {
    String bondName;
    String ratio;
    String year;

    String refSalePrice;
    String refSaleRatio;
    String dueYear;

    public BondItem(String bondName, String ratio, String year, String refSalePrice, String refSaleRatio, String dueYear) {
        this.bondName = bondName;
        this.ratio = ratio;
        this.year = year;
        this.refSalePrice = refSalePrice;
        this.refSaleRatio = refSaleRatio;
        this.dueYear = dueYear;
    }

    public String getBondName() {
        return bondName;
    }

    public void setBondName(String bondName) {
        this.bondName = bondName;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRefSalePrice() {
        return refSalePrice;
    }

    public void setRefSalePrice(String refSalePrice) {
        this.refSalePrice = refSalePrice;
    }

    public String getRefSaleRatio() {
        return refSaleRatio;
    }

    public void setRefSaleRatio(String refSaleRatio) {
        this.refSaleRatio = refSaleRatio;
    }

    public String getDueYear() {
        return dueYear;
    }

    public void setDueYear(String dueYear) {
        this.dueYear = dueYear;
    }
}
