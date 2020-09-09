package notification;

import exception.UnpaidInvoicesException;
import model.Company;
import model.User;
import util.CompanyUtil;

import java.util.List;

public class Sender {

    private List<Channel> channels;
    private Channel channel;

    public Sender(Channel channel) {
        this.channel = channel;
    }

    public Sender(List<Channel> channels) {
        this.channels = channels;
    }

    public void send(Company company, List<User> users) {
        for (Channel channel: channels) {
           for (User user : users) {
              try {
                  channel.send(company, user);
              } catch (Exception e) {
                  throw new UnpaidInvoicesException(e.getMessage());
              }
           }
        }
    }


}
