package ai.ynt.quality.control;

import ai.ynt.quality.control.utils.LogUtil;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 质检调度中心入口
 *
 * @author vic
 * @date 2018-10-08 17:07
 */
@SpringBootApplication
public class QualityControlCenterApplication {
    /**
     * 日志
     */
    private static Logger log = LogUtil.get();

    public static void main(String[] args) {
        SpringApplication.run(QualityControlCenterApplication.class, args);
        log.info("quality-control-center服务启动....");
    }
}
