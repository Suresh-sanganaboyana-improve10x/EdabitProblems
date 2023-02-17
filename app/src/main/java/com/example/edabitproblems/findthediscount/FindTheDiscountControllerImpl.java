package com.example.edabitproblems.findthediscount;

public class FindTheDiscountControllerImpl implements FindTheDiscountController{
    @Override
    public int getDiscount(String price, String discountPercentage) {
        int discount = 0;
        int finalPrice = 0;
        int priceInInt = Integer.parseInt(price);
        int discountPerInInt = Integer.parseInt(discountPercentage);
        discount = priceInInt*discountPerInInt/100;
        finalPrice = priceInInt-discount;
        return finalPrice;
    }
}
