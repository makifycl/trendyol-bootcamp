package model;

import java.util.Objects;

public class Plan {

    private Long id;

    private String planName;

    private PlanType planType;

    private int limit;

    private double price;

    private boolean isFixedPlan;

    private double unitPrice;

    public Plan() {
    }

    public Plan(Long id, String planName, PlanType planType, int limit, double price, boolean isFixedPlan, double unitPrice) {
        this.id = id;
        this.planName = planName;
        this.planType = planType;
        this.limit = limit;
        this.price = price;
        this.isFixedPlan = isFixedPlan;
        this.unitPrice = unitPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public PlanType getPlanType() {
        return planType;
    }

    public void setPlanType(PlanType planType) {
        this.planType = planType;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFixedPlan() {
        return isFixedPlan;
    }

    public void setFixedPlan(boolean fixedPlan) {
        isFixedPlan = fixedPlan;
    }

    public double getExtraPrice() {
        return unitPrice;
    }

    public void setExtraPrice(double extraPrice) {
        this.unitPrice = extraPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plan plan = (Plan) o;
        return limit == plan.limit &&
                Double.compare(plan.price, price) == 0 &&
                isFixedPlan == plan.isFixedPlan &&
                Double.compare(plan.unitPrice, unitPrice) == 0 &&
                Objects.equals(id, plan.id) &&
                Objects.equals(planName, plan.planName) &&
                planType == plan.planType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, planName, planType, limit, price, isFixedPlan, unitPrice);
    }
}
