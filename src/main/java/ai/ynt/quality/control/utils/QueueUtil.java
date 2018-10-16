package ai.ynt.quality.control.utils;

import org.apache.rocketmq.spring.starter.core.RocketMQTemplate;

/**
 * 消息队列工具类
 *
 * @author vic
 * @date 2018-10-15 17:15
 */
public class QueueUtil {

    public QueueUtil() {

    }

    /**
     * 发送消息队列
     *
     * @param destination      目的地
     * @param rocketMQTemplate 队列模板
     * @param object           实体对象
     */
    public static void sendMessage(String destination, RocketMQTemplate rocketMQTemplate, Object object) {
        rocketMQTemplate.convertAndSend(destination, object);
    }
}
