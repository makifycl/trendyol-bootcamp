import model.*;
import notification.Channel;
import notification.Sender;
import notification.Sms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class NotificationHub {

    public static void main(String[] args) {

        Plan smsFixed = new Plan(1L, "SMS Sabit Kotalı", PlanType.SMS, 1000, 20.0, true, 0.0);
        Plan smsFlexible = new Plan(2L, "SMS Esnek Kotalı", PlanType.SMS, 2000, 30.0, false, 0.10);

        User user = new User("Akif", "akif@mail.com", "5528817092");
        User user2 = new User("Mustafa", "Mustafa@mail.com", "2222222222");

        Company company = new Company(1L, "Corp", new Date(), Languages.TR);

        List<CompanyPlanDetails> companyPlanDetails = new ArrayList<CompanyPlanDetails>();
        CompanyPlanDetails details = new CompanyPlanDetails(smsFlexible, smsFlexible.getPrice());
        details.setTotalNotifications(1999);

        companyPlanDetails.add(details);

        company.setCompanyPlanDetails(companyPlanDetails);


        Sms sms = new Sms("Hello");

        Sender sender = new Sender(Arrays.asList((Channel) sms));
        sender.send(company, Arrays.asList(user, user2));


        System.out.println(company.toString());
    }

}
