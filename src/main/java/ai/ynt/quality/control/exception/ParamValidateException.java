package ai.ynt.quality.control.exception;

import java.io.Serializable;

/**
 * 自定义validator失败会抛出的异常
 *
 * @author zhaoct
 * @date 2018-01-30 11:28
 */
public class ParamValidateException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -639907768985969506L;
    /**
     * 被检验的对象
     */
    public Object object;

    public ParamValidateException(Object object, String message) {
        super(message);
        this.object = object;
    }
}
