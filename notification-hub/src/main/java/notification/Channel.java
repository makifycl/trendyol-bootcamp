package notification;

import model.Company;
import model.User;

public interface Channel {
    void send(Company company, User user);
}
