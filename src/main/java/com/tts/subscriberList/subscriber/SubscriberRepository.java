package com.tts.subscriberList.subscriber;

import org.springframework.data.repository.CrudRepository;

public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {

	//brings in CRUD statements for the database
}
