package ai.ynt.quality.control.enums;

import ai.ynt.quality.common.enums.BaseEnum;

/**
 * 节点类型枚举
 *
 * @author vic
 * @date 2017-11-28 16:20
 */
public enum NodeTypeEnum implements BaseEnum {
    /**
     * 根节点
     */
    ROOT_NODE(1, "根节点"),

    /**
     * 全局节点
     */
    GLOBAL_NODE(2, "全局节点"),

    /**
     * 业务节点
     */
    BUSINESS_NODE(3, "业务节点"),

    /**
     * 参数节点
     */
    PARAM_NODE(4, "参数节点"),

    /**
     * 带预测器交互节点
     */
    PREDICT_INTERACTION_NODE(5, "带预测器交互节点"),

    /**
     * 普通交互节点
     */
    INTERACTION_NODE(6, "普通交互节点");


    /**
     * 键
     */
    private int key;

    /**
     * 描述
     */
    private String desc;

    /**
     * 键
     *
     * @return
     */
    @Override
    public Integer key() {
        return key;
    }

    /**
     * 描述
     *
     * @return
     */
    @Override
    public String desc() {
        return desc;
    }

    NodeTypeEnum(final Integer key, final String desc) {
        this.key = key;
        this.desc = desc;
    }
}
