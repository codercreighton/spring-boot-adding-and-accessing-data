package com.tts.subscriberList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.tts.subscriberList.subscriber.Subscriber;
import com.tts.subscriberList.subscriber.SubscriberRepository;
import com.tts.subscriberList.SubscriberConstruct;


@SpringBootApplication
public class SubscriberListApplication {
	private static final Logger logger = LoggerFactory.getLogger(SubscriberListApplication.class); //allows us to see our output in the console

	@Autowired
	SubscriberRepository subscriberRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SubscriberListApplication.class, args);
	}
	

//	//Subscriber Construct
//	@SubscriberConstruct
//	void seeSubscribers() {
//		for(Subscriber subscriber : subscriberRepository.findAll()) {
//			logger.info(subscriber.toString());
//			
//		}
//	}
}
