package ai.ynt.quality.control.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志封装类
 *
 * @author vic
 * @date 2017-09-21 13:43
 */
public class LogUtil {

    private LogUtil() {

    }

    public static Logger get() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return LoggerFactory.getLogger(stackTrace[2].getClassName());
    }
}
