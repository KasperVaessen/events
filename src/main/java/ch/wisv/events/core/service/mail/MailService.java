package ch.wisv.events.core.service.mail;

import ch.wisv.events.core.model.order.Order;
import ch.wisv.events.core.model.ticket.Ticket;
import java.util.List;

/**
 * MailService interface.
 */
public interface MailService {

    /**
     * Method mail Order confirmation to Customer.
     *
     * @param order   of type Order
     * @param tickets of type List of Tickets
     */
    void sendOrderConfirmation(Order order, List<Ticket> tickets);

    /**
     * Method mails about a payment error.
     *
     * @param subject   of type String
     * @param exception of type Exception
     */
    void sendError(String subject, Exception exception);

    /**
     * Send mail about order reservation.
     *
     * @param order of type Order
     */
    void sendOrderReservation(Order order);
}
