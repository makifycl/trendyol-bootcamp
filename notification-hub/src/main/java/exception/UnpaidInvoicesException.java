package exception;

import model.Languages;

public class UnpaidInvoicesException extends RuntimeException {

    private Languages languages;

    public enum ExpLanguage{
        TR("TR", "Ödenmemiş faturalardan dolayı bildirim gönderilemedi"),
        EN("EN", "Notification cannot send because of unpaid invoices");

        public String expMessage;
        public String type;

        ExpLanguage(String type, String expMessage) {
            this.type = type;
            this.expMessage = expMessage;
        }
    }

    public UnpaidInvoicesException(String message) {
        super(message);
    }

    public UnpaidInvoicesException(ExpLanguage expLanguage) {
        super(expLanguage.expMessage);
    }
}
