package ai.ynt.quality.control.constant;

/**
 * 日期时间常量
 *
 * @author vic
 * @date 2017-10-11 15:52
 */
public class DateTimeConstant {
    /**
     * 毫秒
     */
    public static final long MS = 1;
    /**
     * 每秒钟的毫秒数
     */
    public static final long SECOND_MS = MS * 1000;
    /**
     * 每分钟的毫秒数
     */
    public static final long MINUTE_MS = SECOND_MS * 60;
    /**
     * 每小时的毫秒数
     */
    public static final long HOUR_MS = MINUTE_MS * 60;
    /**
     * 每天的毫秒数
     */
    public static final long DAY_MS = HOUR_MS * 24;
    /**
     * 每天的秒数
     */
    public static final long DAY_S = DAY_MS / 1000;
    /**
     * 每周的秒数
     */
    public static final long WEEK_S = DAY_S * 7;
}
