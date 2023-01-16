package org.example;
public class Calculator {
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double rezult = purchaseAmount - (purchaseAmount * (Double.valueOf(discountAmount) / 100));
        if (discountAmount > 100){
            throw new ArithmeticException("Процент скидки не может быть равен > 100%");
        }
        if (discountAmount < 0){
            throw new ArithmeticException("Процент скидки не может быть меньше 0");

        }
        if (purchaseAmount < 0){
            throw new ArithmeticException("Сумма покупки не может быть отрицательной");
        }
        return rezult;
    }
}