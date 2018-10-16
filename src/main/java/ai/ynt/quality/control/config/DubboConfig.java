package ai.ynt.quality.control.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Dubbo配置类
 *
 * @author vic
 * @date 2017-11-21 11:45
 */
@Configuration
@PropertySource("classpath:dubbo/dubbo-${spring.profiles.active}.properties")
@ImportResource({ "classpath:dubbo/*.xml" })
public class DubboConfig {

}
