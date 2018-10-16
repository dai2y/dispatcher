package ai.ynt.quality.control.exception;

/**
 * 系统异常
 *
 * @author daiy
 * @date 2018-03-07 10:29
 */
public class SystemException extends Exception {
    private static final long serialVersionUID = 6515299930003488257L;

    public SystemException(){
        super("系统内部异常！");
    }
}
