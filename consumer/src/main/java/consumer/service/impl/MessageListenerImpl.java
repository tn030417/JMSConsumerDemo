package consumer.service.impl;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;


public class MessageListenerImpl implements MessageListener{

	private static final Logger logger = Logger.getLogger(MessageListenerImpl.class);
	
	@Override
	public void onMessage(Message message) {
		try {
			TextMessage textMessage = (TextMessage) message;
			logger.info(textMessage.getText());			
			 message.acknowledge();
		} catch (JMSException e) {
			logger.error("Geska : " + e.getErrorCode());
			e.printStackTrace();
		}		
	}
}
