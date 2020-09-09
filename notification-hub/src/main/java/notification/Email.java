package notification;

import model.Company;
import model.User;

public class Email implements Channel{

    private String from;
    private String to;
    private String subject;
    private String message;

    public Email() {
    }

    public Email(String from, String to, String subject, String message) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    @Override
    public void send(Company company, User user) {
        //TODO validation
        System.out.println("From: " + getFrom());
        System.out.println("To: " + getTo());
        System.out.println("Subject: " + getSubject());
        System.out.println("Message: " + getMessage());
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
