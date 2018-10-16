package ai.ynt.quality.control.rocketmq;

import ai.ynt.quality.common.dto.Test;
import ai.ynt.quality.control.utils.JacksonUtil;
import ai.ynt.quality.control.utils.LogUtil;
import org.apache.rocketmq.spring.starter.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.starter.core.RocketMQListener;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * ActiveMQ消费者
 *
 * @author vic
 * @date 2017-09-18 16:27
 **/
@Component
@RocketMQMessageListener(topic = "${queue.topic}", consumerGroup = "${queue.consumerGroup}", consumeThreadMax = 10)
public class Consumer implements RocketMQListener<Test> {
    /**
     * 日志
     */
    private static Logger log = LogUtil.get();


    @Override
    public void onMessage(Test test) {
        StopWatch sw = new StopWatch();
        sw.start();
        log.info("消息处理开始...");
        log.info("收到消息" + JacksonUtil.toJSon(test));
        sw.stop();
        log.info("消息处理耗时：" + sw.getTotalTimeMillis() + "ms");
    }
}
