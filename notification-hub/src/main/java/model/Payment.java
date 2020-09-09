package model;

import java.util.Date;
import java.util.Objects;

public class Payment {

    private Date paymentDate;

    private boolean isPaid;

    public Payment() {
    }

    public Payment(Date paymentDate, boolean isPaid) {
        this.paymentDate = paymentDate;
        this.isPaid = isPaid;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return isPaid == payment.isPaid &&
                Objects.equals(paymentDate, payment.paymentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentDate, isPaid);
    }
}
