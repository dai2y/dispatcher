package ai.ynt.quality.control;

import ai.ynt.quality.control.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * 质检测试入口
 *
 * @author vic
 * @date 2018-10-08 17:07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QualityControlCenterApplicationTests {
    /**
     * redis工具类
     */
    @Resource
    private RedisUtil redisUtil;

    /**
     * 测试Redis
     */
    @Test
    public void testRedis() {
        redisUtil.set("test", 1200);
    }
}
