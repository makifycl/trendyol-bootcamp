package notification;

import model.Company;
import model.PlanType;
import model.User;
import util.CompanyUtil;

public class Sms implements Channel{

    private String message;

    public Sms() {
    }

    public Sms(String message) {
        this.message = message;
    }

    @Override
    public void send(Company company, User user) {

        CompanyUtil.setCompanyAfterSmsNotification(company, PlanType.SMS);

        //TODO validation
        System.out.println("From   : " + company.getCompanyName());
        System.out.println("To     : " + user.getEmail());
        System.out.println("Message: " + getMessage());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
