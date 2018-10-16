package ai.ynt.quality.control.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 消息队列配置
 *
 * @author vic
 * @date 2018-10-15 17:55
 */
@Component
@ConfigurationProperties(prefix = "queue")
public class QueueConfig {
    /**
     * 主题
     */
    private String topic;
    /**
     * 消费组
     */
    private String consumerGroup;
    /**
     * 消费最大线程数
     */
    private Integer consumeThreadMax;
    /**
     * 标签
     */
    private String tag;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getConsumerGroup() {
        return consumerGroup;
    }

    public void setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
    }

    public Integer getConsumeThreadMax() {
        return consumeThreadMax;
    }

    public void setConsumeThreadMax(Integer consumeThreadMax) {
        this.consumeThreadMax = consumeThreadMax;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
