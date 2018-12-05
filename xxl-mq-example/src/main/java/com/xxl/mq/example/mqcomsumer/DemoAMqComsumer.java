package com.xxl.mq.example.mqcomsumer;

import com.xxl.mq.client.consumer.IMqConsumer;
import com.xxl.mq.client.consumer.annotation.MqConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import static com.xxl.mq.client.consumer.annotation.MqConsumerType.QUEUE;

import java.util.Map;

/**
 * 消息模型 1/3 : QUEUE = 点对点模式, 消息进去队列之后, 只会被消费一次。但是,同一个Topic下只会有一个Consumer串行消费消息, 适用于严格限制并发的场景
 * Created by xuxueli on 16/8/28.
 */
@MqConsumer(value = "mqconsumer-01", type = QUEUE)
@Service 
public class DemoAMqComsumer implements IMqConsumer {
    private Logger logger = LoggerFactory.getLogger(DemoAMqComsumer.class);

    @Override
    public void consume(Map<String, String> data) throws Exception {
        logger.info("QUEUE(并行队列): {}消费一条消息:{}", "mqconsumer-01",  data);
    }

}
