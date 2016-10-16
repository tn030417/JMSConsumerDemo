package consumer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import consumer.service.ConsumerService;

public class ConsumerServiceImpl implements ConsumerService{

	@Autowired
	DefaultMessageListenerContainer jmsContainer;
	
	public void stop(){
		try{
			jmsContainer.stop();
		}catch(JmsException e){
			System.out.println("" + e);
		}
	}
	
	public void start(){
		try{
			jmsContainer.start();
		}catch(JmsException e){
			System.out.println("" + e);
		}
	}
}
