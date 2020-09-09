package util;

import exception.UnpaidInvoicesException;
import model.Company;
import model.CompanyPlanDetails;
import model.PlanType;

import java.util.List;

public class CompanyUtil {

    public static boolean isLimitExceed(Company company, PlanType planType) {

        CompanyPlanDetails companyPlanDetails = getDetails(company, planType);

        int planLimit = companyPlanDetails.getPlan().getLimit();
        int totalNotifications = companyPlanDetails.getTotalNotifications();

        return planLimit <= totalNotifications;
    }

    public static Company setNewPaymentMethod(Company company, PlanType planType) {
        CompanyPlanDetails companyPlanDetails = getDetails(company, planType);

        if (companyPlanDetails.getPlan().isFixedPlan()) {
            companyPlanDetails.setFinished(true);
            CompanyPlanDetails newPlanDetails = new CompanyPlanDetails(companyPlanDetails.getPlan(), companyPlanDetails.getTotalPrice());
            company.addCompanyPlanDetails(newPlanDetails);
        } else {
            companyPlanDetails.setTotalPrice(companyPlanDetails.getTotalPrice() + companyPlanDetails.getPlan().getExtraPrice());
        }

        return company;
    }

    public static void setCompanyAfterSmsNotification(Company company, PlanType planType) {
        checkPayments(company);

        CompanyPlanDetails companyPlanDetails;

        if (isLimitExceed(company, planType)) {
            System.out.println("****" + planType + " aşıldı****");
            Company updatedCompany = setNewPaymentMethod(company, planType);
            companyPlanDetails = getDetails(updatedCompany, planType);
        } else {
            System.out.println("****" + planType + " aşılmadı****");
            companyPlanDetails = getDetails(company, planType);
        }

        companyPlanDetails.setTotalNotifications(companyPlanDetails.getTotalNotifications() + 1);
        System.out.println("Price  : " + companyPlanDetails.getTotalPrice());
    }

    private static CompanyPlanDetails getDetails(Company company, PlanType planType) {
        CompanyPlanDetails companyPlanDetails = new CompanyPlanDetails();

        for(CompanyPlanDetails details: company.getCompanyPlanDetails()) {
            if (details.getPlan().getPlanType() == planType)
                companyPlanDetails = details;
        }

        return companyPlanDetails;
    }

    private static void checkPayments(Company company) {
        int totalOfUnpaid = 0;

        for (CompanyPlanDetails details : company.getCompanyPlanDetails()) {
            if (!details.isPaid()) {
                totalOfUnpaid++;
            }

            if (totalOfUnpaid > 0) {
                //TODO exception handling
                for (UnpaidInvoicesException.ExpLanguage expLanguage : UnpaidInvoicesException.ExpLanguage.values()) {
                    if (expLanguage.type.equals(company.getLanguage().toString())) {
                        throw new UnpaidInvoicesException(expLanguage);
                    }
                }
            }
        }

    }
}
