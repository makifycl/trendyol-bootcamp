package model;

import java.util.List;

public class CompanyDetails {

    private List<Plan> selectedPlans;

    private List<Payment> payments;

    public List<Plan> getSelectedPlans() {
        return selectedPlans;
    }

    public void setSelectedPlans(List<Plan> selectedPlans) {
        this.selectedPlans = selectedPlans;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
