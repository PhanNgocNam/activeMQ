package com.phanNgocNam.activeMQDemo.receiver;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.TextMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ProductReceiver {
    @JmsListener(destination = "order_products")
    public void receiveMessage(final Message message) throws JMSException {
        String messageData = null;
        String response = null;
        if(message instanceof TextMessage) {
            //1. read message data
            //2. ==> decode
            //3. check for quantity
            //4. make order or reject
            //5. send email
            System.out.println("Received: <" + message + ">");
        }
    }
}
