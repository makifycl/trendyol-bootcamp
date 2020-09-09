package model;

import java.util.Date;

public class CompanyPlanDetails {

    private boolean isPaid = false;

    private Date registrationDate = new Date();

    private Date paymentDate;

    private int totalNotifications = 0;

    private double totalPrice = 0.0;

    private boolean isFinished = false;

    private Plan plan;

    public CompanyPlanDetails() {
    }

    public CompanyPlanDetails(Plan plan, double totalPrice) {
        this.plan = plan;
        this.totalPrice = totalPrice;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getTotalNotifications() {
        return totalNotifications;
    }

    public void setTotalNotifications(int totalNotifications) {
        this.totalNotifications = totalNotifications;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
