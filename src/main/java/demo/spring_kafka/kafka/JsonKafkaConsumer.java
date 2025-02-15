package demo.spring_kafka.kafka;

import demo.spring_kafka.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    public static final Logger logger = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = {"jsonTopic"}, groupId = "myGroup")
    public void consume(User user) {
        logger.info("Consumed: " + user);
    }
}
