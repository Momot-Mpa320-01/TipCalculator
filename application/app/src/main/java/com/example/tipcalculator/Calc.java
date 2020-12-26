package com.example.tipcalculator;

public class Calc {
    private double billAmount; // Сумма счёта
    private double percent; // Процент чаевых

    //Методы класса
    public double calculateTip(double billAmount, double percent) {
        return billAmount*percent;
    }
    public double calculateTotal(double billAmount, double percent) {
        return billAmount*(1+percent);
    }

    public double getBillAmount() {
        billAmount = Double.valueOf(String.format("%.2g%n", billAmount));
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public double getPercent() {
        percent=  Double.valueOf(String.format("%.2g%n", percent));
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
