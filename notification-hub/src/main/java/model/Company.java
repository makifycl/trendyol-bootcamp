package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Company {

    private Long id;

    private String companyName;

    private Date registrationDate;

    private Languages language;

    private boolean isBlocked = false;

    private List<CompanyPlanDetails> companyPlanDetails = new ArrayList<CompanyPlanDetails>();

    private int totalUnpaidInvoices = 0;

    public Company() {
    }

    public Company(Long id, String companyName, Date registrationDate, Languages language) {
        this.id = id;
        this.companyName = companyName;
        this.registrationDate = registrationDate;
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Languages getLanguage() {
        return language;
    }

    public void setLanguage(Languages language) {
        this.language = language;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public List<CompanyPlanDetails> getCompanyPlanDetails() {
        return companyPlanDetails;
    }

    public void setCompanyPlanDetails(List<CompanyPlanDetails> companyPlanDetails) {
        this.companyPlanDetails = companyPlanDetails;
    }

    public int getTotalUnpaidInvoices() {
        return totalUnpaidInvoices;
    }

    public void setTotalUnpaidInvoices(int totalUnpaidInvoices) {
        this.totalUnpaidInvoices = totalUnpaidInvoices;
    }

    public void addCompanyPlanDetails(CompanyPlanDetails detail) {
        companyPlanDetails.add(detail);
    }

}
